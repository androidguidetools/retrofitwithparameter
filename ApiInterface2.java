package com.retrofitdemo.retrofitlearnigtopics.rest;



import com.retrofitdemo.retrofitlearnigtopics.model.FruitModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by KP on 4/10/2018.
 */

public interface ApiInterface2 {

    @POST("getCalaries.php")
    Call<List<FruitModel>> getAppList(@Query("item_type")String item_type);
}
