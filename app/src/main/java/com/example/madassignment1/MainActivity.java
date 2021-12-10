package com.example.madassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText pass;
    Button login;
    Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.emailid);
        pass=findViewById(R.id.passcode);
        login=findViewById(R.id.btnlogin);
        next=findViewById(R.id.nextbtn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent1);
            }
        });



    }
    public void onLogin(View v){
        String vemail= email.getText().toString();
        String password=pass.getText().toString();
        if(vemail.isEmpty()){
            Toast.makeText(MainActivity.this, "Email Cannot be emtpy", Toast.LENGTH_SHORT).show();
        }
        else if(password.isEmpty()){
            Toast.makeText(MainActivity.this, "Password is empty", Toast.LENGTH_SHORT).show();

        }
        else {

            Toast.makeText(MainActivity.this, "Logged in", Toast.LENGTH_SHORT).show();
        }

    }

}