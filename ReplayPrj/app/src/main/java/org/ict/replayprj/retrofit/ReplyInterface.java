package org.ict.replayprj.retrofit;

import org.ict.replayprj.VO.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ReplyInterface {

    @GET("http://localhost:8181/replies/all/23.json")
    Call<Example> getReplyOffice(@Query("bno") Integer bno, @Query("rno") Integer rno);
}
