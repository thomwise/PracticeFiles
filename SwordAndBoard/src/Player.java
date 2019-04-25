import java.util.ArrayList;
import java.util.Random;

public abstract class Player {

    protected String name;
    protected int hp;
    protected int resource;
    protected String resourceName;
    protected int strength;
    protected int armor;
    protected ArrayList<Effect> effects;

    public void displayStatus() {
        String e = "";
        for(Effect effect : this.effects) {
            e += (effect.effectName + "  ");
        }
        if(this.effects.size() > 0)
            e += "\n";
        System.out.println("=================================\n" +
                            this.name + "\n" +
                            "Health: " + this.hp + "\t" + this.resourceName + ": " + this.resource + "\n" +
                            "Armor: " + this.armor + "\n" +
                            e + "=================================");
    }

    public boolean processEffects() {
        for(int i=0; i<this.effects.size(); i++) {
            Effect e = this.effects.get(i);

            switch(e.effectName) {
                case "Poison":
                    System.out.println(this.name + " takes " + e.deltaHealth + " poison damage.");
                    this.hp -= e.deltaHealth;
                    e.duration--;
                    if(e.duration <= 0) {
                        this.effects.remove(e);
                    }
                    if(this.hp <= 0) {
                        System.out.println("The poison overcomes " + this.name + " and they die.");
                        return true;
                    } else {
                        return false;
                    }
            }
        }
        return false;
    }

    public boolean attack(Player target) {
        Random rando = new Random();
        int dmg = rando.nextInt(20) + this.strength;
        System.out.println(name + " attacks " + target.name + " with their weapon and does " +
                dmg + " points of damage.\n");
        return target.takeDamage(dmg);
    }

    public boolean takeDamage(int dmg) {
        if(this.armor > 0) {
            System.out.println(this.name + "'s armor blocks " + this.armor + " points of the incoming damage.\n");
            dmg -= this.armor;
            this.armor -= (dmg * .15);
        }
        this.hp -= dmg;
        if(this.hp <= 0) {
            System.out.println(this.name + " breathes their last breath and cursing the name of their enemies dies.");
            return true;
        }
        return false;
    }

    public abstract boolean specialAbility(Player target);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Player(String name, int hp, int resource, String resourceName, int armor, int strength) {
        this.name = name;
        this.hp = hp;
        this.resource = resource;
        this.resourceName = resourceName;
        this.armor = armor;
        this.strength = strength;
        this.effects = new ArrayList<>();
    }

    public Player() {
        this.effects = new ArrayList<>();
    }
}
