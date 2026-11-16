package week07_inheritance.ducks.v3;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super("decoy");
    }

    @Override
    public void fly() {
        // Do nothing
    }

    @Override
    public void quack() {
        // Do nothing
    }

    @Override
    public void display() {
        System.out.println("Drawing a Decoy Duck");
    }
}
