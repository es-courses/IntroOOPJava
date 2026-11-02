package week05_zork;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zork {
    private Player player;
    private ArrayList<Room> rooms;

    public Zork() {
        rooms = new ArrayList<>();
        Room green = new Room("green");
        rooms.add(green);
        Room red = new Room("red");
        rooms.add(red);
        Room yellow = new Room("yellow");
        rooms.add(yellow);
        Room blue = new Room("blue");
        rooms.add(blue);
        Room white = new Room("white");
        rooms.add(white);
        green.addDoor(red, "west");
        red.addDoor(green, "east");
        red.addDoor(yellow, "north");
        yellow.addDoor(red, "south");
        yellow.addDoor(blue, "north");
        blue.addDoor(yellow, "south");
        blue.addDoor(white, "east");
        white.addDoor(blue, "west");

        Random rand = new Random();
        Room currentRoom = rooms.get(rand.nextInt(rooms.size()));
        player = new Player(currentRoom);
    }

    public void runGame() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(player.getCurrentRoom().describe());
            System.out.print("> ");
            String response = input.next();
            // for now only north, south, east, west
            player.move(response);
        }
    }

    static void main() {
        Zork zork = new Zork();
        zork.runGame();
    }
}
