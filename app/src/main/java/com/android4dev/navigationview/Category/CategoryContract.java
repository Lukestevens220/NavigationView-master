package com.android4dev.navigationview.Category;

import com.android4dev.navigationview.mvp.BasePresenter;
import com.android4dev.navigationview.mvp.BaseView;

import java.util.List;

/**
 * Created by TheAppExperts on 17/10/2016.
 */

public interface CategoryContract {

    interface IPresenter extends BasePresenter {
        /**
         * All API calls and calls to data sources local or remote
         * called by views
         */
        void displayCategoryList();
    }

    interface IView extends BaseView<com.android4dev.navigationview.Category.CategoryContract.IPresenter> {
        /**
         * All things which view should perform
         * call by presenter
         */

        void showProgresDialog();

        void dismissProgressDialog();

        void passDataAdapter(List<CategoryResults.Listing> listings);
    }
}