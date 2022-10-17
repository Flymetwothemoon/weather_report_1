package com.example.weather_report_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

public class SplashActivity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        ImageView imageView = findViewById(R.id.i_hate);

        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation animation = new AlphaAnimation(0f,1.0f);
        animation.setDuration(1300);
        animation.setFillAfter(true);
        animationSet.addAnimation(animation);
        imageView.startAnimation(animationSet);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity_1.this,MainActivity.class);
                SplashActivity_1.this.startActivity(intent);
                SplashActivity_1.this.finish();
            }
        },1000);


    }
    }
