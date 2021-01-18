package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizResult extends Activity {

    TextView txtResult;

    Button btnReturn;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_result);

        txtResult = (TextView)findViewById(R.id.txtResult);
        btnReturn = (Button)findViewById(R.id.btnReturn);

        final Intent intent = getIntent();
        int number = intent.getIntExtra("number",0);

        txtResult.setText(number+"개");

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}
