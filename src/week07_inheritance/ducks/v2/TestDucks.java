package week07_inheritance.ducks.v2;

import java.util.ArrayList;
import java.util.List;

public class TestDucks {

    public static void main(String[] args) {
        List<Duck>  ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new BlueWingedDuck());

        for  (Duck duck : ducks) {
            duck.display();
            duck.quack();
        }
    }
}
