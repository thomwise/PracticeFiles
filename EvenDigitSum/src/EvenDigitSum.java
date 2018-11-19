public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(99999));
    }

    public static int getEvenDigitSum(int number) {

        int sum = 0;

        if(number < 0) {
            return -1;
        }

        while(number > 0) {

            int even = number % 10;

            number = number / 10;

            if(even % 2 == 0) {
                sum = sum + even;
            }
            continue;

        }
        return sum;
    }

}
