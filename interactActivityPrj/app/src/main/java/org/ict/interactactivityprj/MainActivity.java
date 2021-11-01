package org.ict.interactactivityprj;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    EditText et1,et2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        btn1 = (Button) findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                intent.putExtra("num1", Integer.parseInt(et1.getText().toString()));
                intent.putExtra("num2", Integer.parseInt(et2.getText().toString()));

                //startActivity(intent);
                // 돌아오기를 했을떄 추가로 돌려받을 값이 존재할떄 사용
                startActivityForResult(intent, 0);
            }
        });
    }

    // 어플을 처음 켜서 메인화면에 접든된 것이 아니라
    // 계산기 기능을 활용해서 다른 엑티비티에 갔다가 결과값을 전달받아 오는경우를
    // 처리하는 코드
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        // RESULT_OK가 들어오는 경우만 화묜에 결과값을 표기하도록 처리
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            // onActivityResult의 파라미터로 선언된 Intent data라는 명칭으로
            // 아까전에 호출한 setResult() 호출시 같이 넘어옴
            int resultNum = data.getIntExtra("resultNum", 0);
            // 가져온 결과물은 토스트를 띄워주세요.
           Toast.makeText(getApplicationContext(), resultNum + "", Toast.LENGTH_SHORT).show();

        }
    }
}