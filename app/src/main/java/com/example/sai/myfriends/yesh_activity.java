package com.example.sai.myfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class yesh_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yesh_activity);
    }

    public void Mainactivity(View view) {
        Intent yesh=new Intent(yesh_activity.this,MainActivity.class);
        startActivity(yesh);
    }
}
