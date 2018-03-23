package com.example.administrator.broadcastandactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DDDActivity extends AppCompatActivity {
private EditText editText5=null;
    Button button6=null;
    private EditText editText6=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ddd);
        editText5=(EditText)findViewById(R.id.editText5);
        button6=(Button)findViewById(R.id.button6);
        editText6=(EditText) findViewById(R.id.editText6);


        Intent intent = getIntent();
        String ddd = intent.getStringExtra("name");
        editText5.setText(ddd);


   button6.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
         //  Intent intent = new Intent("asd.mm");                          //动态注册 DDDactivity要加上  IntentFilter filter = new IntentFilter();filter.addAction("asd.mm");                                     //广播频率自定义registerReceiver(xx, filter);                                    //注册广播
           Intent intent =new Intent("abc.123");                            //静态注册 (mainifest加<receiver>)
           intent.putExtra("data", editText6.getText().toString());
           sendBroadcast(intent);
           finish();


       }
   });
    }
}
