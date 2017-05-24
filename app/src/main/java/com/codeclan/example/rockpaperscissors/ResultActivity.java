package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultView = (TextView) findViewById(R.id.result_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String winner = extras.getString("winner");
        String computerHand = extras.get("computerHand").toString();

        resultView.setText(winner + "\n" + "The computer played " + computerHand + "!");

    }
}
