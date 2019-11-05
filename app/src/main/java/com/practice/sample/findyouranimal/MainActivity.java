package com.practice.sample.findyouranimal;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    static int Score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView title = (TextView)findViewById(R.id.txt_Title);
        Typeface cute = Typeface.createFromAsset(getAssets(),"cute.ttf");
        title.setTypeface(cute);
        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-1939547718918721~5094320877");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void ClickStart(View v)
    {
        Intent intent = new Intent(this,ReadyActivity.class);
        startActivity(intent);
    }
    public void ClickExit(View v)
    {
        // 앱종료 구현
        finish();
    }
    public void ClickIcon(View v)
    {
        Toast.makeText(getApplicationContext(),"this app icon from \nhttps://www.iconfinder.com/Icojam",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        Score = 0;
        super.onResume();
    }
}
