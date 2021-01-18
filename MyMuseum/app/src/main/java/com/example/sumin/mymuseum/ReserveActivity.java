package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ReserveActivity extends Activity {

    Button btnReserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserve_main);
        btnReserve = (Button)findViewById(R.id.btnReserve);

        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReserveActivity.this,Reserve1Activity.class);
                startActivity(intent);
            }
        });

    }
}
