package com.example.ryangress.buildatrump;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Button b = (Button)findViewById(R.id.btnSplash);
        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }


        });}

    private android.widget.Toolbar toolbar;

    private void setSupportActionBar(Toolbar toolbar) {
        toolbar = (Toolbar) findViewById(R.id.app_bar);

        setSupportActionBar(toolbar);}


    }



