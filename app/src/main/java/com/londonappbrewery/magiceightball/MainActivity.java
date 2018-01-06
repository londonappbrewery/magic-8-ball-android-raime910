package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnGetAnswer;
    private ImageView imgEightBall;
    private int[] mEightBallImages = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setControlRefs();
    }

    private void setControlRefs() {
        btnGetAnswer = findViewById(R.id.btnGetAnswer);
        imgEightBall = findViewById(R.id.imgEightBall);

        btnGetAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(4);

                imgEightBall.setImageResource(mEightBallImages[randomNumber]);
            }
        });
    }
}
