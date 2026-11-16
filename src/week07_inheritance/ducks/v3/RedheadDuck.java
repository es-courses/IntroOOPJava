package week07_inheritance.ducks.v3;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super("redhead");
    }

    @Override
    public void display() {
        System.out.println("Draw redhead duck");
    }
}
