package org.ict.finalprj.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static RetrofitClient instance = null;
    private static RetrofitiInterface retrofitiInterface;
    private static String baseUrl = "https://www.data.go.kr";

    private RetrofitClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitiInterface = retrofit.create(RetrofitiInterface.class);
    }

    public static RetrofitClient getInstance(){
        if(instance == null){
            instance = new RetrofitClient();
        }
        return instance;
    }

    public static RetrofitiInterface getRetrofitiInterface() {
        return  retrofitiInterface;
    }
}
