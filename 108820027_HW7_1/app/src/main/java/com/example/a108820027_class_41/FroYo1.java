package com.example.a108820027_class_41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FroYo1 extends AppCompatActivity {

    public static final String EXTRA_FROYO_MESSAGE = "com.example.a108820027_class_41.extra.FROYO_MESSAGE";
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fro_yo1);
        Intent intent = getIntent();
        mOrderMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    }

    public void OrderPage(View view) {
        Intent intent = new Intent(FroYo1.this, OrderFroYoActivity.class);
        intent.putExtra(EXTRA_FROYO_MESSAGE, mOrderMessage);
        startActivity(intent);
    }
}