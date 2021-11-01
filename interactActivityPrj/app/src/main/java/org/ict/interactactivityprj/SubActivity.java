package org.ict.interactactivityprj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class SubActivity extends Activity {

    // 창부품 선언
    Button returnBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        // 창부품 연결
        returnBtn = (Button) findViewById(R.id.returnBtn);

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                // startActivityForResult는 defaultValue(깂이 안들어오면 대신 받을 값)을
                // 설정해둬야한다.
                int num1 = intent.getIntExtra("num1", 0);
                int num2 = intent.getIntExtra("num2", 0);
                // 메인에서 보낸 두 숫자를 행한 결과값도 sub에서 처리
                int resultNum = num1+num2;

                Intent resultIntent = new Intent(getApplicationContext(), MainActivity.class);

                resultIntent.putExtra("resultNum", resultNum);

                setResult(RESULT_OK, resultIntent);

                finish();
            }
        });
    }
}
