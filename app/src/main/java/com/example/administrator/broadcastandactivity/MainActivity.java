package com.example.administrator.broadcastandactivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button button1=null;
     Button button2=null;
     Button button3=null;
     EditText editText=null;
  static   EditText editText7=null;                                  //static
    broadcastReceiver xx=null;                                      //自定义广播
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        editText=(EditText)findViewById(R.id.editText);
        editText7=(EditText)findViewById(R.id.editText7);
            xx=new broadcastReceiver();                                  //广播实例化

       /* IntentFilter filter = new IntentFilter();
        filter.addAction("asd.mm");                                     //广播频率自定义
        registerReceiver(xx, filter);                                    //注册广播
*/
        button1.setOnClickListener(new View.OnClickListener() {            //AAA-->BBB
            @Override
            public void onClick(View v) {
        Intent   intent =   new Intent();
              intent.putExtra("name",editText.getText().toString() );     // 前面是信号变量 后面是要传送的内容
              //intent.putExtra("age", 20);
              intent.setClass(MainActivity.this, BBBActivity.class);      //制定在哪些页面传送
                              //当前类名		启动类名
              startActivity(intent);                                      //发送信号
          }
      });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                                 //AAA-->CCC
                Intent   intent =   new Intent();
                intent.putExtra("name",editText.getText().toString() );
                //intent.putExtra("age", 20);
                intent.setClass(MainActivity.this,CCCActivity.class);
                //当前类名		启动类名
                startActivityForResult(intent,1000);                   //

            }

        });





        button3.setOnClickListener(new View.OnClickListener() {               //AAA-->DDD-->AAA 加上广播
            @Override
            public void onClick(View v) {

                Intent   intent =   new   Intent();
                intent.putExtra("name",editText.getText().toString() );
                //intent.putExtra("age", 20);
                intent.setClass(MainActivity.this,DDDActivity.class);
                //当前类名		启动类名
                startActivity(intent);

            }
        });

    }
    @Override                                                                 //重载接收数据的函数
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode, resultCode,data);
        if(requestCode == 1000 && resultCode == 1001)
        {
            String result_value = data.getStringExtra("result");
            Toast.makeText(MainActivity.this, result_value, Toast.LENGTH_SHORT).show();
        }
    }


}
