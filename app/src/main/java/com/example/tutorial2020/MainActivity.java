package com.example.tutorial2020;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = findViewById(R.id.tv1);
        tv1.setText("Today id a good day.");
        Button bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SendParamsDemo.class);
                intent.putExtra(SendParamsDemo.K_STR, "Input string");
                intent.putExtra(SendParamsDemo.K_BOOL, true);
                intent.putExtra(SendParamsDemo.K_INT, 1111);
                startActivity(intent);
            }
        });
    }
}