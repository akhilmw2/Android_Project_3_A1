package com.example.android_project_3_a1;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnAttractions = findViewById(R.id.btn_attractions);
        Button btnRestaurants = findViewById(R.id.btn_restaurants);

        // Handle Attraction Button Click
        btnAttractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Showing Attractions", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent("com.example.ATTRACTIONS");
                sendBroadcast(intent);
                Log.d(TAG, "Broadcast sent: com.example.ATTRACTIONS");
            }
        });

        // Handle Restaurants Button Click
        btnRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Showing Restaurants", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent("com.example.RESTAURANTS");
                sendBroadcast(intent);
                Log.d(TAG, "Broadcast sent: com.example.RESTAURANTS");
            }
        });


    }


}