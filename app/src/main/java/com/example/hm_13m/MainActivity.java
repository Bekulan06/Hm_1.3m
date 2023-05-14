package com.example.hm_13m;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText first, second, third;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = first.getText().toString();
                String two = second.getText().toString();
                String three = third.getText().toString();

                Intent intent = new Intent(MainActivity.this, nextActivity.class);
                intent.putExtra("keyone", one);
                intent.putExtra("keytwo", two);
                intent.putExtra("keythree", three);
                startActivity(intent);
            }
        });

    }

}