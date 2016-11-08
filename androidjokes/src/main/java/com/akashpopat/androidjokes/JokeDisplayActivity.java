package com.akashpopat.androidjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setText(getIntent().getStringExtra("joke"));

    }
}
