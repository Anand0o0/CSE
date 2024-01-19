package com.example.cse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class links4 extends Fragment {

    TextView np;

    TextView micro;
    TextView is;
    TextView ig;
    TextView  cp;
    TextView ibm;
    TextView ou;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_links4, container, false);
        np= view.findViewById(R.id.np);
        np.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://nptel.ac.in/");
            }
        });
        micro= view.findViewById(R.id.micro);
         micro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://learn.microsoft.com/en-us/credentials/certifications/microsoft-ignite-free-certification-exam-offer");
            }
        });
        is= view.findViewById(R.id.is);
        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://infosysspringboard.ausnz.onwingspan.com/web/");
            }
        });
        ig= view.findViewById(R.id.ig);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://grow.google/intl/en_in/certificates/");
            }
        });
        cp= view.findViewById(R.id.cp);
        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.coursera.org/courses");
            }
        });
        ibm= view.findViewById(R.id.ibm);
        ibm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.ibm.com/blogs/ibm-training/free-digital-learning/");
            }
        });
        ou= view.findViewById(R.id.ou);
       ou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://education.oracle.com/");
            }
        });

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}