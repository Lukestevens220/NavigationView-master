package com.android4dev.navigationview.mvp;

import android.content.Context;
import android.util.Log;

//import com.android4dev.navigationview.ProductCentre;
import com.android4dev.navigationview.model.CategoryResults;
import com.android4dev.navigationview.observables.ObservableType;
import com.android4dev.navigationview.service.ConnectionService;

import java.util.ArrayList;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by TheAppExperts on 14/10/2016.
 */

public class ListingListPresenter_Impl implements ListingActivityContract.IPresenter {

    ListingActivityContract.IView iView;
    private Context context;
    //private ProductCentre.onSongsDownloadedListener listener;

    private ObservableType observables =
            ConnectionService.getConnectionService();

    public ListingListPresenter_Impl(ListingActivityContract.IView iView){
        this.iView=iView;
    }

    @Override
    public void displayCategoryList() {
        observables.getCategoryList()
                .onBackpressureBuffer()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CategoryResults>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(CategoryResults categoryResults) {

                        ArrayList<CategoryResults.Listing> categories = new ArrayList<CategoryResults.Listing>();
                        categories.addAll(categoryResults.getListing());

                        Log.i("MainActivity", "Size of array is " + categories.size());

                        if (categories.size() > 0) {
                            Log.d("ProductCentre", "Number of products: " + categories.size());
                            iView.passDataAdapter(categories);
                        }

                    }
                });
    }

    @Override
    public void start() {
        iView.setPresenter(ListingListPresenter_Impl.this);

    }

}
