public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(2.3599, 2.3425);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstInput, double secondInput) {

        double x = firstInput * 1000;
        double y = secondInput * 1000;

        x = (int) x;
        y = (int) y;

        if(x == y) {
            return true;
        } else {
            return false;
        }
    }

}
