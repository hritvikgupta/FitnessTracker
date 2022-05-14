package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText loginName, loginPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginName = findViewById(R.id.loginName);
        loginPassword  = findViewById(R.id.loginPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(loginName.getText().toString().isEmpty() || loginPassword.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter Credentials", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, com.example.fitnesstracker.optionsActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}