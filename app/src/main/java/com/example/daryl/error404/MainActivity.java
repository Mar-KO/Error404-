package com.example.daryl.error404;

import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void sighUpOnClick (View view){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivityForResult(intent, 0);
    }

}

