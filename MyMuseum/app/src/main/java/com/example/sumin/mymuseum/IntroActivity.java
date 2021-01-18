package com.example.sumin.mymuseum;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

public class IntroActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        //핸들러
        Handler mHandler = new Handler();

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();

                overridePendingTransition(R.anim.fade_st, R.anim.fade_end);
            }
        }, 2000);

    }
}
