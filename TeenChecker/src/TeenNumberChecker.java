public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(1, 11, 99);
    }

    public static boolean hasTeen(int x, int y, int z) {

        if((x <= 19 && x >= 13) || (y <= 19 && y >= 13) || (z <= 19 && z >= 13)) {
            return true;
        } else {
            return false;
        }

    }

}
