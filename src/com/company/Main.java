package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(900);
        Weapon weapon = new Weapon();
        weapon.setTypeGun("Firearms");
        weapon.setNameGun("AWP");
        //boss.setWeapon(new Weapon("efw","Efw"));



        System.out.println("Boss health: " + boss.getHealth() + "\nBoss damage: " + boss.getDamage() + "\nBoss name gun: "
                + weapon.getNameGun() + "\nBoss type gun: " + weapon.getTypeGun());

        System.out.println("___________________");
    }
}
