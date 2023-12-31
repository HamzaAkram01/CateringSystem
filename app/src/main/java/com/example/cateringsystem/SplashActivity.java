package com.example.cateringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView logo;
    final static int SPLASH_SCREEN=4500;


    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this,LogoActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2*1000);



//        logo = findViewById(R.id.logo);
//        rotateAnimation();
//        logo.animate().translationY(-3000).setDuration(1000).setStartDelay(3500);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(getApplicationContext(),LogoActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        },SPLASH_SCREEN);

    }

    private void rotateAnimation() {
        animation = AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
        logo.startAnimation(animation);
    }
//    private void rotateAnimation(){
//        animation = AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
//        logo.startAnimation(animation);
//    }
}