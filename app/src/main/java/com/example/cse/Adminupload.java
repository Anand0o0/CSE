package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Adminupload extends AppCompatActivity {

    ImageView i;
    Button bb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminupload);

        i=findViewById(R.id.adds);
        bb1=findViewById(R.id.allno);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noticeadmin n1=new noticeadmin();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.container5, n1, "notice");
                transaction.commit();
            }
        });

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Adminupload.this, Admindelete.class);
                startActivity(intent);
            }
        });
    }
}