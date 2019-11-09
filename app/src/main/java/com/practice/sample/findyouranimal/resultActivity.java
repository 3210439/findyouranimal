package com.practice.sample.findyouranimal;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.lang.reflect.Type;

public class resultActivity extends AppCompatActivity {

    TextView CP;
    TextView noruu;
    TextView giraffe;
    TextView shark;
    TextView phoenix;
    TextView cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        CP=(TextView)findViewById(R.id.txt_cutePig);
        noruu=(TextView)findViewById(R.id.txt_noeDeer);
        giraffe=(TextView)findViewById(R.id.txt_giraffe);
        shark=(TextView)findViewById(R.id.txt_shark);
        phoenix=(TextView)findViewById(R.id.txt_phoenix);
        cat=(TextView)findViewById(R.id.txt_cat);

        Typeface cute = Typeface.createFromAsset(getAssets(),"cute.ttf");
        CP.setTypeface(cute);
        noruu.setTypeface(cute);
        giraffe.setTypeface(cute);
        shark.setTypeface(cute);
        phoenix.setTypeface(cute);
        cat.setTypeface(cute);


        if(MainActivity.Score<=20)
        {
            CP.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>20 && MainActivity.Score<=24)
        {
            noruu.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>24 && MainActivity.Score<=28)
        {
            cat.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>28 && MainActivity.Score<=32)
        {
            giraffe.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>32 && MainActivity.Score<=36)
        {
            shark.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>36 )
        {
            phoenix.setVisibility(View.VISIBLE);
        }

    }
    public void clickMain(View v)
    {
        CP.setVisibility(View.INVISIBLE);
        noruu.setVisibility(View.INVISIBLE);
        giraffe.setVisibility(View.INVISIBLE);
        shark.setVisibility(View.INVISIBLE);
        phoenix.setVisibility(View.INVISIBLE);
        cat.setVisibility(View.INVISIBLE);
        MainActivity.Score =0;
        finish();
    }
}
