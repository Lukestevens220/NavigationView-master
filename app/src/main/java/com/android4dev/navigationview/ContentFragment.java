package com.android4dev.navigationview;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android4dev.navigationview.Category.CategoryAdapter;
import com.android4dev.navigationview.Category.CategoryResults;
import com.android4dev.navigationview.ProductDetails.ProductAdapter;
import com.android4dev.navigationview.mvp.ListingActivityContract;
import com.android4dev.navigationview.mvp.ListingListPresenter_Impl;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Admin on 04-06-2015.
 */
public class ContentFragment extends Fragment implements ListingActivityContract.IView {

        ListingActivityContract.IPresenter mPresenter;
        ListingListPresenter_Impl listingListPresenter_;
private RecyclerView recyclerView;
private ProductAdapter adapter;
private ProgressDialog progressDialog;
private SwipeRefreshLayout swipeRefreshLayout;
//private SongCentre.onSongsDownloadedListener fragment;

@Override
public void onResume(){

        super.onResume();
        listingListPresenter_.start();
        }

@Override
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.content_fragment,container,false);

        listingListPresenter_= new ListingListPresenter_Impl(this);
        initialiseRecyclerView(v);
        //initialiseSwipeRefreshLayout(v);
        listingListPresenter_.displayCategoryList();


        return v;
        }


private void initialiseRecyclerView(View v) {
        recyclerView = (RecyclerView)v.findViewById(R.id.list);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        }

private void initialiseProgressDialog() {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        }

//@Override
//public void onSongsDownloaded(ProductAdapter adapter) {
//        this.adapter = adapter;
//        recyclerView.setAdapter(adapter);
//        //adapter.notifyDataSetChanged();
//        hideProgressDialog();
//        swipeRefreshLayout.setRefreshing(false);
//        }

private void hideProgressDialog() {
        if (progressDialog != null) {
        progressDialog.dismiss();
        progressDialog = null;
        }

        }


@Override
public void showProgresDialog() {

        }

@Override
public void dismissProgressDialog() {
        hideProgressDialog();
        }

    @Override
    public void passDataAdapter(List<CategoryResults.Listing> listings) {
        recyclerView.setAdapter(new CategoryAdapter(listings, getContext()));

    }


@Override
public void setPresenter(@NonNull ListingActivityContract.IPresenter presenter) {
        mPresenter= checkNotNull(presenter);

        }


//        connectToService();
//        listingListPresenter_impl= new ListingListPresenter_Impl(this);
//        initialiseRecyclerView(v);
//        //fragment = this;
//        listingListPresenter_impl.displayCategoryList();
//
//
//        return v;
//    }
//
//
//    private void initialiseRecyclerView(View v) {
//        recyclerView = (RecyclerView) v.findViewById(R.id.list);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//    }
//
//    private void initialiseProgressDialog() {
//        progressDialog = new ProgressDialog(getActivity());
//        progressDialog.setMessage("Loading...");
//        progressDialog.setCancelable(false);
//        progressDialog.show();
//
//    }
//
//
//    private void hideProgressDialog() {
//        if (progressDialog != null) {
//            progressDialog.dismiss();
//            progressDialog = null;
//        }
//
//    }
//
//
//    @Override
//    public void showProgresDialog() {
//
//    }
//
//    @Override
//    public void dismissProgressDialog() {
//        hideProgressDialog();
//    }
//
//    @Override
//    public void passDataAdapter(List<CategoryResults.Listing> listings) {
//        recyclerView.setAdapter(new ProductAdapter(listings, getContext()));
//    }
//
//
//    @Override
//    public void setPresenter(ListingActivityContract.IPresenter presenter) {
//        mPresenter= checkNotNull(presenter);
//
//    }
//    private void callService() {
//        callCategoryService();
//        }
//
//
//
//    private void connectToService() {
//        product_api = ConnectionService.getConnectionService();
//    }
//
//
//    private void callCategoryService() {
//        product_api.getCategoryList()
//                .onBackpressureBuffer()
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<CategoryResults>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(CategoryResults categoryResults) {
//
//                        ArrayList<CategoryResults.Listing> categories = new ArrayList<CategoryResults.Listing>();
//                        categories.addAll(categoryResults.getListing());
//
//                        Log.i("MainActivity", "Size of array is " + categories.size());
//
//                        if (categories.size() > 0) {
//                            Log.d("ProductCentre", "Number of products: " + categories.size());
//                            //iView.passDataAdapter(categories);
//                        }
//
//                    }
//                });
    }

//    private void callPopService() {
//        product_api.getProductDetails()
//                .onBackpressureBuffer()
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<ProductDetailsResults>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(ProductDetailsResults songResults) {
//
//                        ArrayList<ProductDetailsResults> songs = new ArrayList<ProductDetailsResults>();
//                        songs.addAll(songResults.getResults());
//
//                        Log.i("MainActivity", "Size of array is " + songs.size());
//
//                        if (songs.size() > 0) {
//                            Log.d("SongCentre", "Number of songs: " + songs.size());
//                            ProductAdapter adapter = new ProductAdapter(songs, context );
//                            listener.onSongsDownloaded(adapter);
//                        }
//
//                    }
//                });
//    }
//
//    private void callRockService() {
//        observables.getRockSongList()
//                .onBackpressureBuffer()
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<SongResults>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(SongResults songResults) {
//
//                        ArrayList<Song> songs = new ArrayList<Song>();
//                        songs.addAll(songResults.getResults());
//
//                        Log.i("MainActivity", "Size of array is " + songs.size());
//
//                        if (songs.size() > 0) {
//                            Log.d("SongCentre", "Number of songs: " + songs.size());
//                            SongAdapter adapter = new SongAdapter(context, songs);
//                            listener.onSongsDownloaded(adapter);
//                        }
//
//                    }
//                });
//    }

