package com.example.listycity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    TextView cityNameText;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        cityNameText = findViewById(R.id.cityNameText);
        backButton = findViewById(R.id.backButton);

        String cityName = getIntent().getStringExtra("cityName");

        if (cityName != null) {
            cityNameText.setText(cityName);
        }

        backButton.setOnClickListener(v -> finish());
    }
}