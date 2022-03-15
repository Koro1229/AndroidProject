package com.example.a108820027_test_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.a108820027_test_21.extra.REPLY";
    private EditText mReply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);

        mReply = findViewById(R.id.editText_second);
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

    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);

        setResult(RESULT_OK, replyIntent);

        Log.d(LOG_TAG, "End SecondActivity");
        finish();

    }
}