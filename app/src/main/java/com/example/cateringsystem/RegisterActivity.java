package com.example.cateringsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {
    EditText username,email,password,confirm_password;
    TextView registation_btn,register_signin;

    String str_username,str_email,str_password,str_confirmpassword;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = findViewById(R.id.register_username);
        email = findViewById(R.id.register_email);
        password = findViewById(R.id.register_password);
        confirm_password = findViewById(R.id.register_confirm_password);
        registation_btn  = findViewById(R.id.regbtn);
        register_signin = findViewById(R.id.register_logintxt);

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Please wait........");
        progressDialog.setCanceledOnTouchOutside(false);

        register_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intend = new Intent(getApplicationContext(),LogoActivity.class);
                startActivity(intend);
                finish();
            }
        });

        registation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validation();
            }
        });


    }
    private void Validation(){
        str_username = username.getText().toString();
        str_email = email.getText().toString();
        str_password = password.getText().toString();
        str_confirmpassword = confirm_password.getText().toString();

        if(str_username.isEmpty()){
            username.setError("Please Fill Field");
            username.requestFocus();
            return;
        }
        if(str_email.isEmpty()){
            email.setError("Please Fill Field");
            email.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(str_email).matches()){
            email.setError("Please Enter Valid Email");
            email.requestFocus();
            return;
        }
        if(str_password.isEmpty()){
            password.setError("Please Fill Field");
            password.requestFocus();
            return;
        }
//        else if(!passworvalidation(str_password)){
//            password.setError("Please Range issue");
//            password.requestFocus();
//            return;
//        }
        if(str_confirmpassword.isEmpty()){
            confirm_password.setError("Please Fill Field");
            confirm_password.requestFocus();
            return;
        }
        else if(!str_confirmpassword.equals(str_password)){
            confirm_password.setError("Please Check Confrim Password Field");
            confirm_password.requestFocus();
            return;
        }

        createAccount();



    }

    private void createAccount() {
        progressDialog.setMessage("Creating Account");
        progressDialog.show();

        sendDatatoDB();
    }

    private void sendDatatoDB() {
        String regtime = ""+System.currentTimeMillis();
        HashMap<String,Object> data = new HashMap<>();
        data.put("username",str_username);
        data.put("email",str_email);
        data.put("password",str_password);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
        reference.child(str_username).setValue(data)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(getApplicationContext(),"Registration Successfully",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),MainDashboardActivity.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        progressDialog.dismiss();
                        Toast.makeText(getApplicationContext(),"Registration Failure",Toast.LENGTH_SHORT).show();
                    }
                });

    }

//    private boolean passworvalidation(String str_password) {
//        Pattern p = Pattern.compile(".{6}");
//        Matcher m=p.matcher(str_password);
//        return m.matches();
//    }

}