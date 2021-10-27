package org.ict.contextmenuprj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    LinearLayout bg1;
    Button backBtn, changeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        bg1 = (LinearLayout) findViewById(R.id.bg1);
        backBtn = (Button) findViewById(R.id.backBtn);
        changeBtn = (Button) findViewById(R.id.changeBtn);
        // backBtn, changeBtn을 클릭했을때 컨텍스트 메유가 뜨도록 연결
        registerForContextMenu(backBtn);
        registerForContextMenu(changeBtn);
    }


    // 각각 버튼을 클릭했을때 menu1, menu2가 조건에 맞게 표출되도록 설정
    // onCreateContextMenu를 Override를 통해 구현합니다.
    // 상단 coce -> Override Methods 들어가서 위 메서드를 구현해주세요.
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {


        super.onCreateContextMenu(menu, v, menuInfo);
        // 메뉴생성을 위해 Inflater 생성
        MenuInflater mInflater = getMenuInflater();

        // v는 아까 추가한 registerForCotnextMenu에 등록된 요소입니다.
        // 롱클릭이므로 길게 눌러야 나옵니다.
        if (v == backBtn){
            mInflater.inflate(R.menu.menu1, menu);
        }
        if(v == changeBtn){
            mInflater.inflate(R.menu.menu2, menu);
        }
    }

    // menu1, menu2 내부의 옵션을 클릭했을때 실행할 내용들은
    // onContextItemSelected를 Overrid를 통해 구현합니다.

    Integer rotation = 0;
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Log.d("선택한 버튼 아이디", item.getItemId() + "");
        if(item.getItemId()==R.id.backRed){
            bg1.setBackgroundColor(Color.RED);
        } else if(item.getItemId()== R.id.backBlue){
            bg1.setBackgroundColor(Color.BLUE);
        } else if(item.getItemId()== R.id.backGreen){
            bg1.setBackgroundColor(Color.GREEN);
        }else if(item.getItemId()== R.id.backGray){
            bg1.setBackgroundColor(Color.GRAY);
        }else if(item.getItemId()== R.id.rote){
            rotation += 45;
            backBtn.setRotation(45);
        }else if(item.getItemId()== R.id.upSize){
            changeBtn.setScaleX(2);
        }



        return super.onContextItemSelected(item);
    }
}