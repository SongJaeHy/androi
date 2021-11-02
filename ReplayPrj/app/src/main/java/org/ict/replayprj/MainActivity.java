package org.ict.replayprj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;

import org.ict.replayprj.VO.Example;
import org.ict.replayprj.retrofit.ReplyAdapter;
import org.ict.replayprj.retrofit.ReplyClient;
import org.ict.replayprj.retrofit.ReplyInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    // 비동기 요청을 담당하는 Retrofit관련 변수들 선언
    private ReplyClient replyClient;
    private ReplyInterface replyInterface;

    // 리사이클러뷰 부품 선언
    RecyclerView recyclerView;
    // 리사이클러 어댑터 부품 선언
    RecyclerView.Adapter rAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 레트로핏 요소들도 모두 연결합니다.
        replyClient = ReplyClient.getInstance();
        replyInterface = ReplyClient.getReplyInterface();

        // 리사이클뷰 요소들 먼저 연결
        recyclerView = (RecyclerView) findViewById(R.id.recyView);
        // 리사이클러뷰는 레이아웃 설정을 자바쪽에서 받아야 표현됩니다.
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        replyInterface.getReplyOffice(23, 23).enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                // 비동기 요청 성공시 처리할 내역
                // 비동기 데이터 저장
                Example example = response.body();
                // example 내주의 댓글목록 얻어서 Re 생성자 정달
                   

                recyclerView.setAdapter(rAdapter);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("댓글 실패", "댓글 실패했습니다.");
            }
        });
    }
}