package com.example.uts_pbp_f_kelompok_3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NotificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent){
        String message = intent.getStringExtra("toastMessage");
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
