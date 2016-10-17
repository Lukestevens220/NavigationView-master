package com.android4dev.navigationview.ProductsByCategory;

import com.android4dev.navigationview.Category.CategoryContract;
import com.android4dev.navigationview.Category.CategoryResults;
import com.android4dev.navigationview.mvp.BasePresenter;
import com.android4dev.navigationview.mvp.BaseView;

import java.util.List;

/**
 * Created by TheAppExperts on 17/10/2016.
 */

public interface ProductByCategoryContract {

    interface IPresenter extends BasePresenter {
        /**
         * All API calls and calls to data sources local or remote
         * called by views
         */
        void displayProductsByCategoryList();
    }

    interface IView extends BaseView<CategoryContract.IPresenter> {
        /**
         * All things which view should perform
         * call by presenter
         */

        void showProgresDialog();

        void dismissProgressDialog();

        void passDataAdapter(List<ProductsByCategoryResults.Listing> listings);
    }
}
