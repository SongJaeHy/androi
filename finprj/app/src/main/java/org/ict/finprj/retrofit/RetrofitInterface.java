package org.ict.finprj.retrofit;

import org.ict.finprj.VO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("http://apis.data.go.kr/B553077/api/open/sdsc2/storeZoneOne?serviceKey=&key=9176&type=json")
    Call<Example> getdata(@Query("key") String key, @Query("servicekey") String servicekey);
}
