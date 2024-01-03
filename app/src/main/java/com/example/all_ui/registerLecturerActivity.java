package com.example.all_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class registerLecturerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_lecturer);

        TextView lecturerLoginText = findViewById(R.id.lecturerLoginTxt);


        // onclick listener for the Login Text
        lecturerLoginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(registerLecturerActivity.this,LecturerLoginActivity.class));
            }
        });
    }
}