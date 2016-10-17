package com.android4dev.navigationview.mvp;


import com.android4dev.navigationview.model.CategoryResults;

import java.util.List;

/**
 * Created by TheAppExperts on 14/10/2016.
 */

public interface ListingActivityContract {

    interface IPresenter extends BasePresenter{
        /**
         * All API calls and calls to data sources local or remote
         * called by views
         */
        void displayCategoryList();
    }
    interface IView extends BaseView<IPresenter>{
        /**
         * All things which view should perform
         * call by presenter
         */

        void showProgresDialog();
        void dismissProgressDialog();
        void passDataAdapter(List<CategoryResults.Listing> listings);
    }
}
