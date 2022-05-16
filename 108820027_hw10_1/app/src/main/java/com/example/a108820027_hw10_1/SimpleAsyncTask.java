package com.example.a108820027_hw10_1;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Integer, String> {


    private WeakReference<TextView> mTextView;
    private WeakReference<ProgressBar> mProgressBar;

    private int current;

    SimpleAsyncTask(TextView tv, ProgressBar pb) {
        mTextView = new WeakReference<>(tv);
        mProgressBar = new WeakReference<>(pb);
    }


    @Override
    protected String doInBackground(Void... voids) {
        // Generate a random number between 0 and 10
        Random r = new Random();
        int n = r.nextInt(11);

        // Make the task take long enough that we have
        // time to rotate the phone while it is running
        int s = n * 1000;
        mProgressBar.get().setMax(s);
        int percent = s / 100;


        try {
            for(current = 0; current < s; current += percent){
                Thread.sleep(percent);
                publishProgress(current);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return a String result
        return "Awake at last after sleeping for " + s + " milliseconds!";
    }

    protected void onProgressUpdate(Integer... current){
        mProgressBar.get().setProgress(current[0]);
    }

    protected void onPostExecute(String result) {
        mTextView.get().setText(result);
    }
}
