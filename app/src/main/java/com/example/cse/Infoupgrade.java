package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Infoupgrade extends AppCompatActivity {

    TextView te1, te2;
    Button b1;
    FragmentManager manager1 = getSupportFragmentManager();
    private BroadcastReceiver dataReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if ("com.example.cse.DATA_LOADED".equals(intent.getAction())) {
                String loadedData = intent.getStringExtra("loadedData");

                // Update the TextView with the loaded data
                te2.setText(loadedData);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoupgrade);

        te1 = findViewById(R.id.headin);
        te2 = findViewById(R.id.tv);
        b1 = findViewById(R.id.b1);

        // Remove dynamic receiver registration
        // IntentFilter filter = new IntentFilter("com.example.cse.DATA_LOADED");
        // registerReceiver(dataReceiver, filter);

        // Get the button clicked value
        Intent intent = getIntent();
        String id = intent.getStringExtra("buttonclicked");
        String Heading = intent.getStringExtra("texts");

        te1.setText(Heading);

        // Start the IntentService to fetch data based on the button clicked
        startBroadcast(id);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fra(id);
            }
        });
    }

    private void fra(String id) {
        switch (id) {
            case "b1":
                links1 l1 = new links1();
                fra2(l1, "links1");
                break;
            case "b2":
                links2 l2 = new links2();
                fra2(l2, "link2");
                break;
            case "b3":
                links3 l3 = new links3();
                fra2(l3, "links3");
                break;
            case "b4":
                links4 l4 = new links4();
                fra2(l4, "links4");
                break;
            case "b5":
                links5 l5 = new links5();
                fra2(l5, "links5");
                break;
            case "b6":
                links6 l6 = new links6();
                fra2(l6, "links6");
                break;
            case "b7":
                links7 l7 = new links7();
                fra2(l7, "links7");
                break;
            default:
                Toast.makeText(Infoupgrade.this, "No Links available.", Toast.LENGTH_SHORT).show();
        }
    }

    private void fra2(Fragment fragment, String s) {
        FragmentTransaction transaction = manager1.beginTransaction();
        transaction.add(R.id.container4, fragment, s);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    protected void onDestroy() {
        // Remove dynamic receiver unregistration
        // unregisterReceiver(dataReceiver);
        super.onDestroy();
    }

    private void startBroadcast(String buttonClicked) {
        // Broadcast the action to fetch data based on the button clicked
        Intent broadcastIntent = new Intent("com.example.cse.ACTION_FOO");
        broadcastIntent.putExtra("EXTRA_BUTTON_CLICKED", buttonClicked);
        sendBroadcast(broadcastIntent);
    }
}
