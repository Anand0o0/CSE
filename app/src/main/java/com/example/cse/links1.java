package com.example.cse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class links1 extends Fragment {

    TextView hr;
    TextView he;
    TextView gfg;
    TextView strive;
    TextView leet;
    TextView bit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_links1, container, false);
        hr = view.findViewById(R.id.hackrank);
        hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.hackerrank.com/domains/data-structures?filters%5Bsubdomains%5D%5B%5D=data-structures");
            }
        });

        he = view.findViewById(R.id.hackearth);
        he.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.hackerearth.com/challenges/competitive/hackerearth-june-dsa-21/\n");
            }
        });

        gfg = view.findViewById(R.id.GFG);
        gfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.geeksforgeeks.org/data-structures/\n");
            }
        });

        strive = view.findViewById(R.id.st);
        strive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/playlist?list=PLgUwDviBIf0oF6QL8m22w1hIDC1vJ_BHz");
            }
        });

        bit = view.findViewById(R.id.ib);
        bit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.interviewbit.com/data-structure-mcq/https://www.interviewbit.com/data-structure-mcq/");
            }
        });

        leet = view.findViewById(R.id.lc);
        leet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://leetcode.com/discuss/general-discussion/494279/comprehensive-data-structure-and-algorithm-study-guide");
            }
        });
        return view;



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}