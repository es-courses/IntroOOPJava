package week04_oop_2.cars;

public class Car {
    private Engine engine;
    private String brand;

    public Car(String engine, String brand) {
        this.engine = new Engine(engine);
        this.brand = brand;
    }

    public void startEngine() {
        engine.turnOn();
    }


    public static void main(String[] args) {
        Car a = new Car("gas", "BMW");
        a.startEngine();
    }

}
