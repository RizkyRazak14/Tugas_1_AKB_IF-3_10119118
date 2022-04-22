package com.rizkyrazak.tugas1akbif_310119118;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,LoginActivity.class));
                finish();
            }
        },2000);
    }
}

//Pengerjaan    : 22 April 2022
//NIM           : 10119118
//Nama          : Rizky Septiana Abdul Razak
//Kelas         : IF - 3