package com.example.cateringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new recfragment()).commit();
    }
}