package org.ict.changeimgprj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    TextView tv1;
    Switch checkbox;
    RadioGroup radioGroup;
    RadioButton radio, moon;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        tv1 = (TextView) findViewById(R.id.tv1);
        checkbox = (Switch) findViewById(R.id.checkbox);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radio = (RadioButton) findViewById(R.id.radio);
        moon = (RadioButton) findViewById(R.id.moon);

        iv1 = (ImageView) findViewById(R.id.iv1);


        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // true, false여부를 체그
                Log.d("isChecked",isChecked + "");
                // 클릭해서 true면 어플이 보이게, false면 안보이게 하기 위해
                // if~else분기 작성해주새요
                if(isChecked){
                    // ImageView를 제외한 창부품을 보이도록 전환
                    // android.text="" 의 기입내용을 바꿀때 setText()를 썻습니다.
                    // android:visibility를 바꿀때는 setVisibility()를 씁니다.
                    radioGroup.setVisibility(View.VISIBLE);
                    radio.setVisibility(View.VISIBLE);
                    moon.setVisibility(View.VISIBLE);
                    iv1.setVisibility(View.VISIBLE);
                } else {
                    // 창부품이 보이지 않도록 전환
                    // 스위치 off시 요소들 안보이기에
                    radioGroup.setVisibility(View.INVISIBLE);
                    radio.setVisibility(View.INVISIBLE);
                    moon.setVisibility(View.INVISIBLE);
                    iv1.setVisibility(View.INVISIBLE);
                    // 라디오 버튼 선택 해제
                    // 라디오그룹의 모든 선택사항 해제 명령으로 처리 가능
                    radioGroup.clearCheck();
                }
            }
        });

        // 1. radio, moon에 onClick이벤트를 걸어서 처리
        // 2. radio를 이용해 radio, moon 중 어떤게 클릭되었는지 감ㅁ지해 처리
        // 어제 2를 이용해 처리했기때문에 오늘은 1로 처리

       radio.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               iv1.setImageResource(R.drawable.moon);
           }
       });
       moon.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               iv1.setImageResource(R.drawable.amount);
           }
       });
    }
}
