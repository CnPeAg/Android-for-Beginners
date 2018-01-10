package com.example.android.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Wowasasasasasasasasassasasasasas!");
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(100);
        //textView.setMaxLines(2);

        setContentView(textView);

    }
}
