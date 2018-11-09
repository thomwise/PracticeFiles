package com.thomwise;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6,0);


        calcFeetAndInchesToCentimeters(65);


        /*int newscore = calculateScore("Thom", 500);
        System.out.println("The new score is " + newscore);
        int newscore2 = calculateScore(25);
        System.out.println("The new score is " + newscore2);
        calculateScore();*/
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if(feet >= 0 && inches >= 0 && inches <=12) {
            double centimeters = 12 * (feet * 2.54) + (inches * 2.54);
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters.");
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " +
                    remainingInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }

    }

    /*public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("2nd unnamed player didn't score any points!");
        return 0;
    }*/

}
