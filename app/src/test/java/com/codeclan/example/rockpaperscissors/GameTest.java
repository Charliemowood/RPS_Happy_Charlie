package com.codeclan.example.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PaulJablonski on 24/05/2017.
 */
public class GameTest {

    @Test
    public void canGetUserHand(){
        Game game = new Game("Rock");
        assertEquals("Rock", game.getHand());
    }

//    @Test
//    public void canCompareHandRock(){
//        Game game = new Game("Rock");
//        assertEquals("You Win!", game.play());
//    }
//
//    @Test
//    public void canCompareHandScissors(){
//        Game game = new Game("Scissors");
//        assertEquals("Draw", game.play());
//    }
//
//    @Test
//    public void canCompareHandPaper(){
//        Game game = new Game("Paper");
//        assertEquals("I win motherfucker!!!", game.play());
//    }

}