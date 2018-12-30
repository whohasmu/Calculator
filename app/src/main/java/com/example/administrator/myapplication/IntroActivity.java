package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class IntroActivity extends AppCompatActivity {

    Animation anim;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        view = findViewById(R.id.View);
         anim = AnimationUtils.loadAnimation(IntroActivity.this, R.anim.alpha_intro);
         view.startAnimation(anim);
         anim.setAnimationListener(new Animation.AnimationListener() {
             @Override
             public void onAnimationStart(Animation animation) {

             }

             @Override
             public void onAnimationEnd(Animation animation) {
                 Intent intent = new Intent(IntroActivity.this, CalcActivity.class);
                 startActivity(intent);
                 finish();
             }

             @Override
             public void onAnimationRepeat(Animation animation) {

             }
         });
    }


}
