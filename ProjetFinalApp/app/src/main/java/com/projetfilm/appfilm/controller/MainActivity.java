package com.projetfilm.appfilm.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.projetfilm.appfilm.R;

public class MainActivity extends AppCompatActivity {

    private TextView mTitre;
    private Button mMarvelBtn;
    private Button mCentryFoxBtn;
private Button mParamountBtn;
    private Button mSonyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMarvelBtn = (Button) findViewById(R.id.activity_main_Marvel_btn);
        mMarvelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ApiActivityIntent = new Intent(MainActivity.this, ApiActivity.class);
                ApiActivityIntent.putExtra("id","Marvel");
                startActivity(ApiActivityIntent);
            }
        });
        mCentryFoxBtn = (Button) findViewById(R.id.activity_main_CentryFox_btn);
        mCentryFoxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ApiActivityIntent = new Intent(MainActivity.this, ApiActivity.class);
                ApiActivityIntent.putExtra("id","Centry");
                startActivity(ApiActivityIntent);
            }
        });
        mParamountBtn = (Button) findViewById(R.id.activity_main_Paramount_btn);
        mParamountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ApiActivityIntent = new Intent(MainActivity.this, ApiActivity.class);
                ApiActivityIntent.putExtra("id","Paramount");
                startActivity(ApiActivityIntent);
            }
        });
        mSonyBtn = (Button) findViewById(R.id.activity_main_Sony_btn);
        mSonyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ApiActivityIntent = new Intent(MainActivity.this, ApiActivity.class);
                ApiActivityIntent.putExtra("id","Sony");
                startActivity(ApiActivityIntent);
            }
        });
    }
}
