package com.example.all_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button btnLoginStudent = findViewById(R.id.btnLoginStudent);
        Button btnLoginLecturer = findViewById(R.id.btnLoginLecturer);
        //onclick student button user is directed to user-selected page
        btnLoginStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handles Login As Student button when clicked
                navigateToStudentLoginActivity();
            }

            private void navigateToStudentLoginActivity() {
                Intent intent = new Intent(start_activity.this,studentLoginActivity.class);
                startActivity(intent);
            }
        });
        //onclick student button user is directed to user-selected page
        btnLoginLecturer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle Login as Lecturer when clicked
                navigateToLecturerLoginActivity();
            }

            private void navigateToLecturerLoginActivity() {
                Intent intent = new Intent(start_activity.this,studentLoginActivity.class);
                startActivity(intent);
            }
        });

    }
}