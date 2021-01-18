package com.example.sumin.mymuseum;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by s1 on 2018-07-17.
 */

public class InformationActivity2 extends Activity{

    Button btnF1, btnF3, btnF4, btnCo;
    ImageView img1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information2);

        btnF1 = (Button) findViewById(R.id.btnF1);
        btnF3 = (Button) findViewById(R.id.btnF3);
        btnF4 = (Button) findViewById(R.id.btnF4);
        btnCo = (Button) findViewById(R.id.btnCo);

        img1 = (ImageView) findViewById(R.id.img1);


        btnCo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String [] CourseArray = {"유아, 초등 저학년 코스", "중,고등학생 코스", "내국인 가족 코스", "외국인 코스"};
                final int [] course = {R.drawable.course1, R.drawable.course2, R.drawable.course3, R.drawable.couse4};


                AlertDialog.Builder dlg = new AlertDialog.Builder(InformationActivity2.this);

                dlg.setTitle("코스를 선택해주세요.");
                //dlg.setIcon(R.drawable.emo_im_cool);

                dlg.setSingleChoiceItems(CourseArray, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        btnCo.setText(CourseArray[i]+" 입니다.");

                        img1.setImageResource(course[i]);

                    }
                });
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });

        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(InformationActivity2.this, InformationActivity.class);
                startActivity(intent);
                finish();

            }
        });

        btnF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity2.this, InformationActivity3.class);
                startActivity(intent);
                finish();
            }
        });

        btnF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationActivity2.this, InformationActivity4.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
