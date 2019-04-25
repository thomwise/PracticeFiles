package PACKAGE_NAME;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(100000);


    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }


        int reverse = reverse(number);
        int reverse2 = reverse;

        int lastDigit = 0;

        while (reverse > 0) {
            lastDigit = reverse % 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverse /= 10;

        }

        while(getDigitCount(number) != getDigitCount(reverse2)) {
            System.out.println("Zero");
            reverse2 = reverse2 * 10;
        }

    }

    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0) {
            int lastDigit = number%10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;

        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if(number == 0) {
            return 1;
        } else if(number < 0) {
            return -1;
        }

        int counter = 0;

        while (number != 0) {
            number /= 10;
            counter++;

        }
        return counter;

    }
}
