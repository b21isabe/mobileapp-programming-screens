package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickbutton = findViewById(R.id.clickbutton);
        final EditText age = findViewById(R.id.editTextAge);
        final EditText name = findViewById(R.id.editTextName);

        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_second.class);
                intent.putExtra("name", name.getText().toString()); // Optional
                intent.putExtra("age",age.getText().toString()); // Optional
                startActivity(intent);
            }
        });

    }
}
