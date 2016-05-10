package com.linw.lunchercherviewdemo;

import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.AppTheme);

        setContentView(R.layout.activity_main);

        View loading_view = findViewById(R.id.loading_view);
        setUpMoveAnimation(loading_view);

        ImageView img = (ImageView) findViewById(R.id.img_icon);
        setUpMoveAnimation(img);

        TextView tv = (TextView) findViewById(R.id.tv_main);
        setAlphaAnimation(tv);

        Button btn_login = (Button) findViewById(R.id.btn_main_login);
        Button btn_register = (Button) findViewById(R.id.btn_main_register);
        setScaleAnimation(btn_login);
        setScaleAnimation(btn_register);
    }

    private void setScaleAnimation(View view) {
        ViewCompat.animate(view)
//                .scaleXBy(0)
//                .scaleYBy(0)
                .setStartDelay(300)
                .setDuration(300)
                .scaleY(1)
                .scaleX(1)
                .start();
    }

    private void setAlphaAnimation(View view) {
        ViewCompat.animate(view)
//                .alphaBy(0)
                .setStartDelay(500)
                .setDuration(500)
                .alpha(1)
                .setInterpolator(new DecelerateInterpolator(1.2f))
                .start();
    }

    private void setUpMoveAnimation(View view) {
        ViewCompat.animate(view)
                .translationY(-100)
                .setStartDelay(500)
                .setDuration(500)
                .setInterpolator(new DecelerateInterpolator(1.2f))
                .start();
    }
}
