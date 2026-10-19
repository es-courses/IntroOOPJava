package week03_oop;

public class Animal {
    protected String sound;

    public Animal(String sound) {
        this.sound = sound;
    }

    public void speak() {
        System.out.println("I say " + sound);
    }
}
