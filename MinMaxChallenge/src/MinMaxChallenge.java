import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        boolean first = true;

        while(true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if(max < number) {
                    max = number;
                }
                if (min > number) {
                    min = number;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("Min = " + min + ", Max = " + max);
        scanner.close();
    }

}
