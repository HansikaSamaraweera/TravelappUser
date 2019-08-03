package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HotelConfirmBooking extends AppCompatActivity {

    Button edit;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_confirm_booking);

        edit = findViewById(R.id.edit);
        confirm = findViewById(R.id.confirm);
    }

    @Override
    protected void onResume(){
        super.onResume();

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HotelConfirmBooking.this,HotelUserEdit.class);
                startActivity(intent);

            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HotelConfirmBooking.this,HotelUser.class);
                startActivity(intent);
            }
        });
    }
}
