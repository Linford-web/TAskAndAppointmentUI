package com.example.all_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class studentDash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dash);


        ImageButton studentTaskBtn = findViewById(R.id.studentTaskBtn);
        ImageButton studentAppointmentBtn =findViewById(R.id.studentAppointmentBtn);
        ImageButton menuBtn = findViewById(R.id.menuBtn);


        //onclick listener for menu image_button
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentDash.this,menuActivity.class));
            }
        });


        // onclick listener for task image_button
        studentTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentDash.this,taskActivity.class));
            }
        });

        // onclick listener for appointment_button
        studentAppointmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentDash.this, studentAppointmentActivity.class));
            }
        });

    }
}