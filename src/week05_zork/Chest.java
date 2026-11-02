package week05_zork;

public class Chest {
    private String type;
    private boolean isLocked;
    private boolean hasKey;

    public Chest(String type) {
        this.type = type;
        isLocked = false;
        hasKey = false;
    }

    public void lock() {
        isLocked = true;
    }

    public void addKey() {
        hasKey = true;
    }

    public String getType() {
        return type;
    }
}
