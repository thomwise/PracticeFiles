public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(4,-3,3);
    }

    public static void printEqual(int x, int y, int z) {

        if(x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if(x == y && y == z) {
            System.out.println("All numbers are the same");
        } else if(x != y && y != z && x != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither are all equal or all different");
        }

    }

}
