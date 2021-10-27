package org.ict.photomenuprj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    // 참부품 선언
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 창부품 연결
        iv = (ImageView)findViewById(R.id.iv);

    }

    // 창 생성시 처리할 옵션

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        /*
        // 메뉴 추가
        menu.add(0, 1, 0, "사진1");
        menu.add(0, 2, 0, "사진2");
        menu.add(0, 3, 0, "사진3");
        */
        // 현 레이아웃에 메뉴적용을 위해 인플레이터 생성
        MenuInflater mInflater = getMenuInflater();
        // 기존 레이아웃에 리소스 폴더 내 xml파일 저장
        mInflater.inflate(R.menu.menu1, menu);

        return true;
    }

    // 메뉴 클릭시 반응하게 만들기
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d("선택한 버튼 아이디", item.getItemId() + "");
        if(item.getItemId() == R.id.iv){
            iv.setImageResource(R.drawable.ch);
        } else if(item.getItemId() == 2131230807){
            iv.setImageResource(R.drawable.ja);
        } else if(item.getItemId() == 2131230808){
            iv.setImageResource(R.drawable.korean);
        }

        return super.onOptionsItemSelected(item);
    }
}