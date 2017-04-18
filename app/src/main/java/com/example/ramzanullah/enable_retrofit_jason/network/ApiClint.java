package com.example.ramzanullah.enable_retrofit_jason.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by RamzanUllah on 18-Apr-17.
 */

public class ApiClint {
    public static final String BASE_URL = "https://raw.githubusercontent.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit;
    }
}
