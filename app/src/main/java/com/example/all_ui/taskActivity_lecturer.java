package com.example.all_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class taskActivity_lecturer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_lecturer);

        FloatingActionButton addTaskBtn = findViewById(R.id.addTaskBtn);

        // onclick listener for the add task floating button
        addTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(taskActivity_lecturer.this, add_task_lecturer.class));
            }
        });
    }
}