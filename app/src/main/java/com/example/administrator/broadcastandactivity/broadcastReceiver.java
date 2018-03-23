package com.example.administrator.broadcastandactivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/3/22.
 */
public    class broadcastReceiver extends BroadcastReceiver {
    public broadcastReceiver()
    {
    }
          @Override
          public void onReceive(Context context, Intent intent) {
              String data = intent.getStringExtra("data");
                 MainActivity.editText7.setText(data);                       //editText显示数据  其中editText定义为static
                     Toast.makeText(context,data ,Toast.LENGTH_SHORT).show();


          }
    }