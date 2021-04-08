package com.company;

public class Boss extends GameEntity {
    public Weapon weapon;
    public Weapon getWeapon() {
        return this.weapon;
    }

    public Boss() {
    }

    public Boss(int health, int damage, Weapon weapon) {
        this.weapon = weapon;
        this.health = health;
        this.damage = damage;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "health: " + getHealth() + "\ndamage: " + getDamage() + "\nname gun: "
                + weapon.getNameGun() +  "\ntype gun: " + weapon.getTypeGun();
    }
}
