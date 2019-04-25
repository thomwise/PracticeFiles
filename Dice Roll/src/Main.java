import java.util.Random;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice();
        System.out.println("Previous: " + dice.lastRoll);
        System.out.println(dice.roll());
        System.out.println("Previous: " + dice.lastRoll);
        System.out.println(dice.roll());
        System.out.println("Previous: " + dice.lastRoll);

    }

}
