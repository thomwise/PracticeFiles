import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Player a = new Barbarian("Bob");
       Player b = new Ninja("Sally");
       Random rando = new Random();
       Scanner keys = new Scanner(System.in);

       Player playerOne;
       Player playerTwo;

       // Coin flip to see who starts.
       if(rando.nextInt(2) == 1) {
           playerOne = a;
           playerTwo = b;
       } else {
           playerOne = b;
           playerTwo = a;
       }

       Player currentPlayer = playerOne;
       Player targetPlayer = playerTwo;
       Player swapPlayer;

       boolean win = false;

       while(!win) {

           // Trade turns.
           swapPlayer = currentPlayer;
           currentPlayer = targetPlayer;
           targetPlayer = swapPlayer;

           System.out.println(currentPlayer.name.toUpperCase() + "'s TURN\n");

           currentPlayer.displayStatus();
           targetPlayer.displayStatus();

           System.out.println(  "1. Attack\n" +
                   "2. Special Ability\n" +
                   "=================================\n" +
                   "Enter Choice: ");
           String temp = keys.nextLine();
           int action = Integer.parseInt(temp);

           switch (action) {
               case 1:
                   win = currentPlayer.attack(targetPlayer);
                   break;
               case 2:
                   win = currentPlayer.specialAbility(targetPlayer);
                   break;
               default:
                   break;
           }

       }
        System.out.println(currentPlayer.name + " is the winner of the fight!\n");

    }
}
