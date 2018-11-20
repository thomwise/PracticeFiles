public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(88,16));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if(first < 10 || second <10) {
            return -1;
        }

        int greatestCommonDivider = 0;
        int i = 1;
        while((first >= i) || (second >= i)) {
            if((first%i == 0) && (second%i == 0)) {
                greatestCommonDivider = i;
            }
            i++;
        }
        return greatestCommonDivider;
    }

}
