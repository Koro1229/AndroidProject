package com.example.a108820027_class_41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IceCream1 extends AppCompatActivity {

    public static final String EXTRA_ICE_MESSAGE = "com.example.a108820027_class_41.extra.ICE_MESSAGE";
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream1);
        Intent intent = getIntent();
        mOrderMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }

    public void OrderPage(View view) {
        Intent intent = new Intent(IceCream1.this, OrderIceCreamActivity.class);
        intent.putExtra(EXTRA_ICE_MESSAGE, mOrderMessage);
        startActivity(intent);
    }
}