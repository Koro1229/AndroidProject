package com.example.a108820027_hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "-------------");
        Log.d(LOG_TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.textView_count);
        mEditText = findViewById(R.id.editText_main);

        if(savedInstanceState != null){
            mShowCount.setText(savedInstanceState.getString("show_count"));
            mEditText.setText(savedInstanceState.getString("edit_text"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        Log.d(LOG_TAG, "-------------------------------------------------");
        Log.d(LOG_TAG, "onSaveState");
        Log.d(LOG_TAG, "-------------------------------------------------");

        super.onSaveInstanceState(outState);
        if(mEditText.getText().toString() != ""){
            outState.putString("edit_text", mEditText.getText().toString());
        }
        if(mShowCount.getVisibility() == View.VISIBLE){
            outState.putString("show_count", mShowCount.getText().toString());
        }
    }



    public void handleCountButtonClicked(View view) {
        mCount++;

        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    @Override
    public void onStart(){
        Log.d(LOG_TAG, "onStart");
        super.onStart();
    }

    @Override
    public void onPause(){
        Log.d(LOG_TAG, "onPause");
        super.onPause();
    }

    @Override
    public void onRestart(){
        Log.d(LOG_TAG, "onRestart");
        super.onRestart();
    }

    @Override
    public void onResume(){
        Log.d(LOG_TAG, "onResume");
        super.onResume();
    }

    @Override
    public void onStop(){
        Log.d(LOG_TAG, "onStop");
        super.onStop();
    }

    @Override
    public void onDestroy(){
        Log.d(LOG_TAG, "onDestroy");
        super.onDestroy();
    }
}