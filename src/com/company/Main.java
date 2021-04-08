package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(900);
        boss.setWeapon(new Weapon("fwef","fw"));
        boss.weapon.setNameGun("AWP");
        boss.weapon.setTypeGun("Firearms");

        System.out.println("Boss health: " + boss.getHealth() + "\nBoss damage: " + boss.getDamage() + "\nBoss name gun: "
                + boss.weapon.getNameGun() + "\nBoss type gun: "+ boss.weapon.getTypeGun());

        System.out.println("___________________");

        Boss boss1 = new Boss(1000,60,new Weapon("автомат","AK-47"));
        System.out.println(boss1.printInfo());

        System.out.println("___________________");

        Skeleton skeleton = new Skeleton(300,50, new Weapon("weapon","arbolet"), 30);
        System.out.println(skeleton.printInfo());

        System.out.println("___________________");

        Skeleton skeleton1 = new Skeleton(250,60, new Weapon("weapon", "luk"), 25);
        System.out.println(skeleton1.printInfo());

    }
}
