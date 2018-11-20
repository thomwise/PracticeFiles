public class SameLastDigit {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11,56,71));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {

        if(x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
            return false;
        }

        int lastDigitX = x%10;
        int lastDigitY = y%10;
        int lastDigitZ = z%10;

        if(lastDigitX == lastDigitY || lastDigitX == lastDigitZ || lastDigitY == lastDigitZ) {
            return true;
        }
        return false;

    }

}
