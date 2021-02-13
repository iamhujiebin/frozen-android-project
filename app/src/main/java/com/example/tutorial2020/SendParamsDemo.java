package com.example.tutorial2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SendParamsDemo extends AppCompatActivity {

    public static final String K_INT = "k_int";
    public static final String K_BOOL = "k_bool";
    public static final String K_STR = "k_str";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_params_demo);
        gotInput();
    }

    private void gotInput() {
        Intent intent = getIntent();
        if (intent != null) {
            int i = intent.getIntExtra(K_INT, -1);
            boolean b = intent.getBooleanExtra(K_BOOL, false);
            String str = intent.getStringExtra(K_STR);
            Log.d("jiebin", "gotInput: i:" + i + ", b: " + b + ", str: " + str);
            TextView tv3 = findViewById(R.id.tv3);
            tv3.setText(str);
        } else {
            Log.d("jiebin", "gotInput: input null.");
        }
    }
}