package com.example.a108820027_hw8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int mBatteryCount;
    private ImageView mShowBattery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBatteryCount = 0;
        mShowBattery = findViewById(R.id.showBattery);
        mShowBattery.setImageLevel(mBatteryCount);

    }

    public void decreaseBattery(View view) {
        if(mBatteryCount > 0) {
            mBatteryCount -= 1;
        }

        mShowBattery.setImageLevel(mBatteryCount);

    }

    public void increaseBattery(View view) {
        if(mBatteryCount < 7) {
            mBatteryCount += 1;
        }

        mShowBattery.setImageLevel(mBatteryCount);
    }
}