package com.practice.sample.findyouranimal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class test2Activity extends AppCompatActivity {
    boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
    }


    public void t2_bt1Click(View v)
    {

        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test3Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score += 5;
            startActivity(intent);
            finish();
        }
    }
    public void t2_bt2Click(View v)
    {
        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test3Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score += 4;
            startActivity(intent);
            finish();
        }
    }
    public void t2_bt3Click(View v)
    {
        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test3Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score += 3;
            startActivity(intent);
            finish();
        }
    }
    public void t2_bt4Click(View v)
    {
        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test3Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score += 1;
            startActivity(intent);
            finish();
        }
    }
    public void t2_bt5Click(View v)
    {

        if(clicked == false) {
            clicked = true;
            Intent intent = new Intent(this, test3Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            MainActivity.Score += 2;
            startActivity(intent);
            finish();
        }
    }

}
