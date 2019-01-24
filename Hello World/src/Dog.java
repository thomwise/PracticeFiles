public class Dog {

    String name;
    int age;
    String[] allFetchedItems = {"tennis ball", "rope", "stick"};
    private int fetchCounter = 0;
    boolean allDogsPoop;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void woof() {
        System.out.println("Woof!");
    }

    public int getAge() {
        return this.age * 7;
    }

    public void fetch() {
        this.fetchCounter = (this.fetchCounter + 1) % 3;
        String item = this.allFetchedItems[this.fetchCounter];
        System.out.println(name + " fetched a " + item + ".");
    }

    public boolean doAllDogsPoop() {
        allDogsPoop = true;
        return true;
    }
}
