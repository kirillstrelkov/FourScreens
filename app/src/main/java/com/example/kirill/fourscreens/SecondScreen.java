package com.example.kirill.fourscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class SecondScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
    }

    public void goToThirdScreen(View view) {
        Intent intent = new Intent(this, ThirdScreen.class);
        startActivity(intent);
    }
}
