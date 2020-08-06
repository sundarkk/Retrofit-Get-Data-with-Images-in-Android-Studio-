package com.sundar.retrofitjsondata_3;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

private static final String Baseurl = "https://jsonplaceholder.typicode.com/";
private static Retrofit retrofit;

        public static Retrofit getRetrofit() {
            if (retrofit == null) {

                 retrofit = new Retrofit.Builder()
                         .baseUrl(Baseurl)
                         .addConverterFactory(GsonConverterFactory.create())
                         .build();
            }
            return retrofit;
        }

}
