package com.example.cse;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class noticeadmin extends Fragment {

    EditText tit, con, link;
    Button up;

    // Reference to the Firebase Realtime Database
    DatabaseReference databaseReference;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_noticeadmin, container, false);

        tit = view.findViewById(R.id.ntitle);
        con = view.findViewById(R.id.ncontent);
        link = view.findViewById(R.id.nlink);
        up = view.findViewById(R.id.upload);

        // Initialize the DatabaseReference
        databaseReference = FirebaseDatabase.getInstance().getReference("notices");

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the values from the EditText fields
                String title = tit.getText().toString();
                String content = con.getText().toString();
                String websiteLink = link.getText().toString();

                // Check if any of the fields is empty
                if (title.isEmpty() || content.isEmpty() || websiteLink.isEmpty()) {
                    // Display a Toast message
                    Toast.makeText(requireContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Create a Notice object or use a Map to store the data
                    Notice notice = new Notice(title, content, websiteLink);

                    // Push the data to the Firebase Realtime Database
                    String noticeId = databaseReference.push().getKey();
                    databaseReference.child(noticeId).setValue(notice);

                    // Clear the EditText fields after uploading
                    tit.getText().clear();
                    con.getText().clear();
                    link.getText().clear();

                    // Display a success Toast message
                    Toast.makeText(requireContext(), "Data uploaded successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    // Place this class in your project
    public class Notice {
        private String title;
        private String content;
        private String websiteLink;

        // Empty constructor for Firebase
        public Notice() {
        }

        public Notice(String title, String content, String websiteLink) {
            this.title = title;
            this.content = content;
            this.websiteLink = websiteLink;
        }

        // Getter methods
        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getWebsiteLink() {
            return websiteLink;
        }
    }

}
