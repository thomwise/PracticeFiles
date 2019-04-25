import java.awt.*;
import java.lang.reflect.Array;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age >= 0 && age <= 5) {
            System.out.println("Baby");
        } else if (age >= 6 && age <= 12) {
            System.out.println("Kid");
        } else if (age >= 13 && age <=17) {
            System.out.println("Teenager");
        } else if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid");
        }

        System.out.println("Thanks for using this program!");

        double power = Math.pow(8, 5);
        System.out.println(power);

        Random rand = new Random();
        int randomNumber = rand.nextInt();
        System.out.println(randomNumber);
    }

}
