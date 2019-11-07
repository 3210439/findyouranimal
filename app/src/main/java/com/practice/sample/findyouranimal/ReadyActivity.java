package com.practice.sample.findyouranimal;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class ReadyActivity extends AppCompatActivity {

    private boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready);

        TextView tv = (TextView)findViewById(R.id.textView);
        Typeface cute = Typeface.createFromAsset(getAssets(),"cute.ttf");
        tv.setTypeface(cute);
    }


    public void StartClick(View v)
    {
        if(clicked == false) {
            clicked = true;
        Intent intent= new Intent(this,test1Activity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish( );
    }}
}
