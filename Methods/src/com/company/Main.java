package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;



        int highScore = calculateScore(gameOver , score , levelCompleted , bonus);
        System.out.println("Your final score was " +highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

         // calculateScore(gameOver , score , levelCompleted , bonus);
        // calculateScore(true , 10000 , 8 , 200);

        highScore = calculateScore(gameOver , score , levelCompleted , bonus);
        System.out.println("Your final score was " +highScore);

        String playerName1 = "Xela" ;
        int playerScore1 = 1500;

        String playerName2 = "Dhanje";
        int playerScore2 = 900;

        String playerName3 = "LillyBoy";
        int playerScore3 = 400;

        String playerName4 = "Alpi";
        int playerScore4 = 50;

        System.out.println();

        displayHighScorePosition(playerName1 , calculateHighScorePosition(playerScore1));
        displayHighScorePosition(playerName2 , calculateHighScorePosition(playerScore2));
        displayHighScorePosition(playerName3 , calculateHighScorePosition(playerScore3));
        displayHighScorePosition(playerName4 , calculateHighScorePosition(playerScore4));

        // shortcut

        displayHighScorePosition("Mangall" , calculateHighScorePosition(0));

    }

    public static void displayHighScorePosition(String playerName , int position) {

        System.out.println(playerName + " managed to get into position " +position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) return 1;
//        if (playerScore >= 500 /* && playerScore < 1000 is redundant )*/ return 2;
//        if (playerScore >= 100 ) return 3;
//        return 4;

        int position = 4;  // assuming position 4 will be returned

        if (playerScore >= 1000)
            position = 1;

//        if (playerScore >= 500 && playerScore < 1000)
//            position = 2;
//        if (playerScore >= 100 && playerScore < 500)
//            position = 3;

        else if (playerScore >= 500)
            position = 2;
        else if (playerScore >= 100)
            position = 3;

        return position;
    }


    public static int calculateScore(boolean gameOver , int score , int levelCompleted , int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        
        else return -1;

    }

}
