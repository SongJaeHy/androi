package org.ict.changimageprj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    TextView tv1,tv2;
    CheckBox checkbox;
    RadioGroup radioGroup;
    RadioButton radio, moon;
    Button btn1;
    ImageView iv1, iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 창부품 연결
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);

        checkbox = (CheckBox)findViewById(R.id.checkbox);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radio = (RadioButton)findViewById(R.id.radio);
        moon = (RadioButton)findViewById(R.id.moon);

        btn1 = (Button)findViewById(R.id.btn1);

        iv1 = (ImageView)findViewById(R.id.iv1);
        iv2 = (ImageView)findViewById(R.id.iv2);

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
                    tv2.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    radio.setVisibility(View.VISIBLE);
                    moon.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                } else {
                    // 창부품이 보이지 않도록 전환
                    tv2.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    radio.setVisibility(View.INVISIBLE);
                    moon.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    iv1.setVisibility(View.INVISIBLE);
                    iv2.setVisibility(View.INVISIBLE);
                    // 라디오 버튼 선택 해제
                    // 라디오그룹의 모든 선택사항 해제 명령으로 처리 가능
                    radioGroup.clearCheck();
                }
            }
        });

        // 어떤 자연의 사진을 보여줄지는, 위의 어플 요소와는 별개로
        // RadioButton에 뭐가 선택되었나만 가지고 판단해야하기 때문에
        // 따로 지정합니다.
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // RadioGroup 내부의 RadioButton을 감지할때는
                // RadioGroup뱐스.getCheckedRadioButtonId()를 쓰면
                // 선택한 버튼의 ID값이 잡혀옵니다.
                int checked = radioGroup.getCheckedRadioButtonId();
                Log.d("선택된 버튼은?", checked + "");

                if(checked == 2131231047){
                    Log.d("안내","자연 버튼을 클릭했습니다.");
                    // 자연버튼 클릭시 자연사진을 VISIBLE로 전환
                    iv1.setVisibility(View.VISIBLE);
                    // 결함 발견시 보완
                    iv2.setVisibility(View.INVISIBLE);
                }else if(checked == 2131230984){
                    Log.d("안내", "달 버튼을 클릭했습니다.");
                    // 달버튼 클릭시 달사진을 VISIBLE로 전환
                    iv2.setVisibility(View.VISIBLE);
                    // 결함 발견시 보완
                    iv1.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}