package com.example.hw_splash_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splssh_Screen extends AppCompatActivity {

    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splssh__screen);

        imageView4 =findViewById(R.id.imageView4);

        final Animation animation= AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.fade
        );
        animation.reset();
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(splssh_Screen.this,call_test.class));
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

        });
        imageView4.startAnimation(animation);
    }
}
