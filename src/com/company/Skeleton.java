package com.company;

public class Skeleton extends Boss {
    int numberOfArrows;


    public Skeleton(int health, int damage, Weapon weapon, int numberOfArrows) {
        super(health, damage, weapon);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows = 25;
    }
    public String printInfo(){
        return super.printInfo() + "\nnumber of arrows: "+getNumberOfArrows();
    }
}
