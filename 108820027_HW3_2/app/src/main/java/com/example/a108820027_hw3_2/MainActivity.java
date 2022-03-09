package com.example.a108820027_hw3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    public static final String COUNT_MESSAGE = "com.example.a108820027_hw3_2.extra.COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;

        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void launchHello(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = Integer.toString(mCount);
        intent.putExtra(COUNT_MESSAGE, message);
        startActivity(intent);
    }
}