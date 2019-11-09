package com.practice.sample.findyouranimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class result2Activity extends AppCompatActivity {

    ImageView monkey, lion, hunter, elephant, eagle, cow, black_cat, dog, deer;
    TextView txt_monkey, txt_lion, txt_hunter, txt_elephant, txt_eagle, txt_cow, txt_black_cat, txt_dog, txt_deer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        monkey = findViewById(R.id.monkey);
        lion = findViewById(R.id.lion);
        hunter = findViewById(R.id.hunter);
        elephant = findViewById(R.id.elephant);
        eagle = findViewById(R.id.eagle);
        cow = findViewById(R.id.cow);
        black_cat = findViewById(R.id.black_cat);
        dog = findViewById(R.id.dog);
        deer = findViewById(R.id.deer);

        txt_monkey = findViewById(R.id.txt_monkey_2);
        txt_lion = findViewById(R.id.txt_lion_2);
        txt_hunter = findViewById(R.id.txt_hunter_2);
        txt_elephant = findViewById(R.id.txt_elephant_2);
        txt_eagle = findViewById(R.id.txt_eagle_2);
        txt_cow = findViewById(R.id.txt_cow_2);
        txt_black_cat = findViewById(R.id.txt_cat_2);
        txt_dog = findViewById(R.id.txt_dog_2);
        txt_deer = findViewById(R.id.txt_deer_2);

        Button btn_to_main_2 = findViewById(R.id.btn_to_main_2);
        btn_to_main_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cow.setVisibility(View.INVISIBLE);
                txt_cow.setVisibility(View.INVISIBLE);
                eagle.setVisibility(View.INVISIBLE);
                txt_eagle.setVisibility(View.INVISIBLE);
                elephant.setVisibility(View.INVISIBLE);
                txt_elephant.setVisibility(View.INVISIBLE);
                hunter.setVisibility(View.INVISIBLE);
                txt_hunter.setVisibility(View.INVISIBLE);
                lion.setVisibility(View.INVISIBLE);
                txt_lion.setVisibility(View.INVISIBLE);
                monkey.setVisibility(View.INVISIBLE);
                txt_monkey.setVisibility(View.INVISIBLE);
                MainActivity.Score =0;
                finish();
            }
        });

        if(MainActivity.Score<=20)
        {
            monkey.setVisibility(View.VISIBLE);
            txt_monkey.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>20 && MainActivity.Score<=24)
        {
            lion.setVisibility(View.VISIBLE);
            txt_lion.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>24 && MainActivity.Score<=28)
        {
            hunter.setVisibility(View.VISIBLE);
            txt_hunter.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>28 && MainActivity.Score<=32)
        {
            elephant.setVisibility(View.VISIBLE);
            txt_elephant.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>32 && MainActivity.Score<=36)
        {
            eagle.setVisibility(View.VISIBLE);
            txt_eagle.setVisibility(View.VISIBLE);
        }
        else if(MainActivity.Score>36 )
        {
            cow.setVisibility(View.VISIBLE);
            txt_cow.setVisibility(View.VISIBLE);
        }


    }
}
