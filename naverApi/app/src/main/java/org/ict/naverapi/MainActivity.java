package org.ict.naverapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class MainActivity extends AppCompatActivity{

    TextView text;
    private final String key = "";
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
    }

    public void mOnClick(View v){
        switch (v.getId()){
            case R.id.button:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        data=getXmlData();

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                text.setText(data);
                            }
                        });
                    }
                }).start();
                break;
        }
    }

    String getXmlData(){
        StringBuffer buffer = new StringBuffer();

        String queryUrl = "http://openapi.seoul.go.kr:8088/" + key + "/xml/ListAirQualityByDistrictService/1/5/";

        try{
            URL url = new URL(queryUrl);
            InputStream is = url.openStream();

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();

            xpp.setInput(new InputStreamReader(is, "UTF-8"));

            String tag;

            xpp.next();
            int eventType = xpp.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT){
                switch (eventType){
                    case XmlPullParser.START_DOCUMENT:
                        buffer.append("파싱 시작\n\n");
                        break;

                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();

                        if(tag.equals("item"));
                        else if(tag.equals("MSRSTENAME")){
                            buffer.append("구 이름:");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if(tag.equals("GRADE")){
                            buffer.append("상태:");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if(tag.equals("PM10")){
                            buffer.append("미세먼지:");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if(tag.equals("PM25")){
                            buffer.append("초미세먼지:");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if(tag.equals("OZONE")){
                            buffer.append("오존:");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if(tag.equals("NITROGEN")){
                            buffer.append("이산화탄소:");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if(tag.equals("CARBON")){
                            buffer.append("일산화탄소:");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        else if(tag.equals("SULFUROUS")){
                            buffer.append("아황산가스 :");
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");
                        }
                        break;

                        case XmlPullParser.TEXT:
                            break;

                            case XmlPullParser.END_TAG:

                                tag=xpp.getName();
                                if(tag.equals("PM25")) buffer.append("\n");
                                break;
                }
                eventType=xpp.next();
            }
        }catch (Exception e){

        }
        buffer.append("파싱 끝 \n");
        return buffer.toString();
    }
}