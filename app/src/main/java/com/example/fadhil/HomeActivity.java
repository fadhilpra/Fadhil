package com.example.fadhil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {
    private Button btnActivity, btnFragmen;
    private EditText addnama;
     PreferencesHelper preferencesHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnActivity = findViewById(R.id.btnActivity);
        btnFragmen = findViewById(R.id.btnFragmen);
        addnama = findViewById(R.id.addnama);
        PreferencesHelper = PreferencesHelper.getINSTANCE(getApplicationContext());

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View -> {
                preferencesHelper.setLogin(true);
                preferencesHelper.setNama(addnama.getText().toString);
                Intent homeIntent = new Intent(HomeActivity.this, FirstActivity.class);
                        startActivity(homeIntent);
                        homeIntent.putExtra("nama", addnama.getText().toString());
            }
        });
                        btnFragmen.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent homeIntent = new Intent(HomeActivity.this, FirstActivity.class);
                                startActivity(homeIntent);
                            }
                        });
    }
}