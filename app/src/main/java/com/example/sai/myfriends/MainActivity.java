package com.example.sai.myfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sanjit_activity(View view) {
        Intent san=new Intent(MainActivity.this,sanjit_activity.class);
        startActivity(san);
    }

    public void asif_activity(View view) {
        Intent asif=new Intent(MainActivity.this,asif_activity.class);
        startActivity(asif);
    }

    public void panda_activity(View view) {
        Intent panda=new Intent(MainActivity.this,panda_activity.class);
        startActivity(panda);
    }

    public void akshay_activity(View view) {
        Intent akshay=new Intent(MainActivity.this,akshay_activity.class);
        startActivity(akshay);
    }

    public void yesh_activity(View view) {
        Intent yesh=new Intent(MainActivity.this,yesh_activity.class);
        startActivity(yesh);
    }

    public void sai_activity(View view) {
        Intent sai=new Intent(MainActivity.this,sai_activity.class);
        startActivity(sai);
    }

    public void mam_activity(View view) {
        Intent mam=new Intent(MainActivity.this,mam_activity.class);
        startActivity(mam);
    }

    public void imageactivity(View view) {
        Intent img=new Intent(MainActivity.this,image_activity.class);
        startActivity(img);
    }
}
