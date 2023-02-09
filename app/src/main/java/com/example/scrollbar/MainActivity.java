package com.example.scrollbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        navigationView = findViewById(R.id.navbarView);
        getSupportFragmentManager().beginTransaction().replace(R.id.body_container,new homeFragment()).commit();
        navigationView.setSelectedItemId(R.id.navhome);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.navhome:
                        fragment = new homeFragment();
                        break;
                    case R.id.navChart:
                        fragment = new chartFrragment();
                        break;
                    case R.id.navPaper:
                        fragment = new staticsragment();
                        break;
                    case R.id.navprofile:
                        fragment = new fragment_profile();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();

                return true;
            }

        });

    }
}