package com.example.scrollbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.scrollbar.databinding.ActivityMainNavigationBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity_navigation extends AppCompatActivity {
    ActivityMainNavigationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new homeFragment());

        binding.navbarView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){

                case R.id.navhome:
                    replaceFragment(new homeFragment());
                    break;
                case R.id.navprofile:
                    replaceFragment(new profileFragment());
                    break;
                case R.id.navPaper:
                    replaceFragment(new staticsFragment());
                    break;
                case R.id.navChart:
                    replaceFragment(new chartFragment());
                    break;

            }
            return true;

        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.body_container,fragment);
        fragmentTransaction.commit();

    }
}