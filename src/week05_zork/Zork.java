package week05_zork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zork {
    private Player player;
    private ArrayList<Room> rooms;
    private Dragon dragon;
    private Chest golden;
    private Chest silver;

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

        dragon = new Dragon();
        Room dragonRoom = rooms.get(rand.nextInt(rooms.size()));
        dragonRoom.setDragon(dragon);

        golden = new Chest("golden");
        silver = new Chest("silver");
        int r = rand.nextInt(2);
        if (r == 0) {
            golden.addKey();
            dragon.setChest(golden);
        }
        else {
            silver.addKey();
            dragon.setChest(silver);
        }

    }

    public void runGame() {
        Scanner input = new Scanner(System.in);
        String [] directions = {"north", "south", "east", "west"};
        while (true) {
            System.out.println(player.getCurrentRoom().describe());
            System.out.print("> ");
            String response = input.nextLine();
            if (Arrays.asList(directions).contains(response)) {
                player.move(response);
            }
            else if(response.equals("ask dragon")) {
                if(dragon.canAnswerQuestion()) {
                    System.out.println("Dragon asks: " + dragon.askQuestion());
                    System.out.print("answer > ");
                    response = input.nextLine();
                    String answer = dragon.respond(response);
                    System.out.println(answer);
                }
                else {
                    System.out.println("Dragon not accepting questions any more");
                }
            }


        }
    }

    static void main() {
        Zork zork = new Zork();
        zork.runGame();
    }
}
