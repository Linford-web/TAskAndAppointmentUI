package com.example.all_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class studentAppointmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_appointment);

        ImageButton studentAppointmentBackBtn = findViewById(R.id.studentAppointmentBackBtn);
        FloatingActionButton studentBookAppointmentBtn = findViewById(R.id.studentBookAppointmentBtn);


        // onclick listener for the back image button
        studentAppointmentBackBtn.setOnClickListener(view -> startActivity(new Intent(studentAppointmentActivity.this,studentDash.class)));

        // onclick listener for the floating book appointment button
        studentBookAppointmentBtn.setOnClickListener(view -> startActivity(new Intent(studentAppointmentActivity.this, studentBookAppointmentActivity.class)));


    }
}