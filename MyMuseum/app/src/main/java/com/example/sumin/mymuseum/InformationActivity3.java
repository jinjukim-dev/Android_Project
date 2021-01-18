package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by s1 on 2018-07-16.
 */

public class InformationActivity3 extends Activity {

    Button  btnF1, btnF2, btnF4;
    ImageView imgMap;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information3);

        btnF1 = (Button) findViewById(R.id.btnF1);
        btnF2 = (Button) findViewById(R.id.btnF2);
        btnF4 = (Button) findViewById(R.id.btnF4);

        imgMap = (ImageView) findViewById(R.id.imgMap);


        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity3.this, InformationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity3.this, InformationActivity2.class);
                startActivity(intent);
                finish();

            }
        });


        btnF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity3.this, InformationActivity4.class);
                startActivity(intent);
                finish();
            }
        });

        imgMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "빠른길 검색하러가기", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://map.daum.net/?urlX=494946&urlY=1121509&itemId=8077761"));
                startActivity(intent);
            }
        });
    }
}