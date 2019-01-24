public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int number) {

        int helperNumber = 1;
        for(int i=2; i<=number/2; i++) {
            if(number%i == 0){
                helperNumber += i;
            }
        }

        return helperNumber == number;

    }

}
