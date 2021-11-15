package org.ict.smallapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import org.ict.smallapi.retrofit.RecycleAdapter;
import org.ict.smallapi.retrofit.RetrofitClient;
import org.ict.smallapi.retrofit.RetrofitInterface;
import org.ict.smallapi.vo.Example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RetrofitClient retrofitClient;
    private RetrofitInterface retrofitInterface;

    RecyclerView recyclerView;

    RecyclerView.Adapter sAdapter;

    final String KEY = "서울 열린데이터 광장 키";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofitClient = RetrofitClient.getInstance();
        retrofitInterface = RetrofitClient.getRetrofitInterface();

        recyclerView = (RecyclerView) findViewById(R.id.recyView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        retrofitInterface.getsma(KEY, "/json/", "SeoulSmallLibraryInfo", 1, 5).enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example result = response.body();

                sAdapter = new RecycleAdapter(result.getSeoulSmallLibraryInfo().getRow());

                recyclerView.setAdapter(sAdapter);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("요청 실패", "요청에 실패했습니다.");
            }
        });
    }
}