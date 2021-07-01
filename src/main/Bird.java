package main;

public class Bird extends Animal {
    public Bird( int vitality ) {
        super(vitality);
    }
    public void fly() {
        movePosition(3);
        useVitality(1);
    }
}
