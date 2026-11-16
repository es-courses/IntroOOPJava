package week07_inheritance.interfaces;

import week07_inheritance.ducks.v1.Duck;

import java.util.ArrayList;
import java.util.List;

public class TestDraw {
    public static void main() {
        List<Drawable> drawables = new ArrayList<>();
        drawables.add(new Car());
        drawables.add(new Animal());
        drawables.add(new Satellite());

        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
