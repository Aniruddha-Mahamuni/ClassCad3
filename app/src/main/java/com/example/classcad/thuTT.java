package com.example.classcad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class thuTT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thu_t_t);
    }

    public void backthu1(View view) {
        startActivity(new Intent(getApplicationContext(),TimeTable.class));
        finish();
    }
}