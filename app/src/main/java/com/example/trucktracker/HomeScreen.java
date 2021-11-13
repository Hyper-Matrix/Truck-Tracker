package com.example.trucktracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeScreen extends AppCompatActivity {
    Button trucker;
    Button admin;
    Button customer;
    ImageView pic2;
    ImageView pic1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        admin=findViewById(R.id.btn1);
        trucker=findViewById(R.id.btn2);
        customer=findViewById(R.id.btn3);
        pic2=findViewById(R.id.pic2);
        pic1=findViewById(R.id.pic1);
        pic2.setImageAlpha(100);
        pic1.setImageAlpha(100);

        trucker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this,Trucker.class));
            }
        });
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this, Customer.class));
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this, Admin.class));
            }
        });
    }
}