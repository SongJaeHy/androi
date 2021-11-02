package org.ict.replayprj.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ReplyClient {

    private static ReplyClient instance = null;
    private static ReplyInterface replyInterface;
    private static String baseUrl = "http://10.0.2.2:8181";

    private ReplyClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        replyInterface = retrofit.create(ReplyInterface.class);
    }

    public static ReplyClient getInstance(){
        if(instance==null){
            instance = new ReplyClient();
        }
        return instance;
    }

    public static ReplyInterface getReplyInterface(){
        return replyInterface;
    }
}
