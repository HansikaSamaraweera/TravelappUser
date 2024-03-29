package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HotelUser extends AppCompatActivity {

    Button search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_user);

        search = findViewById(R.id.search);

    }

    @Override
    protected void onResume(){
        super.onResume();

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HotelUser.this,HotelBooking.class);
                startActivity(intent);
            }
        });
    }



}
