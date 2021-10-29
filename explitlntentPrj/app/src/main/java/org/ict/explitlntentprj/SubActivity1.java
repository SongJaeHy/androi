package org.ict.explitlntentprj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SubActivity1 extends Activity {

    TextView message1;
    Button cancelBtn1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub2);

        message1 = (TextView) findViewById(R.id.message1);
        cancelBtn1 = (Button)findViewById(R.id.cancelBtn1);

        Intent intent = getIntent();

        String getData = intent.getStringExtra("test1");

        message1.setText(getData);

        cancelBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
