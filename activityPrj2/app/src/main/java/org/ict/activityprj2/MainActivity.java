package org.ict.activityprj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 버틍 생성
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼 연결
        btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent로 sub1으로 넘어가도록 설정
                // 목적지는 SubActivity1
                Intent intent = new Intent(getApplicationContext(), SubActivity1.class);

                startActivity(intent);
            }
        });

    }
}