package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button welcomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcomeButton=(Button)findViewById(R.id.welcome_button);
    }

    public void onWelcomeButtonClicked(View button){
        Intent intent = new Intent(this,PlayHandActivity.class);
        startActivity(intent);
    }


}
