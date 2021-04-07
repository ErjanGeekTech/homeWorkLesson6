package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(900);
        boss.setNameGun("AWP");
        boss.setTypeGun("Arctic Warfare Police");
        System.out.println("Boss health: " + boss.getHealth() + "\nBoss damage: " + boss.getDamage() + "\nBoss name gun: "
                + boss.getNameGun() + "\nBoss type gun: " + boss.getTypeGun());

    }
}
