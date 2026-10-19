package week03_oop;

public class Car {
    private String brand;
    private double km;
    private double speed;

    public Car(String brand, double km) {
        this.brand = brand;
        this.km = km;
        this.speed = 0;
    }

    public String toString() {
        return brand + ", KM:" + km + ", Speed:" + speed;
    }

    public void increaseSpeed(double value) {
        if(value > 0) {
            this.speed += value;
        }
        else {
            System.out.println("Invalid speed");
        }
    }

    public void decreaseSpeed(double value) {
        if (value <= this.speed || value > 0) {
            this.speed -= value;
        }
        else {
            System.out.println("Invalid speed");
        }
    }

    public void stop() {
        this.speed = 0;
    }
}
