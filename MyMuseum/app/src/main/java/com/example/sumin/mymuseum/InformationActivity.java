package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by s1 on 2018-07-16.
 */

public class InformationActivity extends Activity {

    Button  btnF2, btnF3, btnF4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);


        btnF2 = (Button) findViewById(R.id.btnF2);
        btnF3 = (Button) findViewById(R.id.btnF3);
        btnF4 = (Button) findViewById(R.id.btnF4);


        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity.this, InformationActivity2.class);
                startActivity(intent);
                finish();

            }
        });

        btnF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity.this, InformationActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        btnF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity.this, InformationActivity4.class);
                startActivity(intent);
                finish();

            }
        });
    }
}

