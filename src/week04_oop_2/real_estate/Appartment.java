package week04_oop_2.real_estate;

import java.util.ArrayList;

public class Appartment {
    private double price;
    private ArrayList<Room> rooms;

    public Appartment(double price) {
        this.price = price;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addRooms(String [] rooms) {
        for (String room : rooms) {
            addRoom(new Room(room));
        }
    }

    public void display() {
        System.out.println("Appartment Price: " + price);
        System.out.println("Rooms:");
        for (Room room : rooms) {
            System.out.println(room);
        }
    }


    public static void main(String [] args) {
        Appartment ap = new Appartment(120000);
        String [] rooms = {"bedroom", "bedroom", "livingroom", "wc"};
        ap.addRooms(rooms);
        ap.display();
    }
}
