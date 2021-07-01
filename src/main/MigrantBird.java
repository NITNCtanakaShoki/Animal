package main;

public class MigrantBird extends Bird {
    public MigrantBird( int vitality) {
        super(vitality);
    }
    public void sleep() {
        movePosition(3);
    }
}
