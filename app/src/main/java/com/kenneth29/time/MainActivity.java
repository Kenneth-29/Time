package com.kenneth29.time;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGermany(View view) {
        TextClock clock = findViewById(R.id.myclock);
        clock.setTimeZone("Europe/Berlin");
    }

    public void onClickIndia(View view){

        TextClock clock = findViewById(R.id.myclock);
        clock.setTimeZone("Asia/Kolkata");

    }
}