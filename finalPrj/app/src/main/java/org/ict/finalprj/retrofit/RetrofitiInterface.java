package org.ict.finalprj.retrofit;

import org.ict.finalprj.VO.Body;
import org.ict.finalprj.VO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitiInterface {

    @GET("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth?serviceKey=jkRtzYldraCVyF7hwoPSnX%2Bi0MxXM6pwF1cpo39v8m8LRk%2Bcf%2FhO7k0qZeMscyBqBh1kciDmT7VfQ8js%2F%2BKLmQ%3D%3D&returnType=json")
    Call<Example> getBox(@Query("key") String key);

}
