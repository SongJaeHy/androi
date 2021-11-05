package org.ict.finprj.retrofit;

import org.ict.finprj.VO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("http://apis.data.go.kr/B553077/api/open/sdsc2/storeZoneOne?serviceKey=jkRtzYldraCVyF7hwoPSnX%2Bi0MxXM6pwF1cpo39v8m8LRk%2Bcf%2FhO7k0qZeMscyBqBh1kciDmT7VfQ8js%2F%2BKLmQ%3D%3D&key=9176&type=json")
    Call<Example> getdata(@Query("servicekey") String servicekey, @Query("pageNo") Integer pageNo);
}
