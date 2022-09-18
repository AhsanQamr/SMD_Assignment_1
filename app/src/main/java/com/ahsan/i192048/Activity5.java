package com.ahsan.i192048;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class Activity5 extends AppCompatActivity  {

    Button button;
    ImageView imageView;
    ImageView imageView1;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        button = findViewById(R.id.more);
        imageView = findViewById(R.id.profile);
        imageView1 = findViewById(R.id.menu_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity5.this, Activity6.class));
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity5.this,Activity22.class));
            }
        });


        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.add:
                        Intent intent = new Intent(Activity5.this, Activity8.class);
                        startActivity(intent);
                        return true;
                    case R.id.action_liked:
                        Intent intent3 = new Intent(Activity5.this, Activity19.class);
                        startActivity(intent3);
                        return true;
                    case R.id.search:
                        Intent intent1 = new Intent(Activity5.this, Activity17.class);
                        startActivity(intent1);
                        return true;
                    case R.id.listen_later:
                        Intent intent2 = new Intent(Activity5.this, Activity18.class);
                        startActivity(intent2);
                        return true;
                }
                return false;
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity5.this, DrawerActivity.class));
            }
        });

    }



}