import java.util.Random;

public class Barbarian extends Player{

    @Override
    public boolean specialAbility(Player target) {

        Random rando = new Random();

        int dmg = this.resource + this.strength + rando.nextInt(20);
        System.out.println(this.name + " screams the names of their fallen ancestors and " +
                "leaping int the air brings their massive axe down for " + dmg +
                " points of damage.");
        return target.takeDamage(dmg);
    }

    @Override
    public boolean takeDamage(int dmg) {
        this.resource += (dmg * 0.2);
        return super.takeDamage(dmg);
    }

    public Barbarian(String name) {
        this.name = name;
        this.hp = 200;
        this.resource = 0;
        this.resourceName = "Rage";
        this.armor = 5;
        this.strength = 20;
    }

}
