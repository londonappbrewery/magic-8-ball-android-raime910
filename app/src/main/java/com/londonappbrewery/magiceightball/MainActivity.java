package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnGetAnswer;
    private ImageView imgEightBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setControlRefs();
        setControlEvents();
    }

    private void setControlRefs(){
        btnGetAnswer = findViewById(R.id.btnGetAnswer);
        imgEightBall = findViewById(R.id.imgEightBall);
    }

    private void setControlEvents()
    {

    }

}
