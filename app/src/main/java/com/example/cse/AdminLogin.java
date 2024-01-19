package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {

    EditText u,p;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        u=findViewById(R.id.aname);
        p=findViewById(R.id.apassword);
        b=findViewById(R.id.alogin);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredAdminname = u.getText().toString();
                String enteredPassword = p.getText().toString();

                if(enteredAdminname.equals("a")&&enteredPassword.equals("a"))
                {
                    Intent intent=new Intent(AdminLogin.this, Adminupload.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(AdminLogin.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}