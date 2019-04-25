public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(56,-1,55);
    }

    public static boolean hasEqualSum(int x, int y, int z) {

        if(x + y == z) {
            return true;
        } else {
            return false;
        }

    }

}
