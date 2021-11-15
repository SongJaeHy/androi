package org.ict.libapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import org.ict.libapi.retrofit.RecycleAdapter;
import org.ict.libapi.retrofit.RetrofitClient;
import org.ict.libapi.retrofit.RetrogitInterface;
import org.ict.libapi.vo.Example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RetrofitClient retrofitClient;
    private RetrogitInterface retrogitInterface;

    RecyclerView recyclerView;

    RecyclerView.Adapter lAdapter;

    final String KEY = "서울 열린데이터 광장 키";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofitClient = RetrofitClient.getInstance();
        retrogitInterface = RetrofitClient.getRetrogitInterface();

        recyclerView = (RecyclerView) findViewById(R.id.recyView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        retrogitInterface.getli(KEY, "/json/", "SeoulLibraryScheduleInfo/",1,5).enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example result = response.body();

                lAdapter = new RecycleAdapter(result.getSeoulLibraryScheduleInfo().getRow());

                recyclerView.setAdapter(lAdapter);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("요청 실패", "요청에 실패했습니다.");
            }
        });
    }
}