package com.example.rabia.workmanager;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;

import androidx.work.Worker;

public class UploadTask extends Worker {

    public  static Context context;
    @NonNull
    @Override
    public Result doWork() {
        Intent intent=new Intent();
        PendingIntent pendingIntent=PendingIntent.getActivity(context,0,intent,0);
        NotificationCompat.Builder notification=new NotificationCompat.Builder(context,"channelId")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentText("MyMessage")
                .setContentTitle("new")
                .setContentIntent(pendingIntent);
        android.app.NotificationManager manager=(android.app.NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0,notification.build());

        return Worker.Result.SUCCESS;
    }

//    public  static Integer Number1,Number2,Sum;
//    @NonNull
//    @Override
//    public Result doWork() {
//
////        Number1=23;
////        Number2=22;
////        Sum=Number1+Number2;
//        return Worker.Result.SUCCESS;
//    }
}
