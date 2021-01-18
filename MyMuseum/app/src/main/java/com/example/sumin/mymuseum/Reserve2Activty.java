package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class Reserve2Activty extends Activity {

    String Name, Date,Time;

    Button btnReturn;
    TextView reserveName, reserveDay, reserveTime;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserve2);

        reserveName = (TextView)findViewById(R.id.reserveName);
        reserveDay = (TextView)findViewById(R.id.reserveDay);
        reserveTime = (TextView)findViewById(R.id.reserveTime);
        btnReturn = (Button)findViewById(R.id.btnReturn);

        Intent intent = getIntent();
        Name = intent.getStringExtra("Name");
        Date = intent.getStringExtra("Date");
        Time = intent.getStringExtra("Time");

        reserveName.setText(Name);
        reserveTime.setText(Time);
        reserveDay.setText(Date);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

}
