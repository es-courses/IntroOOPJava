package week07_inheritance.ducks.v3;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super("rubber");
    }

    @Override
    public void quack() {
        System.out.println("Rubber Duck says squeek");
    }

    @Override
    public void fly() {
        // Do nothing
    }

    @Override
    public void display() {
        System.out.println("Drawing Rubber duck");
    }
}
