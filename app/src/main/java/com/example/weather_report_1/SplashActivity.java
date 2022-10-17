package com.example.weather_report_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        ImageView imageView = findViewById(R.id.i_wish);

        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation animation = new AlphaAnimation(1.0f,0f);
        animation.setDuration(2500);
        animation.setFillAfter(true);
        animationSet.addAnimation(animation);
        imageView.startAnimation(animationSet);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this,SplashActivity_1.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        },1900);


    }
}