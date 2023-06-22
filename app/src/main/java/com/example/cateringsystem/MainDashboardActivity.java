package com.example.cateringsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class MainDashboardActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);
        mAuth = FirebaseAuth.getInstance();


    }

    public void onClick(View view){
        Intent intent = new Intent(MainDashboardActivity.this, ItemsActivity.class);
        startActivity(intent);

    }
    public void onClick2(View view){
        Intent intent = new Intent(MainDashboardActivity.this, EstimationActivity.class);
        startActivity(intent);

    }
    public void onClick3(View view){
      mAuth.signOut();
      Intent intent = new Intent(MainDashboardActivity.this, LogoActivity.class);
      startActivity(intent);
      finish();
      Toast.makeText(MainDashboardActivity.this,"Logout Sucessful",Toast.LENGTH_SHORT).show();

    }


}