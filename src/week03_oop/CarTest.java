package week03_oop;

public class CarTest {
    public static void main(String[] args) {

        Car b = new Car("VW", 3781.5);
        b.increaseSpeed(45);
        System.out.println(b);
        b.stop();
        System.out.println(b);
    }
}
