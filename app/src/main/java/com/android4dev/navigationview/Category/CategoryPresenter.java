package com.android4dev.navigationview.Category;

import android.content.Context;
import android.util.Log;

import com.android4dev.navigationview.mvp.BasePresenter;
import com.android4dev.navigationview.mvp.BaseView;
import com.android4dev.navigationview.mvp.ListingActivityContract;
import com.android4dev.navigationview.observables.ObservableType;
import com.android4dev.navigationview.service.ConnectionService;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by TheAppExperts on 17/10/2016.
 */

public class CategoryPresenter implements CategoryContract.IPresenter {

    CategoryContract.IView iView;
    private Context context;
    //private ProductCentre.onSongsDownloadedListener listener;

    private ObservableType observables =
            ConnectionService.getConnectionService();

    public CategoryPresenter(CategoryContract.IView iView){
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
                            Log.d("Category", "Categories: " + categories.size());
                            iView.passDataAdapter(categories);
                        }

                    }
                });
    }

    @Override
    public void start() {
        iView.setPresenter(com.android4dev.navigationview.Category.CategoryPresenter.this);

    }

}