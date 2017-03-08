package com.android.nilay.redbriks;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
    }

    //method will invoke when user clicks on login button
    public void submit(View view){

    }
    //launches the registration activity
    public void register(View view){
        Intent register_intent = new Intent(this,Registration.class);
        startActivity(register_intent);
        this.finish();
    }
    //launches the home activity
    public void home(View view){
       // Intent home_intent = new Intent(this,MainActivity.class);
        //startActivity(home_intent);
       // Toast.makeText(getBaseContext(), "Login successful!", Toast.LENGTH_LONG).show();
        //this.finish();
    }

}