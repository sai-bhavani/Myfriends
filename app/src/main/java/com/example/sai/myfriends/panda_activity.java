package com.example.sai.myfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class panda_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panda_activity);
    }

    public void Mainactivity(View view) {
        Intent panda=new Intent(panda_activity.this,MainActivity.class);
        startActivity(panda);
    }
}
