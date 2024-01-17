package com.example.cse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class links6 extends Fragment {

    TextView JP;
    TextView aicte;
    TextView IS;
    TextView fo;
    TextView LI;
    TextView in;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_links6, container, false);
        JP= view.findViewById(R.id.JP);
        JP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.jpmorgan.com/in/en/students/programs");
            }
        });
        aicte= view.findViewById(R.id.aicte);
        aicte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://internship.aicte-india.org/");
            }
        });
        IS= view.findViewById(R.id.IS);
        IS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://internshala.com/");
            }
        });
        fo= view.findViewById(R.id.fo);
        fo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.theforage.com/landing/Intentional%20Gap%20Year/qkoWpeprptPNHfo5t/Intentional%20Gap%20Year%20Internships?ref=FsSNG3bmE6towPm6X\n");
            }
        });
        LI= view.findViewById(R.id.LI);
        LI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://careers.linkedin.com/pathways-programs/internships");
            }
        });
        in= view.findViewById(R.id.in);
       in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.indeed.com/q-internship-jobs.html\n");
            }
        });
        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}