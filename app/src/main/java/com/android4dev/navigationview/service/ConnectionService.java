package com.android4dev.navigationview.service;

import android.util.Log;

import com.android4dev.navigationview.constants.constants;
import com.android4dev.navigationview.observables.ObservableType;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by TheAppExperts on 14/10/2016.
 */

public class ConnectionService {

    private static Retrofit retrofit = null;
    private static OkHttpClient okHttpClient;

    public static ObservableType getConnectionService(){
        okHttpClient = buildClient();
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    //    .client(okHttpClient)
                    .build();
        }
        return retrofit.create(ObservableType.class);
    }

    public static OkHttpClient buildClient() {
//
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        //  builder.addNetworkInterceptor(new ResponseCacheInterceptor());
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
// add logging as last interceptor

        builder.addInterceptor(interceptor).build();
        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Response response = chain.proceed(chain.request());
                // Do anything with response here
                //if we ant to grab a specific cookie or something..

                Log.i("Response", response.toString());
                return response;
            }
        });

        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                //this is where we will add whatever we want to our request headers.
                Request request = chain.request().newBuilder().addHeader("Accept", "application/json").build();
                return chain.proceed(request);
            }
        });
        return new OkHttpClient();

    }


}
