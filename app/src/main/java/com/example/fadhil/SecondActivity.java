package com.example.fadhil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button btnFirtFragment, btnSecondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnFirtFragment = findViewById(R.id.btnFirstFragment);
        btnSecondFragment = findViewById(R.id.btnSecondFragment);

        btnFirtFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadfragment(new FirstFragment());
            }
        });

        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFragment());
            }
        });

    }

    private void loadfragment (Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.FrameLayout, Fragment);
        fragmentTransaction.commit();
    }
}