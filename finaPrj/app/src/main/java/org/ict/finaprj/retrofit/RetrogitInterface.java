package org.ict.finaprj.retrofit;

import org.ict.finaprj.VO.Body;
import org.ict.finaprj.VO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrogitInterface {

    @GET("http://apis.data.go.kr/1360000/VilageFcstMsgService/getSeaFcst?serviceKey=jkRtzYldraCVyF7hwoPSnX%2Bi0MxXM6pwF1cpo39v8m8LRk%2Bcf%2FhO7k0qZeMscyBqBh1kciDmT7VfQ8js%2F%2BKLmQ%3D%3D&pageNo=1&numOfRows=10&dataType=XML&regId=12A20100")
    Call<Body> getda(@Query("ServiceKey") String ServiceKey, @Query("pageNo") Integer pageNo);
}
