package com.example.a108820027_prob1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView par1;
    private TextView par2;
    private TextView par3;
    private TextView par4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        par1 = findViewById(R.id.textView2);
        par2 = findViewById(R.id.textView3);
        par3 = findViewById(R.id.textView4);
        par4 = findViewById(R.id.textView5);

        par1.setText(intent.getStringExtra(MainActivity.EXTRA_NAME));
        par2.setText(intent.getStringExtra(MainActivity.EXTRA_GENDER));
        par3.setText(intent.getStringExtra(MainActivity.EXTRA_DEPARTMENT));
        par4.setText(intent.getStringExtra(MainActivity.EXTRA_HOBBY));

    }
}