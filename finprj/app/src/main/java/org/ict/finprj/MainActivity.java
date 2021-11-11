package org.ict.finprj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import org.ict.finprj.VO.Example;
import org.ict.finprj.retrofit.RecycleAdapter;
import org.ict.finprj.retrofit.RetrofitClient;
import org.ict.finprj.retrofit.RetrofitInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RetrofitClient retrofitClient;
    private RetrofitInterface retrofitInterface;

        RecyclerView recyclerView;

        RecyclerView.Adapter adapter;

        final String serviceKEY = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofitClient = RetrofitClient.getInstance();
        retrofitInterface = RetrofitClient.getRetrofitInterface();

        recyclerView = (RecyclerView) findViewById(R.id.recyView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        retrofitInterface.getdata("9176", "").enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Example result = response.body();

                adapter = new RecycleAdapter(result.getBody().getItems());

                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("요청실패", "요청에 실패했습니다.");
            }
        });

    }
}