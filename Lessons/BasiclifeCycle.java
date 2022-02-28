package com.example.metodlar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("On stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause");
    }

}


Bu metodlar mobil uyguma ekranında ki  aktivitler için hazırlanım metodlardır.

