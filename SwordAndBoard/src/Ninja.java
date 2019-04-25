import java.util.Random;

public class Ninja extends Player {

    @Override
    public boolean specialAbility(Player target) {
        final int cost = 40;
        Random rando = new Random();
        if (this.resource < cost) {
            System.out.println("Not enough " + this.resourceName + " to perform ability.");
            return this.attack(target);
        }
        this.resource -= cost;
        int dmg = rando.nextInt(30) + this.strength;
        Effect poison = new Effect("Poison", 15,3);
        System.out.println(this.name + " stabs " + target.name + " in the soft parts of their " +
                "gut with a poisoned blade for " + dmg + " points of damage and additional " +
                "poison damage over time.");
        target.effects.add(poison);
        return target.takeDamage(dmg);
    }

    public Ninja(String name) {

        this.name = name;
        this.hp = 100;
        this.resource = 100;
        this.resourceName = "Ki";
        this.armor = 10;
        this.strength = 10;
    }



}
