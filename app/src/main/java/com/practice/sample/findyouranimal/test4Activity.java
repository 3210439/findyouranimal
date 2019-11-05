package com.practice.sample.findyouranimal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class test4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4);
    }

    public void t4_bt1Click(View v)
    {
        Intent intent = new Intent(this,test5Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        MainActivity.Score +=4;
        startActivity(intent);
        finish();
    }
    public void t4_bt2Click(View v)
    {
        Intent intent = new Intent(this,test5Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        MainActivity.Score +=1;
        startActivity(intent);
        finish();
    }
    public void t4_bt3Click(View v)
    {
        Intent intent = new Intent(this,test5Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        MainActivity.Score +=2;
        startActivity(intent);
        finish();
    }
    public void t4_bt4Click(View v)
    {
        Intent intent = new Intent(this,test5Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        MainActivity.Score +=3;
        startActivity(intent);
        finish();
    }
    public void t4_bt5Click(View v)
    {
        Intent intent = new Intent(this,test5Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        MainActivity.Score +=5;
        startActivity(intent);
        finish();
    }
}
