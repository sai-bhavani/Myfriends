package com.example.sai.myfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sai_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sai_activity);
    }

    public void Mainactivity(View view) {
        Intent sai=new Intent(sai_activity.this,MainActivity.class);
        startActivity(sai);
    }
}
