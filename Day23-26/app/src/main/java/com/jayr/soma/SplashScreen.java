package com.jayr.soma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends Activity {
    private  static int SplashTimeout = 3000;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);// clears status bar
        setContentView(R.layout.splash_screen);
    }
        public void launchSplashScreen(){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);//starts thhe Login activity once run...
                    startActivity(intent);
                    finish();
                }
            },SplashTimeout);
    }
}