package org.ict.tablecalculatorprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 창부품 선언

    // 버튼이 10개이므로 10개 빈 버튼 생성
    Button[] numBtns = new Button[10];
    // 숫자버튼은 인덱스번호 = 실제 버튼에 적힌 번호값 이므로
    // 배열로 저장한다.
    Integer[] numBtnIDs = {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,
            R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,};

    // 이외 나머지 요소는 직접 선언
    Button btnp,btnm,btnu,btnd;
    EditText et1,et2;
    TextView tv2;
    String num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 10개 버튼이 0~9까지 숫자로 배정되어있으므로 반복문 재벙
        for(int i=0; i<10; i++){
            numBtns[i] = (Button)findViewById(numBtnIDs[i]);
        }

        // 창부품 연결
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

        btnp = (Button)findViewById(R.id.btnp);
        btnm = (Button)findViewById(R.id.btnm);
        btnu = (Button)findViewById(R.id.btnu);
        btnd = (Button)findViewById(R.id.btnd);

        tv2 = (TextView) findViewById(R.id.tv2);

        // 부품 배열에 대해서는 이벤트까지 반복문으로 겁니다.
        for(int i=0; i< numBtns.length; i++){
            final int index; // 상수를 하나 선언해줘야 이벤트가 정상적으로 걸림
            index = i;

            numBtns[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 포커스된 EditText에 숫자 입력하기
                    if(et1.isFocused()){
                        // et1에 커사가 깜빡이는(즉 선택된)경우
                        num1 = et1.getText().toString()
                                + numBtns[index].getText().toString();
                        et1.setText(num1);
                       // et1.setText(numBtns[index].getText());

                    } else if(et2.isFocused()){
                        // et2에 커사가 깜빡이는(즉 선택된)경우
                        num2 = et2.getText().toString()
                                + numBtns[index].getText().toString();
                        //et2.setText(numBtns[index].getText());
                    }
                }
            });
        }
        btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lResult = et1.getText().toString();
                String rResult = et2.getText().toString();
                int result = Integer.parseInt(lResult) + Integer.parseInt(rResult);

                tv2.setText(result + "");

            }
        });
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lResult = et1.getText().toString();
                String rResult = et2.getText().toString();
                int result = Integer.parseInt(lResult) - Integer.parseInt(rResult);

                tv2.setText(result + "");

            }
        });
        btnu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lResult = et1.getText().toString();
                String rResult = et2.getText().toString();
                int result = Integer.parseInt(lResult) * Integer.parseInt(rResult);

                tv2.setText(result + "");

            }
        });
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lResult = et1.getText().toString();
                String rResult = et2.getText().toString();
                int result = Integer.parseInt(lResult) / Integer.parseInt(rResult);

                tv2.setText(result + "");

            }
        });

    }
}