package org.ict.busapi.retrofit;

import org.ict.busapi.VO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("http://openapi.seoul.go.kr:8088//json/CardSubwayStatsNew/1/5/20151101")

    Call<Example> getbus(@Query("KEY") String key, @Query("TYPE") String type,
                         @Query("SERVICE") String service, @Query("START_INDEX") Integer start_index,
                         @Query("END_INDEX") Integer end_index, @Query("USER_MON") String user_moon);
}
