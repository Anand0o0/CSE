package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class dailyQuestions extends AppCompatActivity {

    public int r1,r2,r3;
    RadioGroup rr1,rr2,rr3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_questions);
      //  RelativeLayout rootLayout = findViewById(R.id.relative1); // Replace with your actual root layout ID

        // Load the slide-in animation from the right
      //  Animation slideInRightAnimation = AnimationUtils.loadAnimation(this, R.anim.left);

        // Apply the animation to the root layout
        //rootLayout.startAnimation(slideInRightAnimation);






    }

    public void first(View v)
    {
        r1=rr1.getCheckedRadioButtonId();

    }
}