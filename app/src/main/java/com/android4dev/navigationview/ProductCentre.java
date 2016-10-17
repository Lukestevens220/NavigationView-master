//package com.android4dev.navigationview;
//
//import android.content.Context;
//import android.util.Log;
//
//import com.android4dev.navigationview.adapter.ProductAdapter;
//import com.android4dev.navigationview.model.CategoryResults;
//import com.android4dev.navigationview.model.ProductDetailsResults;
//import com.android4dev.navigationview.observables.ObservableType;
//import com.android4dev.navigationview.service.ConnectionService;
//
//import java.util.ArrayList;
//
//import rx.Observer;
//import rx.android.schedulers.AndroidSchedulers;
//import rx.schedulers.Schedulers;
//
///**
// * Created by TheAppExperts on 16/10/2016.
// */
//
//public class ProductCentre {
//    private ObservableType observables;
//    private Context context;
//    private onSongsDownloadedListener listener;
//    private int musicType;
//
//    public static final int CATEGORY = 1;
//    public static final int PRODUCTDETAILS = 2;
//    public static final int PRODUCTSBTCATEGORY = 3;
//
//    public ProductCentre(onProductsDownloadedListener listener, Context context, int musicType){
//        this.context = context;
//        this.listener = listener;
//        this.musicType = musicType;
//
//        connectToService();
//        callService(musicType);
//    }
//
//    private void callService(int musicType) {
//        switch (musicType){
//            case 1: callCategoryService(); break;
//            case 2: callPopService(); break;
//            case 3: callRockService(); break;
//        }
//    }
//
//
//    private void connectToService() {
//        observables = ConnectionService.getConnectionService();
//    }
//
//
//    private void callCategoryService() {
//        observables.getCategoryList()
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
//                            iView.passDataAdapter(categories);
//                        }
//
//                    }
//                });
//    }
//
////    private void callPopService() {
////        observables.getProductDetails()
////                .onBackpressureBuffer()
////                .subscribeOn(Schedulers.newThread())
////                .observeOn(AndroidSchedulers.mainThread())
////                .subscribe(new Observer<ProductDetailsResults>() {
////                    @Override
////                    public void onCompleted() {
////
////                    }
////
////                    @Override
////                    public void onError(Throwable e) {
////
////                    }
////
////                    @Override
////                    public void onNext(ProductDetailsResults songResults) {
////
////                        ArrayList<ProductDetailsResults> songs = new ArrayList<Song>();
////                        songs.addAll(songResults.getResults());
////
////                        Log.i("MainActivity", "Size of array is " + songs.size());
////
////                        if (songs.size() > 0) {
////                            Log.d("SongCentre", "Number of songs: " + songs.size());
////                            ProductAdapter adapter = new ProductAdapter(songs, context );
////                            listener.onSongsDownloaded(adapter);
////                        }
////
////                    }
////                });
////    }
////
////    private void callRockService() {
////        observables.getRockSongList()
////                .onBackpressureBuffer()
////                .subscribeOn(Schedulers.newThread())
////                .observeOn(AndroidSchedulers.mainThread())
////                .subscribe(new Observer<SongResults>() {
////                    @Override
////                    public void onCompleted() {
////
////                    }
////
////                    @Override
////                    public void onError(Throwable e) {
////
////                    }
////
////                    @Override
////                    public void onNext(SongResults songResults) {
////
////                        ArrayList<Song> songs = new ArrayList<Song>();
////                        songs.addAll(songResults.getResults());
////
////                        Log.i("MainActivity", "Size of array is " + songs.size());
////
////                        if (songs.size() > 0) {
////                            Log.d("SongCentre", "Number of songs: " + songs.size());
////                            SongAdapter adapter = new SongAdapter(context, songs);
////                            listener.onSongsDownloaded(adapter);
////                        }
////
////                    }
////                });
////    }
//
//    public interface onProductsDownloadedListener{
//        public void onSongsDownloaded(ProductAdapter adapter);
//        public void onSongDownloadError(Throwable e);
//    }
//}
//}
