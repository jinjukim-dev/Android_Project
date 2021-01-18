package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Quiz1Activity extends Activity{

    TextView txtNum, txtQuiz;
    ImageButton btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);

        txtNum = (TextView)findViewById(R.id.txtNum);
        txtQuiz = (TextView)findViewById(R.id.txtQuiz);
        btn1 = (ImageButton)findViewById(R.id.btn1);
        btn2 = (ImageButton)findViewById(R.id.btn2);
        btn3 = (ImageButton)findViewById(R.id.btn3);
        btn4 = (ImageButton)findViewById(R.id.btn4);
        
        final int number = 0;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz1Activity.this,Quiz2Activity.class);
                intent.putExtra("number",number);
                startActivity(intent);
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz1Activity.this,Quiz2Activity.class);
                intent.putExtra("number",number+1);
                startActivity(intent);
                finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz1Activity.this,Quiz2Activity.class);
                intent.putExtra("number",number);
                startActivity(intent);
                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz1Activity.this,Quiz2Activity.class);
                intent.putExtra("number",number);
                startActivity(intent);
                finish();
            }
        });
    }
}
