package com.example.Translator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button translateButton = findViewById(R.id.translateBtn);

        translateButton.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, TranslateActivity.class);
            startActivity(i);
        });

        Button ocrButton = findViewById(R.id.ocrBtn);

        ocrButton.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, OcrActivity.class);
            startActivity(i);
        });
    }
}