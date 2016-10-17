package com.android4dev.navigationview.observables;

import com.android4dev.navigationview.constants.constants;
import com.android4dev.navigationview.model.CategoryResults;
import com.android4dev.navigationview.model.ProductDetailsResults;
import com.android4dev.navigationview.model.ProductsByCategoryResults;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by TheAppExperts on 14/10/2016.
 */

public interface ObservableType {

    //get the url for category of men
    @GET(constants.CATEGORY_MEN_URL)
    public Observable<CategoryResults> getCategoryList();

    //get the url for products by category
    @GET(constants.ProductsByCategory_URL)
    Observable<ProductsByCategoryResults> getProductsByCategory(@Path("id") int id);

    //get the url for product details
    @GET(constants.ProductDetails_URL)
    Observable<ProductDetailsResults> getProductDetails(@Path("id") int id);
}
