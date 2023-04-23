package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String name ="";
        String age ="";

        Intent intent = getIntent();
        if (intent != null){
            name = intent.getStringExtra("name");
            age = intent.getStringExtra("age");
        }
        TextView TextViewName =findViewById(R.id.textViewName);
        TextView TextViewAge =findViewById(R.id.textViewAge);

        TextViewName.setText(name);
        TextViewAge.setText(age);


    }
}