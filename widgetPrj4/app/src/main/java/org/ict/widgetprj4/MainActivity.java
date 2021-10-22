package org.ict.widgetprj4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    EditText et1;
    Button btn1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        et1 = (EditText) findViewById(R.id.et1);
        btn1 = (Button) findViewById(R.id.btn1);
        tv1 = (TextView) findViewById(R.id.tv1);
        // 버튼에 온클릭 설정까지만
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("click", "클릭감지됨");

                // 29페이지를 참조해서, EditText내부 부품 값을 얻어주세요.
                String Result = et1.getText().toString();

                // 얻어온 값을 로그로 찍어주세요.
                Log.d("Result", Result);

                // 얻어온 값을 토스트로 찍기
                Toast.makeText(getApplicationContext(), Result,
                        Toast.LENGTH_SHORT).show();
                tv1.setText(Result);
            }
        });
    }
}