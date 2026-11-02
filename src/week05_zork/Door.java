package week05_zork;

public class Door {
    private Room destinationRoom;
    private String direction;

    public Door(Room room, String direction) {
        this.destinationRoom = room;
        this.direction = direction;
    }

    public String describe() {
        return "Door to " + destinationRoom.getColor() +
                " room at " +  direction + "\n";
    }

    public boolean hasDirection(String direction) {
        return this.direction.equals(direction);
    }

    public Room getDestinationRoom() {
        return destinationRoom;
    }
}
