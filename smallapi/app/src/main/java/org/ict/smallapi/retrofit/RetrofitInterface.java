package org.ict.smallapi.retrofit;

import org.ict.smallapi.vo.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {
    @GET("http://openapi.seoul.go.kr:8088//json/SeoulSmallLibraryInfo/1/5/")

    Call<Example> getsma(@Query("Key") String key, @Query("Type") String Type,
                         @Query("Service") String Service, @Query("Start_Index") Integer Start_Index,
                         @Query("End_Index") Integer End_Index);
}
