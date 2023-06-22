package com.example.cateringsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import javax.xml.validation.Validator;

public class LogoActivity extends AppCompatActivity {

    EditText username,password;
    TextView login_btn,login_register;
    String str_username2,str_password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        username = findViewById(R.id.login_username);
        password = findViewById(R.id.login_password);
        login_btn = findViewById(R.id.login_btn);
        login_register = findViewById(R.id.login_register_btn);

        login_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intend = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intend);
                finish();
            }
        });
            login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validation();
            }
        });

    }

    private void Validation() {
        str_username2 = username.getText().toString();
        str_password2 = password.getText().toString();

        if(str_username2.isEmpty()){
            username.setError("Please fill field");
            username.requestFocus();
        }
        if(str_password2.isEmpty()){
            password.setError("Please fill field");
            password.requestFocus();
            return;
        }
        checkFromDatabase();

    }

    private void checkFromDatabase() {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
        reference.child(str_username2)
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            String db_pass = snapshot.child("password").getValue(String.class);
                            if(str_password2.equals(db_pass)){
                                Intent intent = new Intent(getApplicationContext(),MainDashboardActivity.class);
                                intent.putExtra("email",str_username2);
                                Toast.makeText(LogoActivity.this,"Login Successfully",Toast.LENGTH_SHORT).show();
                                startActivity(intent);
                                finish();
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"Password Incorrect",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(LogoActivity.this,"Record not found",Toast.LENGTH_SHORT).show();
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

    }


}