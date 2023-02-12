package com.example.intentsinandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.name);
        EditText pass = findViewById(R.id.password);
        Button send = findViewById(R.id.sendBtn);

        String nameText = userName.getText().toString();
        String passText = pass.getText().toString();
    
        
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameText.equals("sandesh") && passText.equals("pawar")){
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();

                }
                else {
//                    Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
                    Intent sendIntent = new Intent(MainActivity.this, loginSuccess.class);
                    startActivity(sendIntent);
                }
            }
        });
        
        
    }
}