package com.example.administrator.broadcastandactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CCCActivity extends AppCompatActivity {
  EditText editText3=null;
    Button button5=null;
    EditText editText4=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccc);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);
        button5=(Button)findViewById(R.id.button5);



        Intent intent = getIntent();                              //得到跳转到该Activity的Intent对象
        String ccc = intent.getStringExtra("name");
        // int age = intent.getIntExtra("age", 10);
        editText3.setText(ccc);


     button5.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             Intent intent = new Intent();                       //初始化 准备传值
             intent.putExtra("result", editText4.getText().toString());
                                                                  //调用setResult方法表示将Intent对象返回给之前的那个Activity，这样就可以在//onActivityResult方法中得到Intent对象
             setResult(1001, intent);		                      //1001代表了本Activity，即C
             finish();	                                          //    结束当前这个Activity对象的生命
         }
     });





    }
}
