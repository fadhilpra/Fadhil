package com.example.fadhil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        preferences
        TextView textFirst = findViewById(R.id.textFirst);
        Intent intent = getIntent();
        String nama = intent.getStringExtra ("nama");

        textFirst.setText(nama);
    }
}