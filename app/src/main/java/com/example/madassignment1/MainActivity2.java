package com.example.madassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button next;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        next=findViewById(R.id.nextbtn);
        send=findViewById(R.id.sent);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent2);
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "sent", Toast.LENGTH_SHORT).show();
            }
        });
    }
}