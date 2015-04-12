package com.example.kirill.fourscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class FourthScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);
    }

    public void goToFirstScreen(View view) {
        Intent intent = new Intent(this, FirstScreen.class);
        startActivity(intent);
    }
}
