package com.example.cse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class p3special extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_p3special, container, false);
        textView = view.findViewById(R.id.textView);

        // Retrieve button ID from arguments
        Bundle bundle = getArguments();
        if (bundle != null) {
            int buttonId = bundle.getInt("c", 0);
            if(buttonId==1)
            {
                textView.setText(constants.sAI);
            }
        }

        return view;
    }

}
