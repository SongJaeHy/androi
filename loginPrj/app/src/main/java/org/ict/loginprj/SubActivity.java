package org.ict.loginprj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SubActivity extends Activity {

    Button btn2;
    TextView idTv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btn2 = (Button) findViewById(R.id.btn2);
        idTv = (TextView) findViewById(R.id.idtv);

        Intent intent = getIntent();

        String id = intent.getStringExtra("id");

        idTv.setText(id + "님이 로그인 하셨습니다.");

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
