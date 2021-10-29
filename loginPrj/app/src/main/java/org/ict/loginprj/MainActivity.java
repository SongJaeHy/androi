package org.ict.loginprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 창부품 셍상
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
                ArrayList<String> idList = new ArrayList<>();

                idList.add("add");
                idList.add("ccc");
                idList.add("sss");
                idList.add("sad");

               String id = et1.getText().toString();
               String pw = et2.getText().toString();

               if(idList.contains(id) && pw.equals("android")){
                   Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                   intent.putExtra("id", id);
                   startActivity(intent);
               } else {
                   Intent intent = new Intent(getApplicationContext(), SubActivity2.class);
                   startActivity(intent);
               }
            }
        });


    }
}