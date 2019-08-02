package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuideBooking extends AppCompatActivity {

    Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_booking);

        confirm = findViewById(R.id.confirm);
    }

    @Override
    protected void onResume(){
        super.onResume();

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuideBooking.this,GuideConfirmBooking.class);
                startActivity(intent);
            }
        });
    }
}
