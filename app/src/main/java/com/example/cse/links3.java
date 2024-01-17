package com.example.cse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class links3 extends Fragment {

    TextView gfg;
    TextView jp;
    TextView sto;
    TextView tp;
    TextView w3;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_links3, container, false);
        gfg = view.findViewById(R.id.Gfg);
        gfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.geeksforgeeks.org/");
            }
        });
        jp = view.findViewById(R.id.jp);
        jp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.javatpoint.com/");
            }
        });
        sto = view.findViewById(R.id.sto);
        sto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://stackoverflow.com/documentation\n");
            }
        });
        tp = view.findViewById(R.id.tp);
        tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tutorialspoint.com/");
            }
        });
        w3 = view.findViewById(R.id.w3);
        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.w3schools.com/");
            }
        });
        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}