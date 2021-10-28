package org.ict.dialogprj2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 창부품을 추가해주세요.
    TextView nametv1,emailtv2;
    Button btn1;
    EditText userName, useremail;
    View modal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 창부품 선언
        nametv1 = (TextView) findViewById(R.id.nametv1);
        emailtv2 = (TextView) findViewById(R.id.eamiltv2);
        btn1 = (Button) findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 클릭하면 모달창같이 userinfo.xml이 열려야 합니다.
                // 다이얼로그 생성, 설정 후 .show()로 보여주는데
                // 단, dialog의 형태를 userinfo.xml에 정의해뒀으므로
                // xml파일을 화묜으로 가져오는 inflaste() 기능을 활용합니다.
                // Biew 타입을 이용해야 추가 추가 창을 정의할 수 있습니다.
                modal = View.inflate(MainActivity.this, R.layout.userinfo, null);
                // AlertDialog 객체 생성 후 View를 다이어로그로 변환
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setView(modal);
                // 창이 떳으면 확인 취소버튼도 만들어주세요.
                // 1. positive버튼 클릭시 이벤트 발동
                // 2. EditText 2개를 MainActivity에 연결
                // 3. EditText에 있던 요소를 .getText()로 가져와서
                // 4. TextView에 찍히게 만들어주세요.
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // inflate로 만든 커스텀 창의 위젯은
                        // modal명의로 연결해야 합니다.
                        userName = (EditText) modal.findViewById(R.id.userName);
                        useremail = (EditText) modal.findViewById(R.id.useremail);

                        emailtv2.setText(useremail.getText().toString());
                        nametv1.setText(userName.getText().toString());
                    }
                });
                dlg.setNegativeButton("취소", null);
                dlg.show();
            }
        });
    }
}