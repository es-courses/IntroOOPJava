package week05_zork;

public class Player {
    private Room currentRoom;

    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void move(String direction) {
        Room nextRoom = currentRoom.getNextRoom(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}
