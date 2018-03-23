package com.example.administrator.broadcastandactivity;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.PrivateKey;

public class BBBActivity extends AppCompatActivity {
        Button button4=null;
       EditText editText2=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbb);

        button4=(Button)findViewById(R.id.button4);
        editText2=(EditText)findViewById(R.id.editText2);

        Intent intent = getIntent();                      //得到跳转到该Activity的Intent对象
        String bbb = intent.getStringExtra("name");       //将出的东西实例化 转换为STRING
       // int age = intent.getIntExtra("age", 10);
        editText2.setText(bbb);                               //显示STRING
              button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          finish();
            }
        });

    }
}
