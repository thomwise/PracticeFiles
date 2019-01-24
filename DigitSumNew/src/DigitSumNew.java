public class DigitSumNew {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));

    }

    public static boolean isPerfectNumber(int number) {

        int y = 1;

        for(int i = 2; i <= number/2; i++) {
            if(number%i == 0) {
                y = y + i;
                System.out.println(y);
            }

        }
    return y == number;
    }
}


//    public static void printFactors(int number) {
//
//        if(number < 1) {
//            System.out.println("Invalid Value");
//        }
//
//        for(int i = 1; i <= number; i++) {
//            if(number % i == 0) {
//                System.out.println(i);
//            }
//        }

//    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
//
//        if(firstNumber < 10 || secondNumber < 10) {
//            return -1;
//        }
//
//        int greatestCommonDivisor = 0;
//        for(int i = 1; i <= firstNumber || i <= secondNumber; i++) {
//
//            if(firstNumber % i == 0 && secondNumber % i == 0) {
//                greatestCommonDivisor = i;
//            }
//        }
//        return greatestCommonDivisor;

//
//        if(firstNumber < 10 || secondNumber < 10) {
//            return -1;
//        }
//
//        int greatestCommonDivisor = 0;
//        int start = 1;
//        while(firstNumber >= start || secondNumber >= start) {
//            if(firstNumber % start == 0 && secondNumber % start == 0) {
//                greatestCommonDivisor = start;
//            }
//            start++;
//        }
//        return greatestCommonDivisor;


//    public static boolean hasSameLastDigit(int x, int y, int z) {
//        if(x >= 10 && x <= 1000 && y >= 10 && y <= 1000 && z >= 10 && z <= 1000) {
//            if(x%10 == y%10 || x%10 ==z%10 || y%10 == z%10) {
//                return true;
//            }
//        }
//        return false;
//    }

//    public static boolean hasSharedDigit(int x, int y) {
//
//        if(x >= 10 && x <= 99 && y >= 10 && y <=99){
//
//            if(x%10 == y%10 || x/10 == y/10 || x%10 == y/10 || y%10 == x/10) {
//                return true;
//            }
//
//        }
//        return false;
//    }

//    public static int evenDigitSum(int number) {
//
//        if(number < 0) {
//            return -1;
//        }
//
//        int sum = 0;
//        while(number > 0) {
//
//            int lastDigit = number % 10;
//            int evenDigit = 0;
//
//            if(lastDigit % 2 == 0) {
//                evenDigit = lastDigit;
//            }
//
//            sum = sum + evenDigit;
//            System.out.println("The sum is now = " + sum);
//            number /= 10;
//
//        }
//        return sum;
//
//    }


//    public static int sumFirstAndLastDigit(int number) {
//
//        if(number < 0) {
//            return -1;
//        }
//
//        int lastDigit = number % 10;
//        int sum = 0;
//        while(number > 0) {
//            int firsDigit = number % 10;
//            number /= 10;
//            sum = firsDigit + lastDigit;
//        }
//        return sum;
//    }

//    public static boolean isPalindrome(int number) {
//        if(number <= 0) {
//            return false;
//        }
//
//            int initialNumber = number;
//            int reverseNumber = 0;
//            while(number > 0) {
//
//                int lastDigit = number % 10;
//
//                number /= 10;
//                reverseNumber = (reverseNumber * 10) + lastDigit;
//                System.out.println(reverseNumber);
//
//            }
//
//        return initialNumber == reverseNumber;
//    }

//    public static int sumDigits(int number) {
//
//        if(number < 10) {
//            return -1;
//        } else {
//            int sum = 0;
//            while(number != 0) {
//                int lastDigit = number % 10;
//                System.out.println("Isolating number " + lastDigit);
//                sum = sum + lastDigit;
//                number = number / 10;
//            }
//            return sum;
//        }
//
//
//    }


