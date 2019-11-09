package com.practice.sample.findyouranimal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

// 가슴형 문제
public class test1Activity extends AppCompatActivity {
    boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
    }

    public void t1_bt1Click(View v)
    {
        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test2Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart += 2;
            startActivity(intent);
        }
    }
    public void t1_bt2Click(View v)
    {

        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test2Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart += 4;
            startActivity(intent);
            finish();
        }
    }
    public void t1_bt3Click(View v)
    {

        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test2Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart += 3;
            startActivity(intent);
            finish();
        }
    }
    public void t1_bt4Click(View v)
    {
        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test2Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart += 5;
            startActivity(intent);
            finish();
        }
    }
    public void t1_bt5Click(View v)
    {

        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this,test2Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart +=1;
            startActivity(intent);
            finish();
        }
    }
}
