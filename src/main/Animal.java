package main;

public class Animal {
    private int position;
    private int currentVitality;
    private final int maxVitality;

    public Animal( int vitality ) {
        position = 0;
        currentVitality = vitality;
        maxVitality = vitality;
    }

    public void movePosition( int n ) {
        position += n;
    }

    public void useVitality( int n ) {
        currentVitality -= n;
    }

    public void walk() {
        movePosition(1);
        useVitality(1);
    }

    public void eat() {
        currentVitality = maxVitality;
    }

    public String toString() {
        return String.format(
                "pos:%d vit:%d/%d",
                position,
                currentVitality,
                maxVitality
        );
    }
}
