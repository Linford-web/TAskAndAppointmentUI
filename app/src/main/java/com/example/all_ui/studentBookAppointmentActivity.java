package com.example.all_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class studentBookAppointmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_book_appointment);

        ImageButton studentAppointmentBackBtn = findViewById(R.id.studentAppointmentBackBtn);

        // onclick listener for the for the back button
        studentAppointmentBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentBookAppointmentActivity.this, studentAppointmentActivity.class));
            }
        });

    }
}