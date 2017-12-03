package com.edugame.edugame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SubjectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        setTitle("Subjects");

        TextView line1 = findViewById(R.id.line1);
        line1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SubjectsActivity.this, "Maths selected", Toast.LENGTH_SHORT).show();
            }
        });

        TextView line2 = findViewById(R.id.line2);
        line2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SubjectsActivity.this, "English selected", Toast.LENGTH_SHORT).show();
            }
        });

        TextView line3 = findViewById(R.id.line3);
        line3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SubjectsActivity.this, "Science selected", Toast.LENGTH_SHORT).show();
            }
        });

        TextView line4 = findViewById(R.id.line4);
        line4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SubjectsActivity.this, "Humanities selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
