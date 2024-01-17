package com.example.cse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class links5 extends Fragment {

    TextView iw;
    TextView ic;
    TextView tih;
    TextView ib;
   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_links5, container, false);
        iw = view.findViewById(R.id.iw);
        iw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://grow.google/certificates/interview-warmup/");
            }
        });
        ic = view.findViewById(R.id.ic);
        ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.interviewcake.com/");
            }
        });
        tih = view.findViewById(R.id.tih);
        tih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.techinterviewhandbook.org/");
            }
        });
       ib = view.findViewById(R.id.IB);
       ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.interviewbit.com/");
            }
        });

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}