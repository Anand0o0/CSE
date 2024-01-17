package com.example.cse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class links7 extends Fragment {


    TextView gh;
  TextView LI;
  TextView fi;
    TextView flut;
    TextView web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_links7, container, false);
        gh= view.findViewById(R.id.gh);
        gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/\n");
            }
        });
        LI= view.findViewById(R.id.LI);
        LI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://in.linkedin.com/\n");
            }
        });
        fi= view.findViewById(R.id.fi);
        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.figma.com/\n");
            }
        });
        flut= view.findViewById(R.id.flut);
        flut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://flutter.dev/\n");
            }
        });
        web= view.findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://webflow.com/\n");
            }
        });

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}