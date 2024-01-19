package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class abotus extends AppCompatActivity {

    TextView t1;
    ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abotus);
        t1=findViewById(R.id.tabo);
        t1.setText(constants.about);
        i1=findViewById(R.id.ean);
        i2=findViewById(R.id.esu);
        i3=findViewById(R.id.lan);
        i4=findViewById(R.id.lsu);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "anandtummalagunta@ptuniv.edu.in"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "From trip packer");
                    startActivity(intent);
                }
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "supradeept.07@ptuniv.edu.in"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "From trip packer");
                    startActivity(intent);

                }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    gotoUrl("https://www.linkedin.com/in/thummalagunta-anand-bb008226b");
                }
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    gotoUrl("https://www.linkedin.com/in/supradeep-tripurari-28451b27b");
                }
            }
        });

    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}