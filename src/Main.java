import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Worlrd");
        System.out.println("Kathryn");

        Car myCar = new Car(25.5,
                "POOP",
                Color.ORANGE, true);

        Car rachelCar = new Car(17.4,
                "B57DE39",
                Color.GREEN, true);

        System.out.println("My car's license plate: " + myCar.licensePlate);
        System.out.println("Rachel's car's license plate: " + rachelCar.licensePlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());
    }
}