package com.practice.sample.findyouranimal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class test3Activity extends AppCompatActivity {
    boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
    }


    public void t3_bt1Click(View v)
    {
        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test4Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart += 1;
            startActivity(intent);
            finish();
        }
    }
    public void t3_bt2Click(View v)
    {
        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test4Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart += 5;
            startActivity(intent);
            finish();
        }
    }
    public void t3_bt3Click(View v)
    {
        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test4Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart += 2;
            startActivity(intent);
            finish();
        }
    }
    public void t3_bt4Click(View v)
    {

        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test4Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart += 4;
            startActivity(intent);
            finish();
        }
    }
    public void t3_bt5Click(View v)
    {

        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test4Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score_heart += 3;
            startActivity(intent);
            finish();
        }
    }
}
