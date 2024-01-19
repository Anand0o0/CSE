package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Admindelete extends AppCompatActivity {

    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindelete);

        linearLayout = findViewById(R.id.stulayouts);

        // Assume you have a "notifications" node in your Firebase database
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("notices");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                linearLayout.removeAllViews(); // Clear existing views

                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        String key = snapshot.getKey(); // Get the unique key for this data


                    Log.d("FirebaseData", "Snapshot Key: " + snapshot.getKey()); // Log the key of each snapshot

                    // Assuming your Firebase structure matches the expected format
                    String title = snapshot.child("title").getValue(String.class);
                    String content = snapshot.child("content").getValue(String.class);
                    String link = snapshot.child("websiteLink").getValue(String.class);

                    Log.d("FirebaseData", "Title: " + title + ", Content: " + content + ", Link: " + link);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            addNotificationToLayout(title, content, link,key);
                        }
                    });

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e("FirebaseError", "Error: " + databaseError.getMessage());
            }
        });
    }
    private void addNotificationToLayout(String title, String content,  String link,String key) {
        View notificationView = LayoutInflater.from(this).inflate(R.layout.adminnotifications, null);

        TextView titleTextView = notificationView.findViewById(R.id.abs);
        titleTextView.setText(title);

        ImageView deleteImageView = notificationView.findViewById(R.id.deletes);
        // Set up your delete functionality if needed

        TextView contentTextView = notificationView.findViewById(R.id.cds);
        contentTextView.setText(content);

        Button linkButton = notificationView.findViewById(R.id.efs);
        linkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Uri uri = Uri.parse(link);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                } catch (Exception e) {
                    Log.e("Link Error", "Error opening link: " + link, e);
                    // Handle the error, for example, show a toast message
                    Toast.makeText(Admindelete.this, "Error opening link", Toast.LENGTH_SHORT).show();
                }
            }
        });

        deleteImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteData(key);
            }
        });

        linearLayout.addView(notificationView);
    }

    private void deleteData(String key) {
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("notices").child(key);
        databaseReference.removeValue().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                Toast.makeText(Admindelete.this, "Data deleted successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Admindelete.this, "Failed to delete data", Toast.LENGTH_SHORT).show();
            }
        });
    }
}