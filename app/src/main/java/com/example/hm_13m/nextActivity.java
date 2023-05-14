package com.example.hm_13m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class nextActivity extends AppCompatActivity {
    private TextView first2, second2, third2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        first2 = findViewById(R.id.first2);
        second2 = findViewById(R.id.second2);
        third2 = findViewById(R.id.third2);

        String one2 = getIntent().getStringExtra("keyone");
        String two2 = getIntent().getStringExtra("keytwo");
        String three2 = getIntent().getStringExtra("keythree");

        first2.setText(one2);
        second2.setText(two2);
        third2.setText(three2);
    }
}