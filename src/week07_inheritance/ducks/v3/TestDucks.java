package week07_inheritance.ducks.v3;

import java.util.ArrayList;
import java.util.List;

public class TestDucks {

    public static void main(String[] args) {
        List<Duck>  ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new BlueWingedDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());

        for  (Duck duck : ducks) {
            duck.display();
            duck.quack();
            duck.fly();
        }
    }
}
