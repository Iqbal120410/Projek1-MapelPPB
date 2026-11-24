package com.example.counterapp; // Sesuaikan dengan package projekmu

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project1.R;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView tvCount;
    private Button btnCountUp, btnCountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hubungkan komponen XML dengan Java
        tvCount = findViewById(R.id.tvCount);
        btnCountUp = findViewById(R.id.btnCountUp);
        btnCountDown = findViewById(R.id.btnCountDown);

        // Aksi tombol Count Up (+1)
        btnCountUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvCount.setText(String.valueOf(count));
            }
        });

        // Aksi tombol Count Down (-1)
        btnCountDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                tvCount.setText(String.valueOf(count));
            }
        });
    }
}