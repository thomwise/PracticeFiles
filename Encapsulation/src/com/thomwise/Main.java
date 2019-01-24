package com.thomwise;

public class Main {

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Thom", 55, "Machete");

        System.out.println("Player health = " + player.getHealth());


// POOR IMPLIMENTATION
//
// Player player = new Player();
//
//	    player.name = "Thom";
//	    player.health = 20;
//	    player.weapon = "Machete";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Health Remaining " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Health Remaining " + player.healthRemaining());
    }
}
