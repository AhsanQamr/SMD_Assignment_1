package com.ahsan.i192048;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    Button button;
    Button button1; // sign up button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button1 = findViewById(R.id.sign_up_3);
        button = findViewById(R.id.sign_in_3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity3.this, Activity4.class));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity3.this, Activity4.class));
                Toast.makeText(Activity3.this, "Account Created Successfully", Toast.LENGTH_SHORT).show();
            }

        });

    }
}