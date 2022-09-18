package com.ahsan.i192048;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Activity19 extends AppCompatActivity {

    ImageView imageView;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_19);

        imageView = findViewById(R.id.toggle);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity19.this, Activity20.class));
            }
        });

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.add:
                        Intent intent = new Intent(Activity19.this, Activity8.class);
                        startActivity(intent);
                        return true;
                    case R.id.action_liked:
                        Intent intent3 = new Intent(Activity19.this, Activity19.class);
                        startActivity(intent3);
                        return true;
                    case R.id.search:
                        Intent intent1 = new Intent(Activity19.this, Activity17.class);
                        startActivity(intent1);
                        return true;
                    case R.id.listen_later:
                        Intent intent2 = new Intent(Activity19.this, Activity18.class);
                        startActivity(intent2);
                        return true;
                }
                return false;
            }
        });


    }


}