package com.DawidKotwicki;

public class Main {

    public static void main(String[] args) {
        int position;
        int score;
        String playerName;

        //Player 1
        playerName = "One";
        score = 1500;
        position = calculateHighScore(score);
        displayPosition(playerName, position);
        //Player 2
        playerName = "Two";
        score = 900;
        position = calculateHighScore(score);
        displayPosition(playerName, position);
        //Player 3
        playerName = "Three";
        score = 400;
        position = calculateHighScore(score);
        displayPosition(playerName, position);
        //Player 4
        playerName = "Four";
        score = 50;
        position = calculateHighScore(score);
        displayPosition(playerName, position);

    }

    public static void displayPosition(String name, int position){
        System.out.println("Player " + name + " managed to get position " + position + " on the highscore table.");
    }

    public static int calculateHighScore(int score){
        int position;

        if(score >= 1000)
            position = 1;
        else if (score >= 500)
            position  = 2;
        else if (score >= 100)
            position = 3;
        else
            position = 4;

        return position;
    }
}
