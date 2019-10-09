package com.pranay.mynews;

import retrofit2.Call;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class API {
    private static final String key = "d9349311c8f345d2ba19f0e1d19fe4e9";
    public static postserivice postserivice = null;
    private static final String url = "https://newsapi.org/v2/";

    public interface postserivice {
        @GET("top-headlines?country=us&apiKey=d9349311c8f345d2ba19f0e1d19fe4e9")
        Call<Posts> getpostlist();
    }

    public static postserivice getPostserivice() {
        if (postserivice == null) {
            postserivice = (postserivice) new Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build().create(postserivice.class);
        }
        return postserivice;
    }
}
