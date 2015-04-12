package com.example.kirill.fourscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class FirstScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }


    public void goToSecondScreen(View view) {
        Intent intent = new Intent(this, SecondScreen.class);
        startActivity(intent);
    }
}
