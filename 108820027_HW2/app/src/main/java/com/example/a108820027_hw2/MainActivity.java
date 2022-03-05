package com.example.a108820027_hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mZero;
    private Button mCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
        mZero = (Button) findViewById(R.id.button_zero);
        mCountButton = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }

    public void addCount(View view) {
        mCount++;

        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if (mZero != null){
            mZero.setBackgroundColor(getResources().getColor(R.color.black));
        }

        if (mCount % 2 == 1)
            view.setBackgroundColor(getResources().getColor(R.color.red));
        else if (mCount % 2 == 0)
            view.setBackgroundColor((getResources().getColor(R.color.green)));
    }

    public void refreshZero(View view) {
        mCount = 0;

        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if (mZero != null){
            view.setBackgroundColor(getResources().getColor(R.color.gray));
        }

        if (mCountButton != null){
            mCountButton.setBackgroundColor((getResources().getColor(R.color.green)));
        }
    }
}