package week07_inheritance.ducks.v1;

public class Duck {
    private String type;

    public Duck(String type){
        this.type = type;
    }

    public void swim() {
        System.out.println(type + " duck is swimming");
    }

    public void quack() {
        System.out.println(type + " duck says quack");
    }

    // There are 174 duck types ...
    public void display() {
        if(type.equals("redhead")){
            System.out.println("Draw redhead duck");
        }
        else if(type.equals("mallard")){
            System.out.println("Draw mallard duck");
        }
    }

    public static void main() {
        Duck mallard = new Duck("mallard");
        Duck redhead = new Duck("redhead");

        mallard.display();
        redhead.display();
    }
}
