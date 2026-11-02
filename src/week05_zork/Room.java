package week05_zork;

import java.util.ArrayList;

public class Room {
    private String color;
    private ArrayList<Door> doors;
    private ArrayList<Chest> chests;
    private Dragon dragon;
    private boolean hasExit;
    private boolean exitIsLocked;

    public Room(String color) {
        this.color = color;
        doors = new ArrayList<>();
        chests = new ArrayList<>();
        dragon = null;
        hasExit = false;
        exitIsLocked = false;
    }

    public void addDoor(Room room, String direction) {
        doors.add(new Door(room, direction));
    }

    public String describe() {
        String description = "";
        description += "You are in " + color + " room.\n";
        for (Door door : doors) {
            description += door.describe();
        }
        return description;
    }

    public String getColor() {
        return color;
    }

    public Room getNextRoom(String direction) {
        for (Door door : doors) {
            if (door.hasDirection(direction)) {
                return door.getDestinationRoom();
            }
        }
        return null;
    }
}
