package com.practice.sample.findyouranimal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class test8Activity extends AppCompatActivity {

    private boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test8);
    }


    public void t8_bt1Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test9Activity.class);
        MainActivity.Score +=3;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
    public void t8_bt2Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test9Activity.class);
        MainActivity.Score +=4;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
    public void t8_bt3Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test9Activity.class);
        MainActivity.Score +=5;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
    public void t8_bt4Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test9Activity.class);
        MainActivity.Score +=2;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
    public void t8_bt5Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test9Activity.class);
        MainActivity.Score +=1;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
}
