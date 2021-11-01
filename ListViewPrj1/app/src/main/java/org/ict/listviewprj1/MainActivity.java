package org.ict.listviewprj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 리스트뷰 선언
    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 리스트뷰 연결
        lv1 = (ListView) findViewById(R.id.lv1);

        // 리스트뷰에 적용할 목록
        // 가고 싶은 여행지 15개
        final String[] trips = {
                "중국", "독도", "캐나다", "미국", "아프리카", "브라질", "영국", "멕시코", "케냐", "러시아"
                , "호주", "콩고", "이란", "네팔", "아르헨티나"
        };

        // 이스트뷰는 AdapterView를 상속해 만들어졌음.
        // 생성시 스타일과 출력될 .xml화면(this를 주면 자동으로 setContentView에서 설정한\ 파일로 잡힙니다.)
        // 스타일, 그리고 출력자료를 파라미터로 순서대로 넣습니다.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, trips);
        // lv1에 adapter내용을 적용
        lv1.setAdapter(adapter);

        // 위임시 클릭 이벤트 처리
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("parent확인", parent + "");
                Log.d("view확인", view + "");
                Log.d("position확인", position + "");
                Log.d("id확인", id + "");
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                // 인덱스번호를 이용해 클릭하면 Toast형태로
                // 클릭한 도시면이 뜨도록 만들어주세요.

                Toast.makeText(getApplicationContext(), trips[position]+"", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


    }
}