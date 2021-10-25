package org.ict.pickerprj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    // 창 부품 선언
    TimePicker tb1;
    DatePicker dt1;
    Button btn1, btn2;
    TextView tv1, tv2;

    Integer year, month, day;
    int hour, minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        tb1 = (TimePicker) findViewById(R.id.tb1);
        dt1 = (DatePicker) findViewById(R.id.dt1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);


        // 출근버튼 처리
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 시간을 얻어서 tv1에 출력해줍니다.(연월일시분)
                int year = dt1.getYear();
                int month =(dt1.getMonth()+1);
                int day = dt1.getDayOfMonth();
                int hour = tb1.getHour();
                int min = tb1.getMinute();

                tv1.setText(year + "년/" + month + "월/" + day + "일/" +hour + "시/" + minute + "분");

                // 2. btn2와 tv2를 활성화상태로 만들고, btn1은 못 쓰게 만들어야함.
               btn2.setEnabled(true);
               btn1.setEnabled(false);
            }
        });

        // 퇴근버튼 처리
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 현재 시간 얻어오기
                

                // 1. 시간을 얻어서 tv2에 출력해줍니다.(연월일시분)
                int year = dt1.getYear();
                int month =(dt1.getMonth()+1);
                int day = dt1.getDayOfMonth();
                int hour = tb1.getHour();
                int min = tb1.getMinute();
                dt1.updateDate(year, month, day);
                tv2.setText(year + "년/" + month + "월/" + day + "일/" +hour + "시/" + minute + "분");

                btn2.setEnabled(false);

            }
        });

    }
}