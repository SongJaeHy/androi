package org.ict.listview2prj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    EditText et1;
    Button btn1;
    ListView li1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 창부품 연결
        et1 = (EditText) findViewById(R.id.et1);
        btn1 = (Button) findViewById(R.id.btn1);
        li1 = (ListView) findViewById(R.id.li1);

        // 리스트 생성
        // 리스트로 올 수 있는것은 배열([]), ArrayList등입니다.
        // 가변적으로 변동을 주기 위해서는 ArrayList가 옵니다.
        final ArrayList<String> trips = new ArrayList<String>();

        // 위의 목록을 토대로 자료가들어갈 Adapter 생성
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, trips);

        li1.setAdapter(adapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // addBtn 클릭시, et1에 있던 요소를 ArrayList에 .add()로 넣습니다.
                trips.add(et1.getText().toString());
                // 어댑터에 추가된 리스트로 갱신 반영해주기.
                adapter.notifyDataSetChanged();

                et1.setText("");
            }
        });

        // 삭제는 추가된 요소를 길게 클릭하면(Long click) 삭제되도록 처리
        li1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                // 위쪽 파라미터들을 토대로 trips.remove()를 이용해
                // 길게 클릭한 요소가 삭제되게 완성해보세요.
                Log.d("클릭된 욧소", position+"");
                trips.remove(position);

                // 삭제된 리스트를 어탭터에 반영
                adapter.notifyDataSetChanged();

                // false로 두면 됨
                return false;
            }
        });

    }
}