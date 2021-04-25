package com.mids.paper_solution4443.Question7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;


import com.mids.paper_solution4443.R;

public class Question_7 extends AppCompatActivity {

    private EditText FirstName, LastName, Email,Password, Email2, Password2;
    private MaterialButton btnCreateAccount, btnLogin;
    private String firstName,lastName,email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_7);
        FirstName = findViewById(R.id.edtFirstName);
        LastName = findViewById(R.id.edtLastName);
        Email = findViewById(R.id.edtEmail);
        Password = findViewById(R.id.edtPassword);
        Email2 = findViewById(R.id.edtEmail2);
        Password2 = findViewById(R.id.edtPassword2);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);
        btnLogin = findViewById(R.id.btnLogin);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginAccount();
            }
        });
    }
    private void loginAccount() {
        if (Email2.getText().toString().equals(email) && Password2.getText().toString().equals(password)){
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Email or Password doesn't match!", Toast.LENGTH_SHORT).show();
        }
    }
    private void createAccount() {
        firstName = FirstName.getText().toString();
        lastName = LastName.getText().toString();
        email = Email.getText().toString();
        password = Password.getText().toString();
        Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show();
    }
}