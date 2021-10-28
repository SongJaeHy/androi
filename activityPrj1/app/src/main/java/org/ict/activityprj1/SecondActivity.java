package org.ict.activityprj1;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

// 안드로이드에서 화면과 관련된 클래스는 모두 Activity를 상속받습니다.
public class SecondActivity extends Activity {

    // 돌아가는 버튼
    Button returnBtn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        // 연결하기
        returnBtn = (Button) findViewById(R.id.returnBtn);

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
