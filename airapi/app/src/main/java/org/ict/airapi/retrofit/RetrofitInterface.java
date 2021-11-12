package org.ict.airapi.retrofit;

import android.util.Log;

import org.ict.airapi.VO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {
    @GET("http://openapi.seoul.go.kr:8088/69414f566f7165743731565770624c/json/ListAirQualityByDistrictService/1/5/")

    Call<Example> getair(@Query("key") String key, @Query("Type") String Type,
                         @Query("Service") String Service, @Query("Start_Index") Integer Start_Index,
                         @Query("End_Index") Integer End_Index);
}