package com.codeclan.example.rockpaperscissors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by Paul, Charlie and Lewis on 24/05/2017.
 */

public class Game {

    private String hand;
    private String computersHand;
    private HashMap<String, String> winResult;


    public Game(String hand){
        this.hand = hand;
        this.computersHand = getRandomHand();
        this.winResult = new HashMap<>();
        winResult.put("Paper", "Rock");
        winResult.put("Rock", "Scissors");
        winResult.put("Scissors", "Paper");
    }

    public String getHand() {
        return hand;
    }

    public String getComputersHand(){
        return this.computersHand;
    }

    public String play() {
        if (this.hand == this.computersHand) {
            return "Draw";
        } else if (winResult.get(this.hand) == this.computersHand) {
            return "You Win!";
        } else {
            return "You lose!";
        }
    }

    private String getRandomHand(){
        ArrayList<String> options = new ArrayList<>();
        options.add("Scissors");
        options.add("Rock");
        options.add("Paper");
        Random rand = new Random();
        int index = rand.nextInt(3);
        return options.get(index);
    }

}
