public class ForLoop {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000, 2));

//        for(int i = 8; i > 1; i--) {
//
//            System.out.println("10000 at " + i + "% interest = " + String.format("%.1f", calculateInterest(10000, i)));
//
//        }
//
//        for(int i = 2; i < 8; i++) {
//            System.out.println("10000 at " + i + "% interest = " + String.format("%.1f", calculateInterest(10000, i)));
//        }

        int count = 0;

        for(int i = 50; i < 1000; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if(count == 10) {
                    System.out.println("Exiting for loop.");
                    break;
                }
            }
        }

        /*  for(int i = 0; i < 5; i++) {

            System.out.println("Hello " + i + " loop.");

        }
*/
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }




}
