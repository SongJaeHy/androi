package org.ict.widgetprj11;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

// 액션바는 java코드로만 구현하기떄문에 activity_main.xml파일이 필요없습니다.
// MainActivity에서는 탭만 구현하고
/* CustomTabFragment 클래스를 만들어 거기서 탭별 홤면을 구현합니다.
    MainActivity는 AppCompatActivity를 상속하고
    ActionBar를 구현합니다.
 */
public class MainActivity extends AppCompatActivity implements ActionBar.TabListener{




    //탭 갯수만큼 변수 선언(3개)
    ActionBar.Tab tabSong, tabArtist, tabhobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // activity_main을 안 쓰므로 필요없음
        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tabSong = bar.newTab();
        tabSong.setText("레벨");
        tabSong.setTabListener(this);
        bar.addTab(tabSong);

        tabArtist = bar.newTab();
        tabArtist.setText("에스파");
        tabArtist.setTabListener(this);
        bar.addTab(tabArtist);

        tabhobby = bar.newTab();
        tabhobby.setText("독서");
        tabhobby.setTabListener(this);
        bar.addTab(tabhobby);
    }
//        tabSong = bar.newTab();
//        tabSong.setText("Ptt");
//        tabSong.setTabListener(this);
//        bar.addTab(tabSong);
//
//        tabArtist = bar.newTab();
//        tabArtist.setText("이달의 소녀");
//        tabArtist.setTabListener(this);
//        bar.addTab(tabArtist);
//
//        tabhobby = bar.newTab();
//        tabhobby.setText("게임");
//        tabhobby.setTabListener(this);
//        bar.addTab(tabhobby);


    // 탭이 선택될 때 마다 바뀌는 내용을 처리해야 하므로
    // onTabSelected를 재정의해줍니다.
    // CustomFragment 3개를 선언합니다.
    CustomTabFragment customFrags[] = new CustomTabFragment[3];
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        // 아까 만든 커스텀 프래그먼트를 먼저 선언합니다.
        CustomTabFragment cFrag = null;

        // 탭 선택이 된 적이 없다면, 새로 탭을 생성
        if(customFrags[tab.getPosition()]==null){
            cFrag = new CustomTabFragment();
            Bundle data = new Bundle();
            data.putString("tabName", tab.getText().toString());
            cFrag.setArguments(data);
            customFrags[tab.getPosition()] = cFrag;
        } else {
            // 선택이 된 적이 있다면 선택된 탭으로 교체
            cFrag= customFrags[tab.getPosition()];
        }
        // 화면 교체
        ft.replace(android.R.id.content, cFrag);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}