package org.ict.calculatorprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 같은 종류의 우젯은 한 줄에 몰아서 선언해도 상관없음
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView text,resulttext;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");

        // 2. 배치된 부품을 자바 코드와 연결
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        text = (TextView) findViewById(R.id.text);
        resulttext = (TextView) findViewById(R.id.resulttext);

        // 3. 버튼별로 기능 부여하기
        // 예시로 plus버튼만 설정
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /* String lResult = edit1.getText().toString();
               String rResult = edit2.getText().toString();

               int result = Integer.parseInt(lResult) + Integer.parseInt(rResult);

               text.setText(result + "");
              */
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);

                    // 결과값 화면에 출력하기
                    // int를 String으로 바꾸는 가장 쉬운 방법은 그냥빈 문자열을 더하는것
                    resulttext.setText(result + "");

                    // 이 코드를 토대로 나머지 연산도 만들어주시고
                    // 다 된 분들은 더하기 연한 수 왼쪽, 오른쪽 입력창 값을 비워주세요

                edit1.setText(null);
                edit2.setText(null);
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);

                resulttext.setText(result + "");

                edit1.setText(null);
                edit2.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                int result = Integer.parseInt(num1) * Integer.parseInt(num2);
                resulttext.setText(result + "");

                edit1.setText(null);
                edit2.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                resulttext.setText(result + "");

                edit1.setText(null);
                edit2.setText(null);
            }
        });


    }
}