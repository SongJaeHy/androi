package org.ict.explitlntentprj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SubActivity extends Activity {

    TextView message;
    Button cancelBtn, btn1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        message = (TextView) findViewById(R.id.message);
        cancelBtn = (Button) findViewById(R.id.cancelBtn);
        btn1 = (Button) findViewById(R.id.btn1);

        // 보내온 인텐트를 받는 순서는
        // 1. 인텐트 자체를 변수에 저장합니다.
        // getIntent()를 하면 보내온 인텐트를 받아올 수 있숩니다.
        Intent intent = getIntent();

        // 2. 인텐트 내부에 실려서 같이 들어온 데이터를 뽑아냅니다.
        //  intent.get자료형Extra("호출명")을 적으면 됩니다.
        String getDAta = intent.getStringExtra("test").toString();

        // 3 받아온 데이터를 활용합니다.
        message.setText(getDAta);

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("test1", "테스트당");
                intent.setClass(getApplicationContext(), SubActivity1.class);
                startActivity(intent);
            }
        });
    }
}
