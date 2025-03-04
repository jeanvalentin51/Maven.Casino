package io.zipcoder.casino.DiceGames;

import io.zipcoder.casino.Player.Player;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CrapsTest {

    Player testPlayer = new Player("bogus","bogus");
    Craps testGame = new Craps (testPlayer);

    @Test
    public void createDiceTest() {
        Dice[] testDice = testGame.createDice();
        Assert.assertEquals(2,testDice.length);
    }

    @Test
    public void checkForChipsNegativeTest() {
        String unexpected = "Welcome to Craps!";
        String actual = testGame.checkForChips();
        Assert.assertNotEquals(unexpected,actual);
    }

    @Test
    public void checkForChipsPositiveTest() {
        String unexpected = "You need at least $10.00 to play\n";
        String actual = testGame.checkForChips();
        Assert.assertEquals(unexpected,actual);

    }



    @Test
    public void evaluateRollTest() {
        String expected = "Your Target Score is " + 0 + "\n";
        String actual = testGame.evaluateRoll();
        Assert.assertEquals(expected, actual);

    }



}