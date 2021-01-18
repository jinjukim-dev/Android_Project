package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnF1, btnF2, btnF3, btnF4, btnF5;
    Button btnNaver, btnFace, btnInstar;
    Button btnQuiz, btnTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnF1 = (Button) findViewById(R.id.btnF1);
        btnF2 = (Button) findViewById(R.id.btnF2);
        btnF3 = (Button) findViewById(R.id.btnF3);
        btnF4 = (Button) findViewById(R.id.btnF4);
        btnF5 = (Button) findViewById(R.id.btnF5);

        btnNaver = (Button) findViewById(R.id.btnNaver);
        btnFace = (Button) findViewById(R.id.btnFace);
        btnInstar = (Button) findViewById(R.id.btnInstar);

        btnQuiz = (Button)findViewById(R.id.btnQuiz);
        btnTip = (Button) findViewById(R.id.btnTip);


        //네이버블로그로 가기
        btnNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "블로그 가기", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/warmuse"));
                startActivity(intent);
            }
        });

        //페이스북 가기
        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "페이스북 가기", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/warmemo.korea"));
                startActivity(intent);
            }
        });

        //인스타 가기
        btnInstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "인스타그램 가기", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/warmemopr"));
                startActivity(intent);
            }
        });


        //관람안내 - 관람안내
        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                startActivity(intent);

            }
        });
        //전시 안내
        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExhibitionActivity.class);
                startActivity(intent);
            }
        });

        //문화행사
        btnF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CaltureActivity.class);
                startActivity(intent);
            }
        });

        //예약
        btnF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReserveActivity.class);
                startActivity(intent);
            }
        });

        //내공간
        btnF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MypageActivity.class);
                startActivity(intent);
            }
        });

        //퀴즈
        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuizMainActivity.class);
                startActivity(intent);
            }
        });



        //전시회꿀팁
        btnTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TipActivity.class);
                startActivity(intent);

            }
        });



    }
}
