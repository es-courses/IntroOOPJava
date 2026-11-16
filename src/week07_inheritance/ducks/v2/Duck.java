package week07_inheritance.ducks.v2;

public class Duck {
    private String type;

    public Duck(String type) {
        this.type = type;
    }

    public void swim() {
        System.out.println(type + " duck is swimming");
    }

    public void quack() {
        System.out.println(type + " duck says quack");
    }

    public void display() {
        // Do nothing
    }
}
