import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //45, 67, 69, 90, 500
        int[] numbers = new int[5];

        numbers[0] = 45;
        numbers[1] = 67;
        numbers[2] = 500;
        numbers[3] = 69;
        numbers[4] = 90;

        int[] numbers2 = {45, 67, 69, 90, 500};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] myFavoriteCandyBars = {"Snickers", "3 Musketeers", "Twix", "Milky Way"};
        System.out.println("Index 1: " + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "Butterfinger";
        System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        System.out.println("Length: " + myFavoriteCandyBars.length);

        System.out.println(Array.get(myFavoriteCandyBars, 2));
    }
}

