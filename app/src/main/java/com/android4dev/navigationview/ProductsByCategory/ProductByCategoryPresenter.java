package com.android4dev.navigationview.ProductsByCategory;

import android.content.Context;
import android.util.Log;

import com.android4dev.navigationview.Category.CategoryContract;
import com.android4dev.navigationview.Category.CategoryResults;
import com.android4dev.navigationview.observables.ObservableType;
import com.android4dev.navigationview.service.ConnectionService;

import java.util.ArrayList;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by TheAppExperts on 17/10/2016.
 */

public class ProductByCategoryPresenter implements ProductByCategoryContract.IPresenter {

    ProductByCategoryContract.IView iView;
    private Context context;
    //private ProductCentre.onSongsDownloadedListener listener;

    private ObservableType observables =
            ConnectionService.getConnectionService();

    public ProductByCategoryPresenter(ProductByCategoryContract.IView iView) {
        this.iView = iView;
    }

    @Override
    public void displayProductsByCategoryList() {
        observables.getProductsByCategory()
                .onBackpressureBuffer()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ProductsByCategoryResults>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ProductsByCategoryResults categoryResults) {

                        ArrayList<ProductsByCategoryResults.Listing> categories = new ArrayList<ProductsByCategoryResults.Listing>();
                        categories.addAll(categoryResults.getListings());

                        Log.i("MainActivity", "Size of array is " + categories.size());

                        if (categories.size() > 0) {
                            Log.d("SongCentre", "Number of songs: " + categories.size());
                            iView.passDataAdapter(categories);
                        }

                    }
                });
    }

    @Override
    public void start() {
        iView.setPresenter(com.android4dev.navigationview.ProductsByCategory.ProductByCategoryPresenter.this);

    }
}
