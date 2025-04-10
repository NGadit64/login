package com.example.latihan1_10pplg2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edNama;
    EditText edPassword;
    Button btnLogin;


   // @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //sambungkan ke xml
        edNama = (EditText) findViewById(R.id.edNama);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edNama.getText().toString().equals("admin") && edPassword.getText().toString().equals("admin123"))
                {
                    Toast.makeText(MainActivity.this, "login berhasil", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, kalkulator.class);
                    startActivity(intent);
                    finish();

                }else{
                    Toast.makeText(MainActivity.this, "login gagal", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
