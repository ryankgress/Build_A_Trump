package com.example.ryangress.buildatrump;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.ryangress.buildatrump.MainActivity;
import com.example.ryangress.buildatrump.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ryan.gress on 10/29/2015.
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        TimerTask task = new TimerTask() {


            public void run() {
                finish();
            }
        };
            Timer opening = new Timer();
            opening.schedule(task, 5000);

    }
}