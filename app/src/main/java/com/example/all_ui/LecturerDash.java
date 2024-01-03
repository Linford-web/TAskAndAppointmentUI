package com.example.all_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LecturerDash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_dash);


        ImageButton lecturerTaskBtn = findViewById(R.id.lecturerTaskBtn);
        ImageButton lecturerAppointmentBtn =findViewById(R.id.lecturerAppointmentBtn);
        ImageButton menuBtn = findViewById(R.id.menuBtn);


        //onclick listener for menu image_button
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LecturerDash.this, menuActivity.class));
            }
        });


        // onclick listener for task image_button
        lecturerTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LecturerDash.this,taskActivity_lecturer.class));
            }
        });

        // onclick listener for appointment_button
        lecturerAppointmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LecturerDash.this, lecturerAppointmentActivity.class));
            }
        });
    }
}