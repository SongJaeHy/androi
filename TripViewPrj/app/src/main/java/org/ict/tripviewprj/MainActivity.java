package org.ict.tripviewprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // 창부품 생성
    ListView li1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 창부품 연결
        li1 = (ListView) findViewById(R.id.li1);

        // 부품에 넣을 리스트 생성
        final String[] trips = {
                "서울", "부산", "울릉도", "상하이"," 하와이", "영국","파리","캘리포니아",
                "우크라니아","아프리카","방콕","로마","스페인","상하이","캘리포니아"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, trips);
        li1.setAdapter(adapter);

        li1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                intent.putExtra("cityName", trips[position]);
                // 국기 표현시 알맞은 그림을 택하기 위해 전송
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }
}