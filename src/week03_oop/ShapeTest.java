package week03_oop;

public class ShapeTest {
    public static void main() {
        Rectangle r = new Rectangle(3.5, 9);
        System.out.println(r.area());
        System.out.println(r.perimeter());

        Shape s = new Rectangle(3.5, 9);
        System.out.println(s.area());
    }
}
