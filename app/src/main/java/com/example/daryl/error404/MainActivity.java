package com.example.daryl.error404;

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

    public void sighUpOnClick(View view){
        Intent intent= new Intent(this, SighUpActivity);
        startActivityForResult(intent, 0);
    }


}
