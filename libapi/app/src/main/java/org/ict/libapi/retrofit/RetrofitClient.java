package org.ict.libapi.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;
    private static RetrogitInterface retrogitInterface;
    private static  String baseUrl = "http://openapi.seoul.go.kr";

    private RetrofitClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrogitInterface = retrofit.create(RetrogitInterface.class);
    }

    public static RetrofitClient getInstance(){
        if(instance == null){
            instance = new RetrofitClient();
        }
        return instance;
    }

    public static RetrogitInterface getRetrogitInterface(){
        return retrogitInterface;
    }
}
