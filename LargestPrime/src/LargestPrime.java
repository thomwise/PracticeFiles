public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(45));

    }

    public static int getLargestPrime(int number) {

        if(number <= 1) {
            return -1;
        }

        int prime;

        for (prime = 2; prime <= number/2; prime++) {

            if(number % prime == 0){
                System.out.println(prime + " is a prime number of " + number);
                number = number / prime;
                prime--;
            }

        }
        return prime;

    }

}
