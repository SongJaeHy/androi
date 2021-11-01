package org.ict.implicitintentprj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 창부품 선언
    Button btnC, btnW, btnG, btnS, btnM, btnP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 창부품 연결
        btnC = (Button) findViewById(R.id.btnC);
        btnW = (Button) findViewById(R.id.btnW);
        btnG = (Button) findViewById(R.id.btnG);
        btnS = (Button) findViewById(R.id.btnS);
        btnM = (Button) findViewById(R.id.btnM);
        btnP = (Button) findViewById(R.id.btnP);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:01012345678");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                // 보낸적 없는 전화번호가 같이 달려서 넘어갑니다.
                startActivity(intent);
            }
        });

        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.naver.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/maps/place/%ED%95%9C%EA%B5%ADICT%EC%9D%B8%EC%9E%AC%EA%B0%9C%EB%B0%9C%EC%9B%90/@37.5596207,126.8907016,12z/data=!4m9!1m2!2m1!1z7ZWc6rWt7JWE7J207Yuw7J247J6s6rCc67Cc7JuQ!3m5!1s0x357c99b56609aa51:0xa1bd0b6d813b1eda!8m2!3d37.5548129!4d126.9205427!15sCh7tlZzqta3slYTsnbTti7DsnbjsnqzqsJzrsJzsm5BaIyIh7ZWc6rWtIOyVhOydtO2LsCDsnbjsnqwg6rCc67Cc7JuQkgEYY29tcHV0ZXJfdHJhaW5pbmdfc2Nob29s");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, "안드로이드");
                startActivity(intent);
            }
        });

        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.putExtra("sms_body", "안녕하세요?");
                intent.setData(Uri.parse("smsto:" + Uri.encode("010-1234-5678")));
                startActivity(intent);
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });
    }
}