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

public class InformationActivity4 extends Activity {

    Button  btnF1, btnF2, btnF3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information4);

        btnF1 = (Button) findViewById(R.id.btnF1);
        btnF2 = (Button) findViewById(R.id.btnF2);
        btnF3 = (Button) findViewById(R.id.btnF3);



        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity4.this, InformationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity4.this, InformationActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        btnF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity4.this, InformationActivity3.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
