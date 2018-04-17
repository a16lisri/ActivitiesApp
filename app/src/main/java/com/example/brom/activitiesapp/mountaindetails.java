package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class mountaindetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String str = intent.getStringExtra("info_namn");
        String str2 = intent.getStringExtra("info_position");
        String str3 = intent.getStringExtra("info_hojd");

        TextView textView = (TextView) findViewById(R.id.info_namn);
        textView.setText(str);

        TextView textView2 = (TextView) findViewById(R.id.info_position);
        textView2.setText(str2);

        TextView textView3 = (TextView) findViewById(R.id.info_hojd);
        textView3.setText(str3);
    }

}
