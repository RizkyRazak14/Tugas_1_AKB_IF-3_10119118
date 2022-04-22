package com.rizkyrazak.tugas1akbif_310119118;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button loginButton2 = findViewById(R.id.loginButton2);
        loginButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.loginButton2:
                Intent pindahKeLogin = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(pindahKeLogin);
                break;
        }
    }
}

//Pengerjaan    : 22 April 2022
//NIM           : 10119118
//Nama          : Rizky Septiana Abdul Razak
//Kelas         : IF - 3