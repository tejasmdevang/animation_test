package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username;
EditText password;
Button sign;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         username=findViewById(R.id.username);
         password=findViewById(R.id.password);
         sign=findViewById(R.id.sign);



         sign.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                String a= username.getText().toString();
                 String b= password.getText().toString();
                 if ((a.equals("a")) && (b.equals("abc")))
                 {
                     Intent i=new Intent(MainActivity.this,home.class);
                     startActivity(i);
                 }
                 else
                 {
                     Toast.makeText(MainActivity.this, "incorrect username or password", Toast.LENGTH_SHORT).show();
                 }
             }
         });
    }
}