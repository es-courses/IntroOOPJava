package week07_inheritance.ducks.v3;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super("mallard");
    }

    @Override
    public void display(){
        System.out.println("Draw mallard duck");
    }
}
