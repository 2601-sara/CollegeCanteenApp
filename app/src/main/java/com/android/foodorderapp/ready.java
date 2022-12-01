package com.android.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ready extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready);
    }


    public void tot1(View view) {
        Intent i = new Intent(ready.this, sign1.class);
        startActivity(i);

    }

    public void tot2(View view) {
        Intent i = new Intent(ready.this, login1.class);
        startActivity(i);
    }
}