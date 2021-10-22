package org.ict.widgetprj3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    // 창부품 선언
    Button btn1;
    TextView tv1;
    Boolean bool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 초기화
        bool = true;
         // 선언된 창부품 연결
        btn1 = (Button) findViewById(R.id.button1);
        tv1 = (TextView)findViewById(R.id.textView1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 콘솔 디버깅1
                //System.out.println("버튼 클립됨");
                // 콘솔 디버깅 2- 추천
                Log.i("태그명",  "로깅할내용");
                // 토스트 디버깅
                //Toast.makeText(getApplicationContext(), "토스트로도 디버깅 가능", Toast.LENGTH_SHORT).show();
                if(bool) {
                    tv1.setTextSize(50);
                    tv1.setTextColor(Color.BLUE);
                    tv1.setTypeface(Typeface.SERIF);

                    tv1.setText("다모여조 송재현");
                    bool = false;
                } else{
                    tv1.setTextColor(Color.RED);
                    bool = true;
                }
            }

        });

    }
}