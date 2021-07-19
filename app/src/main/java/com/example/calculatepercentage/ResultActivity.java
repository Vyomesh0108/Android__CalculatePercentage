package com.example.calculatepercentage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView percent,grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        percent = findViewById(R.id.percent);
        grade = findViewById(R.id.grade);

        Intent intent = getIntent();
        String per = intent.getStringExtra("per");
        String gra = intent.getStringExtra("grade");

        percent.setText("Percentage is "+per);
        grade.setText("Grade is "+gra);
    }
}