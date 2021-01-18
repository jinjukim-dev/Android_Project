package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz2Activity extends Activity{

    TextView txtNum, txtQuiz;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz2);

        txtNum = (TextView)findViewById(R.id.txtNum);
        txtQuiz = (TextView)findViewById(R.id.txtQuiz);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);

        Intent intent = getIntent();
        final int number = intent.getIntExtra("number",0);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz2Activity.this,Quiz3Activity.class);
                intent.putExtra("number",number);
                startActivity(intent);
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz2Activity.this,Quiz3Activity.class);
                intent.putExtra("number",number);
                startActivity(intent);
                finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz2Activity.this,Quiz3Activity.class);
                intent.putExtra("number",number);
                startActivity(intent);
                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz2Activity.this,Quiz3Activity.class);
                intent.putExtra("number",number+1);
                startActivity(intent);
                finish();
            }
        });

    }
}
