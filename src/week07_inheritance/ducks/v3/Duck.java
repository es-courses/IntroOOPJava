package week07_inheritance.ducks.v3;

public abstract class Duck {
    private String type;

    public Duck(String type) {
        this.type = type;
    }

    public void fly() {
        System.out.println(type + " Flying");
    }

    public void swim() {
        System.out.println(type + " duck is swimming");
    }

    public void quack() {
        System.out.println(type + " duck says quack");
    }

    public abstract void display();
}
