package org.ict.pickerprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    DatePicker dt1;
    Button btn1,btn2;
    TextView tv1,tv2;

    // 전역변수에 날짜 관련 정보 저장
    Integer year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        dt1 = (DatePicker) findViewById(R.id.dt1);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

        // 창부품이 연결되면, 먼저 1차적으로 날짜정보를 가져옵니다.
        year = dt1.getYear();
        month = dt1.getMonth()+1;
        day = dt1.getDayOfMonth();

        // 날짜 처리는 날짜가 변할때마다 변수에 다믄ㄴ것으로 처리합니다.
        // 창이 열리자마자 가녀오게 할 때는 dt1.getYeat()
        dt1.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Log.d("날짜", year + "년/" + (monthOfYear+1) + "월"+ dayOfMonth + "일");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(year + "년/" + month + "월/" + day + "일");
            }
        }); // 체크인 버튼 눌렀을떄

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(year + "년/" + month + "월/" + day + "일");
            }
        });

    }
}