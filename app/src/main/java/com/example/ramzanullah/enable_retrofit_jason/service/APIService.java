package com.example.ramzanullah.enable_retrofit_jason.service;


import com.example.ramzanullah.enable_retrofit_jason.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by RamzanUllah on 18-Apr-17.
 */

public interface APIService {

    @GET("RamzanTingku/Enable-Login/master/jesonData.jeson")
    Call<List<User>> getUserData();
}

}
