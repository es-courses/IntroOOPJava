package week04_oop_2.cars;

public class Engine {
    private boolean off;
    private String type;

    public Engine(String type) {
        off = true;
        this.type = type;
    }

    public void turnOn() {
        off = false;
        System.out.println(type + " engine turned on");
    }

    public void turnOff() {
        off = true;
        System.out.println(type + " engine turned off");
    }
}
