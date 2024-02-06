package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class home extends AppCompatActivity {

    ImageView dai,up,ty,no,abs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView cardView = findViewById(R.id.spec);
        Animation fadein = AnimationUtils.loadAnimation(this,R.anim.magnify);

        dai=findViewById(R.id.dail);
        up=findViewById(R.id.upgradess);
        ty=findViewById(R.id.trth);

        no=findViewById(R.id.notification);
        abs=findViewById(R.id.about);


        dai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this, specializations.class);
                startActivity(intent);
                Animation magnifyAnimation = AnimationUtils.loadAnimation(home.this, R.anim.magnify);
                dai.startAnimation(magnifyAnimation);
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation magnifyAnimation = AnimationUtils.loadAnimation(home.this, R.anim.magnify);
                up.startAnimation(magnifyAnimation);
                Intent intent=new Intent(home.this,upgradeyou.class);
                startActivity(intent);

            }
        });

        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,trythis.class);
                startActivity(intent);
                Animation magnifyAnimation = AnimationUtils.loadAnimation(home.this, R.anim.magnify);
                ty.startAnimation(magnifyAnimation);
            }
        });



        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,abotus.class);
                startActivity(intent);
                Animation magnifyAnimation = AnimationUtils.loadAnimation(home.this, R.anim.mag1);
                abs.startAnimation(magnifyAnimation);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this, notifications.class);
                startActivity(intent);
                Animation magnifyAnimation = AnimationUtils.loadAnimation(home.this, R.anim.magnify);
                no.startAnimation(magnifyAnimation);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Close the app when the back button is pressed in this activity
        super.onBackPressed();
        finishAffinity();
    }
}