public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(28,18));
    }

    public static boolean hasSharedDigit(int x, int y) {

        if(x < 10 || x > 99 || y < 10 || y > 99) {
            return false;
        }

        if(x%10 == y%10 || x/10 == y/10 || x%10 == y/10 || x/10 == y%10) {
            return true;
        }

        return false;

    }

}
