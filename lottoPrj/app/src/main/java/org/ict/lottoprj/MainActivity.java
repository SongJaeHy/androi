package org.ict.lottoprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    Button btn1;
    TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  참부품 연결
        btn1 = (Button) findViewById(R.id.btn1);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);

        // 연동
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 로또번호 6개를 담아둘 ArrayList 생성

                List<Integer> lotto = new ArrayList<>();

                // lotto의 내부 자료가 6새 되기 전까지 무한반복
                while(lotto.size() != 6) {
                    // Math.random()의 결과값은 0보다 크고 1보다 작으므로
                    // 정수변환시 무조건 0~44 범위를 가지게 됨
                    // 그래서 마지막에 1을 더해서 1~45범위로 교체
                    int getNum = (int)(Math.random() * 45) + 1;

                    // 기존 당첨번호에 중복되는지 여부 확인해서 없는번호인 경우만 넣기
                    // lotto가 소유하지 않은 번호라면
                    if(!lotto.contains(getNum)) {
                        // 추가
                        lotto.add(getNum);
                    }
                }

                // 번호를 보기좋게 정렬
                Collections.sort(lotto);


                // 2등번호 추첨
                int bonusNum = 0;
                // bonusNum이 0이거나(보너스번호 추첨한적 없음)
                // 0이 아니어도
                while(bonusNum == 0 || lotto.contains(bonusNum)) {
                    bonusNum = (int)(Math.random() * 45)+1;
                        }


                // 모든 추첨이 끝난 후 결과페이지에 출력하기
                tv2.setText(lotto + "");
                tv4.setText(bonusNum + "");
            }

        });
    }
}