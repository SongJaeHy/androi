package org.ict.finaprj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.ict.finaprj.VO.Body;
import org.ict.finaprj.VO.Example;
import org.ict.finaprj.retrofit.RecycleAdapter;
import org.ict.finaprj.retrofit.RetrofitClient;
import org.ict.finaprj.retrofit.RetrogitInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private RetrofitClient retrofitClient;
    private RetrogitInterface retrogitInterface;
    private TextView tv1;

    RecyclerView recyclerView;

    RecyclerView.Adapter adapter;

    final String ServiceKey="jkRtzYldraCVyF7hwoPSnX%2Bi0MxXM6pwF1cpo39v8m8LRk%2Bcf%2FhO7k0qZeMscyBqBh1kciDmT7VfQ8js%2F%2BKLmQ%3D%3D";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofitClient = RetrofitClient.getInstance();
        retrogitInterface = RetrofitClient.getRetrogitInterface();

        recyclerView = (RecyclerView) findViewById(R.id.recle);
        tv1 = (TextView) findViewById(R.id.tv1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        String Service_key="jkRtzYldraCVyF7hwoPSnX%2Bi0MxXM6pwF1cpo39v8m8LRk%2Bcf%2FhO7k0qZeMscyBqBh1kciDmT7VfQ8js%2F%2BKLmQ%3D%3D";
        String pageNo = "1";
        String numOfRows = "10";
        String dataType = "json";
        String stnId = "109";

       retrogitInterface.getda(ServiceKey, 1).enqueue(new Callback<Body>() {
           @Override
           public void onResponse(Call<Body> call, Response<Body> response) {
               Body result = response.body();



               recyclerView.setAdapter(adapter);

           }

           @Override
           public void onFailure(Call<Body> call, Throwable t) {
                Log.d("요청 실패", "요청에 실패했습니다.");
           }
       });
    }
}