package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Products extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
    }
}
