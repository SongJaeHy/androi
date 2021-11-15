package org.ict.subwayapi.retrofit;


import org.ict.subwayapi.VO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {
    @GET("http://openapi.seoul.go.kr:8088/7a57646b5971657438326c68515744/json/CardSubwayStatsNew/1/5/20151101")
    Call<Example> getsubway(@Query("KEY")String KEY, @Query("TYPE") String TYPE, @Query("SERVICE")String SERVICE,
                            @Query("START_INDEX")Integer START_INDEX, @Query("END_INDEX") Integer END_INDEX, @Query("USE_DT") String USE_DT);

}
