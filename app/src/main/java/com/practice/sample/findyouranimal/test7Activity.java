package com.practice.sample.findyouranimal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class test7Activity extends AppCompatActivity {

    private boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test7);
    }


    public void t7_bt1Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test8Activity.class);
        MainActivity.Score_viscera +=5;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
    public void t7_bt2Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test8Activity.class);
        MainActivity.Score_viscera +=4;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
    public void t7_bt3Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test8Activity.class);
        MainActivity.Score_viscera +=3;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
    public void t7_bt4Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test8Activity.class);
        MainActivity.Score_viscera +=2;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
    public void t7_bt5Click(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent = new Intent(this,test8Activity.class);
        MainActivity.Score_viscera +=1;
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }}
}
