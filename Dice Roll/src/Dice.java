import java.util.Random;

public class Dice {

    Random rand;
    int lastRoll = -1;

    public Dice() {
        this.rand = new Random();
    }

    public int roll() {
        int currentRoll = this.rand.nextInt(6) + 1;
        this.lastRoll = currentRoll;
        return currentRoll;
    }

}
