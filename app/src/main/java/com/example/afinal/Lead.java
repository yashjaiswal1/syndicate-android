package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Lead extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Lead.this, Dashboard.class));
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lead);
    }
}
