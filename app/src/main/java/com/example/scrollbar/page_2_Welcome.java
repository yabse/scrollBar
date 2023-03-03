package com.example.scrollbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page_2_Welcome extends AppCompatActivity {

    TextView log_in_textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2_welcome);


        button = findViewById(R.id.button_signUp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_2_Welcome.this,MainActivity_navigation.class);
                startActivity(intent);
                finish();
            }
        });
        log_in_textView = findViewById(R.id.button_logIn);
        log_in_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page_2_Welcome.this, page1_GetStart.class);
                startActivity(intent);

            }
        });
    }
}