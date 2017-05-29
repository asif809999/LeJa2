package com.example.android.LeJa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by asif on 5/29/17.
 */

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash);

        final ImageView splashImageView = (ImageView) findViewById(R.id.splash_logo);
        final Animation splashScreenAnimation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        final Animation splashScreenAnimationForFadeOutEffect =
                AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);



        splashImageView.startAnimation(splashScreenAnimation);
        splashScreenAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                splashImageView.startAnimation(splashScreenAnimationForFadeOutEffect);
                finish();
                Intent gotoMainActivityIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(gotoMainActivityIntent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
