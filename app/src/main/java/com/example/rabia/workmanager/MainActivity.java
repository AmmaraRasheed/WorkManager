package com.example.rabia.workmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UploadTask.context=MainActivity.this;
        PeriodicWorkRequest periodicWorkRequest=new PeriodicWorkRequest.Builder(UploadTask.class,15,TimeUnit.MINUTES).build();
        WorkManager.getInstance().enqueue(periodicWorkRequest);


    }
    public  void Sum(View view){

//        OneTimeWorkRequest oneTimeWorkRequest=new OneTimeWorkRequest.Builder(UploadTask.class).build();
//        WorkManager.getInstance().enqueue(oneTimeWorkRequest);
//        Toast.makeText(getApplicationContext(),"Sum is "+UploadTask.Sum,Toast.LENGTH_LONG).show();

    }
}
