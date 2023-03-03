package com.example.scrollbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page1_GetStart extends AppCompatActivity {
    TextView sign_up_textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1_get_start);

        button = findViewById(R.id.button_logIn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page1_GetStart.this, MainActivity_navigation.class);
                startActivity(intent);

            }
        });

        sign_up_textView = findViewById(R.id.button_signUp);
        sign_up_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page1_GetStart.this, page_2_Welcome.class);
                startActivity(intent);

            }
        });
    }
}

//
//        navigationView = findViewById(R.id.navbarView);
//        getSupportFragmentManager().beginTransaction().replace(R.id.body_container,new homeFragment()).commit();
//        navigationView.setSelectedItemId(R.id.navhome);
//        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                Fragment fragment = null;
//                switch (item.getItemId()){
//                    case R.id.navhome:
//                        fragment = new homeFragment();
//                        break;
//                    case R.id.navChart:
//                        fragment = new chartFrragment();
//                        break;
//                    case R.id.navPaper:
//                        fragment = new staticsragment();
//                        break;
//                    case R.id.navprofile:
//                        fragment = new fragment_profile();
//                        break;
//                }
//                getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();
//
//                return true;
//            }
//
//        });