package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserChoice extends AppCompatActivity {

    Button hotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_choice);

        hotel = findViewById(R.id.hotel);
    }
    @Override
    protected void onResume() {

        super.onResume();
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserChoice.this,HotelUser.class);
                startActivity(intent);
            }
        });
    }
}
