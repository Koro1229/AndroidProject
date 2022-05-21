package com.example.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    private static final String ACTION_CUSTOM_BROADCAST = BuildConfig.APPLICATION_ID + ".ACTION_CUSTOM_BROADCAST";
    private static final String EXTRA_NUMBER = "com.example.a108820027_hw11_1.extra.NUMBER";

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        String message = intent.getStringExtra(EXTRA_NUMBER);
        int number = Integer.valueOf(message);
        if (intentAction != null) {
            String toastMessage = "unknown intent action";
            switch (intentAction){
                case ACTION_CUSTOM_BROADCAST:
                    toastMessage = String.valueOf(number * number);
                    break;
            }
            Toast.makeText(context, "Square number is " + toastMessage, Toast.LENGTH_SHORT).show();
        }
    }
}