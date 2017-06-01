package com.example.sai.myfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mam_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mam_activity);
    }

    public void Mainactivity(View view) {
        Intent mam=new Intent(mam_activity.this,MainActivity.class);
        startActivity(mam);
    }
}
