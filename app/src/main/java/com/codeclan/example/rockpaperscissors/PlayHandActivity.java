package com.codeclan.example.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayHandActivity extends AppCompatActivity {

    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_hand);
        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton = (Button)findViewById(R.id.scissors_button);


    }

    public void onRockButtonClick(View button){

        Game game = new Game("Rock");
        String winner = game.play();
        String computerHand = game.getComputersHand();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("winner", winner);
        intent.putExtra("computerHand", computerHand);
        startActivity(intent);


    }

    public void onPaperButtonClick(View button){
        Game game = new Game("Paper");
        String winner = game.play();
        String computerHand = game.getComputersHand();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("winner", winner);
        intent.putExtra("computerHand", computerHand);
        startActivity(intent);

    }
    public void onScissorsButtonClick(View button){
        Game game = new Game("Scissors");
        String winner = game.play();
        String computerHand = game.getComputersHand();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("winner", winner);
        intent.putExtra("computerHand", computerHand);
        startActivity(intent);

    }
}
