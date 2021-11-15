package org.ict.libapi.retrofit;

import org.ict.libapi.vo.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrogitInterface {
    @GET("http://openapi.seoul.go.kr:8088//json/SeoulLibraryScheduleInfo/1/5/")

    Call<Example> getli(@Query("KEY")String KEY, @Query("Type") String TYPE,
                        @Query("SERVICE") String Service, @Query("Start_Index") Integer Start_Index,
                        @Query("End_Index") Integer End_Index);
}
