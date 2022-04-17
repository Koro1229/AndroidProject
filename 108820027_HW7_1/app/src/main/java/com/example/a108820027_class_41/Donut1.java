package com.example.a108820027_class_41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Donut1 extends AppCompatActivity {

    public static final String EXTRA_DONUT_MESSAGE = "com.example.a108820027_class_41.extra.DONUT_MESSAGE";
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut1);
        Intent intent = getIntent();
        mOrderMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }

    public void OrderPage(View view) {
        Intent intent = new Intent(Donut1.this, OrderDonutActivity.class);
        intent.putExtra(EXTRA_DONUT_MESSAGE, mOrderMessage);
        startActivity(intent);
    }
}