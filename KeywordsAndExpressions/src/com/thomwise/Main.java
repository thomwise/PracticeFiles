package com.thomwise;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = calculateScore(true, 800, 5, 100);

        System.out.println("Your high score is " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);

        System.out.println("Your high score is " + highScore);



        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Juan", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Thom", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Sven", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Jorge", position);

    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }


    public static int calculateHighScorePosition(int score) {

        if(score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }

        return 4;

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }
}
