package com.example.gradery;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button currentSemesterButton = findViewById(R.id.currentSemesterButton);
        Button pastSemestersButton = findViewById(R.id.pastSemestersButton);

        currentSemesterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CurrentSemesterActivity.class);
                startActivity(intent);
            }
        });

        pastSemestersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PastSemestersActivity.class);
                startActivity(intent);
            }
        });
    }
}