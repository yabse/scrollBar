package com.example.scrollbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;


public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash.this, page1_GetStart.class));
                finish();
            }
        },4000);
    }
}
