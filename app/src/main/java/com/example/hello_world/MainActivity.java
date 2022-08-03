package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        TextView txtHello = findViewById(R.id.helloText);

        EditText editTextName = findViewById(R.id.editTextName);
        String input = "Hello " + editTextName.getText().toString();
        txtHello.setText(input);
    }
}