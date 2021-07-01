package main;

import main.Animal;

public class Human extends Animal {
    private boolean isRide;

    public Human(int vitality) {
        super(vitality);
        isRide = false;
    }

    public void rideOn() {
        isRide = true;
        useVitality(1);
    }

    public void getDown() {
        isRide = false;
        useVitality(1);
    }

    public void drive() {
        if (!isRide) return;
        movePosition(5);
        useVitality(3);
    }

}
