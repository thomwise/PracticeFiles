public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(-5));
        System.out.println(area(3, -2));
    }

    public static double area(double radius) {

        if(radius < 0) {
            return -1;
        } else {
            double totalArea = radius * radius * 3.14159;
            return totalArea;
        }

    }

    public static double area(double x, double y) {

        if(x < 0 || y < 0) {
            return -1;
        } else {
            double totalArea = x * y;
            return totalArea;
        }

    }

}
