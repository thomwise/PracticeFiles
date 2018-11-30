package PACKAGE_NAME;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(4097);
    }

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
        } else {

            int reverseNum = reverse(number);
            int count = 0;

            while(reverseNum > 0) {

                int lastDigit = reverseNum % 10;
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
                count += 1;

            }
        }

    }

    public static int reverse(int number) {

        int reverse = 0;
        int lastDigit = number%10;
        while(number != 0) {
            reverse = (reverse*10) + lastDigit;
            reverse /= 10;
            continue;
        }
        return reverse;
    }

}
