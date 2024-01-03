package com.example.all_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LecturerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_login);

        TextView lecturerRegisterText = findViewById(R.id.lecturerRegisterText);

        // onclick listener for the register Text
        lecturerRegisterText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LecturerLoginActivity.this, registerLecturerActivity.class));
            }
        });
    }
}