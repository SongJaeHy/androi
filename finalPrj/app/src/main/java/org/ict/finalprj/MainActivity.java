package org.ict.finalprj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import org.ict.finalprj.VO.Body;
import org.ict.finalprj.VO.Example;
import org.ict.finalprj.retrofit.RecycleAdapter;
import org.ict.finalprj.retrofit.RetrofitClient;
import org.ict.finalprj.retrofit.RetrofitiInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

        private RetrofitClient retrofitClient;
        private RetrofitiInterface retrofitiInterface;

        RecyclerView recyclerView;

        RecyclerView.Adapter rAdapter;

        final String KEY = "";

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            retrofitClient = RetrofitClient.getInstance();
            retrofitiInterface = RetrofitClient.getRetrofitiInterface();

            recyclerView = (RecyclerView) findViewById(R.id.recyView);

            LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(layoutManager);

            retrofitiInterface.getBox(KEY).enqueue(new Callback<Example>() {
                @Override
                public void onResponse(Call<Example> call, Response<Example> response) {

                    Example result = response.body();

                    rAdapter = new RecycleAdapter(result.getResponse().getBody().getItems());

                    recyclerView.setAdapter(rAdapter);
                }

                @Override
                public void onFailure(Call<Example> call, Throwable t) {
                    Log.d("요청 실패", "요청실패했습니다.");
                }
            });
        }
    }