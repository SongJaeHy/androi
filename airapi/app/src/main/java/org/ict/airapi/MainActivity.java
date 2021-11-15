package org.ict.airapi;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.ict.airapi.VO.Example;
import org.ict.airapi.retrofit.RecycleAdapter;
import org.ict.airapi.retrofit.RetrofitClient;
import org.ict.airapi.retrofit.RetrofitInterface;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    // 비동기 요청을 담당하는 Retrofit관련 변수들 선언
    private RetrofitClient retrofitClient;
    private RetrofitInterface retrofitInterface;

    // 리사이클러류 부품 선언
    RecyclerView recyclerView;
    // 리사이클러 어댑터 부품 선언
    RecyclerView.Adapter rAdapter;
    // 상수로 본인 key값을 저장합니다.
    final String KEY = "서울 열린데이터 광장 키";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 레트로핏 요소들도 모두 연결합니다.
        retrofitClient = RetrofitClient.getInstance();
        retrofitInterface = RetrofitClient.getRetrofitInterface();

        // 리사이클러뷰 요소들 먼저 연결합니다.
        recyclerView = (RecyclerView) findViewById(R.id.recyView);
        // 리사이클러뷰는 레이아웃 설정을 자바쪽에서 받아야 표현됩니다.
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // 화면이 켜졌을때 비동기 요청으로 데이터를 받아오고,
        // 받아온 데이터를 리사이클러 뷰 내부에 세팅하도록 처리
        retrofitInterface.getair(KEY, "/json/","ListAirQualityByDistrictService/",1,5).enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                // 비동기 요청 성공시 처리할 내역
                // 비동기 데이터 저장
                Example result = response.body();

                rAdapter = new RecycleAdapter(result.getListAirQualityByDistrictService().getRow());
                // 리사이클러 뷰에 RecycleAdapter를 전달해서
                // 카드뷰 양식으로 반복하도록 처리
                recyclerView.setAdapter(rAdapter);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                // 비동기 요청 실패시 처리할 내역
                Log.d("요청실패", "요청실패했습니다.");
            }
        });


    }
}