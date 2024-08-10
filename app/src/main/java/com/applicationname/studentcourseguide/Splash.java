package com.applicationname.studentcourseguide;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Splash extends AppCompatActivity {
private TextView txt;
private LottieAnimationView lottieAnimationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        // Load and display the banner ad


        getSupportActionBar().hide();
    txt=findViewById(R.id.txt);
        int images[]={R.drawable.c1,R.drawable.c2};


        ObjectAnimator anim = ObjectAnimator.ofInt(txt, "textColor", Color.WHITE, Color.CYAN,
                Color.BLUE);
        anim.setDuration(5000);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.start();
        lottieAnimationView=findViewById(R.id.animation_view);


                Handler h =new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i =new Intent(Splash.this,Listviewnumcs.class);
                        startActivity(i);
                        finish();
                    }
                },8000);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

            }



}