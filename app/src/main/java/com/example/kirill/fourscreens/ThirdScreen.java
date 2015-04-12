package com.example.kirill.fourscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ThirdScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
    }

    public void goToFourthScreen(View view) {
        Intent intent = new Intent(this, FourthScreen.class);
        startActivity(intent);
    }
}
