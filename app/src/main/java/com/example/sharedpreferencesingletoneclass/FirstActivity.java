package com.example.sharedpreferencesingletoneclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import org.xml.sax.HandlerBase;

public class FirstActivity extends AppCompatActivity {

    SharedPreference sharedPreference;
    private static int time_out=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        sharedPreference=new SharedPreference(this);
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               if(sharedPreference.getIslogin()){
                   startActivity(new Intent(FirstActivity.this,MainActivity2.class));
                   finish();
               }else{
                   startActivity(new Intent(FirstActivity.this,MainActivity.class));
                   finish();
               }
           }
       },time_out);
    }
}