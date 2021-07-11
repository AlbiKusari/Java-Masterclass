package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Albi" , 500);
        System.out.println("New score is " +newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimetres(3,5));
        System.out.println(calcFeetAndInchesToCentimetres(157));

    }

    public static int calculateScore(String playername , int score) {

        System.out.println("Player " + playername + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {

        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimetres(double feet , double inches){

        if (feet < 0 || inches < 0 || inches > 12 ) return -1;

        return (feet * 12 + inches) * 2.54;

    }

    public static double calcFeetAndInchesToCentimetres(double inches){

        if (inches < 0) return -1;

        // int inches parameter (without casting)
        return calcFeetAndInchesToCentimetres((int) inches / 12 , (int) inches % 12);
    }

}
