package com.example.all_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class studentLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);






        TextView studentRegisterText = findViewById(R.id.studentRegisterText);
        // onclick listener for the Student register text
        studentRegisterText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentLoginActivity.this, registerStudentActivity.class));
            }
        });

    }
}