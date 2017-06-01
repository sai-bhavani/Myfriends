package com.example.sai.myfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class akshay_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akshay_activity);
    }

    public void Mainactivity(View view) {
        Intent akshay=new Intent(akshay_activity.this,MainActivity.class);
        startActivity(akshay);
    }
}
