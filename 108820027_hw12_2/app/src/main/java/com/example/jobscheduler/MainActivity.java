package com.example.jobscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

//    private RadioGroup networkOptions;
//    private Switch mDeviceIdleSwitch;
//    private Switch mDeviceChargingSwitch;
//    private SeekBar mSeekBar;
    private JobScheduler mScheduler;
    private static final int JOB_ID = 0;
    private static final int DAY_JOB_ID = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        networkOptions = findViewById(R.id.networkOptions);
//        mDeviceIdleSwitch = findViewById(R.id.idleSwitch);
//        mDeviceChargingSwitch = findViewById(R.id.chargingSwitch);
//        mSeekBar = findViewById(R.id.seekBar);
//        final TextView seekBarProgress = findViewById(R.id.seekBarProgress);

//        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                if (progress > 0){
//                    seekBarProgress.setText(String.format(Locale.ENGLISH, "%d s", progress));
//                }
//                else {
//                    seekBarProgress.setText(R.string.not_set);
//                }
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
    }

    public void scheduleJob(View view) {
        int selectedNetworkOption = JobInfo.NETWORK_TYPE_UNMETERED;
//        int selectedNetworkID = networkOptions.getCheckedRadioButtonId();
//        int seekBarInteger = mSeekBar.getProgress();
//        boolean seekBarSet = seekBarInteger > 0;
//        switch (selectedNetworkID) {
//            case R.id.noNetwork:
//                selectedNetworkOption = JobInfo.NETWORK_TYPE_NONE;
//                break;
//            case R.id.anyNetwork:
//                selectedNetworkOption = JobInfo.NETWORK_TYPE_ANY;
//                break;
//            case R.id.wifiNetwork:
//                selectedNetworkOption = JobInfo.NETWORK_TYPE_UNMETERED;
//                break;
//        }

        mScheduler = (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
        ComponentName componentName = new ComponentName(getPackageName(), NotificationJobService.class.getName());
        JobInfo.Builder builder = new JobInfo.Builder(JOB_ID, componentName);

//        if (seekBarSet){
//            builder.setOverrideDeadline(seekBarInteger * 1000);
//        }

        JobInfo myJobInfo = builder.build();
        mScheduler.schedule(myJobInfo);
        Toast.makeText(this, "Download Scheduled, Download will run when the constraints are met.", Toast.LENGTH_SHORT).show();

    }

    public void cancelJobs(View view) {
        if (mScheduler != null) {
            mScheduler.cancelAll();
            mScheduler = null;
            Toast.makeText(this, "Job cancelled", Toast.LENGTH_SHORT).show();

        }
    }
}