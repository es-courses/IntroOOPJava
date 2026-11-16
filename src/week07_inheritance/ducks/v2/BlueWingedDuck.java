package week07_inheritance.ducks.v2;

public class BlueWingedDuck extends Duck {
    public BlueWingedDuck() {
        super("blue winged");
    }

    @Override
    public void display() {
        System.out.println("Draw blue winged duck");
    }
}
