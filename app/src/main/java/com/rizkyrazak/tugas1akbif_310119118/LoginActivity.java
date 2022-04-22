package com.rizkyrazak.tugas1akbif_310119118;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(this);

        Button registButton = findViewById(R.id.registerButton);
        registButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.loginButton:
                Intent pindahKeMain = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(pindahKeMain);
                break;
            case R.id.registerButton:
                Intent pindahKeRegist = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(pindahKeRegist);
                break;
        }


    }
}

//Pengerjaan    : 22 April 2022
//NIM           : 10119118
//Nama          : Rizky Septiana Abdul Razak
//Kelas         : IF - 3