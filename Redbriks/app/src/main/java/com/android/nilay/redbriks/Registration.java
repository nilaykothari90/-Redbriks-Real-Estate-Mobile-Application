package com.android.nilay.redbriks;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Registration extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }


    public void submit(View view){
            Intent home_intent = new Intent(this, UserLogin.class);
            startActivity(home_intent);
            this.finish();
    }
}
