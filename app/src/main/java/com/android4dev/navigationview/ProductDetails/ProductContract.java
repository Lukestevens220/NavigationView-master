package com.android4dev.navigationview.ProductDetails;

import com.android4dev.navigationview.Category.CategoryContract;
import com.android4dev.navigationview.Category.CategoryResults;
import com.android4dev.navigationview.mvp.BasePresenter;
import com.android4dev.navigationview.mvp.BaseView;

import java.util.List;

/**
 * Created by TheAppExperts on 17/10/2016.
 */

public class ProductContract {

    interface IPresenter extends BasePresenter {
        /**
         * All API calls and calls to data sources local or remote
         * called by views
         */
        void displayProductList();
    }

    interface IView extends BaseView<ProductContract.IPresenter> {
        /**
         * All things which view should perform
         * call by presenter
         */

        void showProgresDialog();

        void dismissProgressDialog();

        void passDataAdapter(List<ProductDetailsResults.AssociatedProduct> listings);
    }
}
