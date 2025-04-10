package com.example.latihan1_10pplg2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class kalkulator extends AppCompatActivity {

    EditText edAngka1;
    EditText edAngka2;
    Button btnPlus;
    Button btnminus;
    Button btnkali;
    Button btnbagi;
    Button btnreset;
    TextView tvResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);

        edAngka1 = (EditText) findViewById(R.id.edAngka1);
        edAngka2 = (EditText) findViewById(R.id.edAngka2);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnminus = (Button) findViewById(R.id.btnMinus);
        btnkali = (Button) findViewById(R.id.btnKali);
        btnbagi = (Button) findViewById(R.id.btnBagi);
        btnreset = (Button) findViewById(R.id.btnReset);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());
                int result = angka1 + angka2;

                tvResult.setText(result + "");
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());
                int result = angka1 - angka2;

                tvResult.setText(result + "");
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());
                int result = angka1 * angka2;

                tvResult.setText(result + "");
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());
                int result = angka1 / angka2;

                tvResult.setText(result + "");
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edAngka1.setText("");
                edAngka2.setText("");
                tvResult.setText("");
            }
        });
    }
}