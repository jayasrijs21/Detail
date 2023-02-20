package com.example.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnNews , btnSports, btnScience;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNews = findViewById(R.id.btnNews);
        btnScience = findViewById(R.id.btnScience);
        btnSports = findViewById(R.id.btnSports);
        FragmentManager fragmentManager = getSupportFragmentManager();

        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView , new NewsFragment() , null)
                       // .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();

            }
        });
        btnScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView , ScienceFragment.class , null)
                       // .setReorderingAllowed(true)
                        .addToBackStack("name").commit();

            }
        });

        btnSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView , SportsFragment.class , null)
                     //   .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();

            }
        });


    }
}