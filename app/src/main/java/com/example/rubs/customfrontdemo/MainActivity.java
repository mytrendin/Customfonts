package com.example.rubs.customfrontdemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Typeface front1,front2,front3,front4;
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        front1 = Typeface.createFromAsset(getAssets(),"customfronts/Android Insomnia Regular.ttf");
        tv1 =  (TextView)findViewById(R.id.tv1);
        tv1.setTypeface(front1);
        front2 = Typeface.createFromAsset(getAssets(),"customfronts/android_7.ttf");
        tv2 =  (TextView)findViewById(R.id.tv2);
        tv2.setTypeface(front2);
        front3 = Typeface.createFromAsset(getAssets(),"customfronts/Blesed.otf");
        tv3 =  (TextView)findViewById(R.id.tv3);
        tv3.setTypeface(front3);
        front4 = Typeface.createFromAsset(getAssets(),"customfronts/Dan's Disney v5.ttf");
        tv4 =  (TextView)findViewById(R.id.tv4);
        tv4.setTypeface(front4);

    }
}
