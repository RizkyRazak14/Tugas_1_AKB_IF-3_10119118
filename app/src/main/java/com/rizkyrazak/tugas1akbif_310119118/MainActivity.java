package com.rizkyrazak.tugas1akbif_310119118;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(this);

        Button logoutButton = findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.profileButton:
                Intent pindahKeProfile = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(pindahKeProfile);
                break;
            case R.id.logoutButton:
                Intent pindahKeLogin = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(pindahKeLogin);
                break;
        }
    }
}

//Pengerjaan    : 22 April 2022
//NIM           : 10119118
//Nama          : Rizky Septiana Abdul Razak
//Kelas         : IF - 3