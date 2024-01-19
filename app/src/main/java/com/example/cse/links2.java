package com.example.cse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class links2 extends Fragment {


    TextView rs;
    TextView gfg;

    TextView fcc;

    TextView ce;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_links2, container, false);
       rs = view.findViewById(R.id.rs);
        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://roadmap.sh/");
            }
        });
        gfg = view.findViewById(R.id.gfg);
        gfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.geeksforgeeks.org/complete-roadmap-to-learn-dsa-from-scratch/");
            }
        });
        fcc = view.findViewById(R.id.fcc);
        fcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.freecodecamp.org/news/how-to-become-a-software-engineer-2023-roadmap/");
            }
        });

        ce= view.findViewById(R.id.ce);
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.coursera.org/lecture/uva-darden-digital-product-management/roadmap-CLAJL");
            }
        });
        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}