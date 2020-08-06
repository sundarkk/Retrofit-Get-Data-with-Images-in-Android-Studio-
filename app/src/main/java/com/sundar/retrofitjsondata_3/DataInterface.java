package com.sundar.retrofitjsondata_3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface DataInterface {


    @GET("photos")
    Call<List<DataModel>> getAllData();

}
