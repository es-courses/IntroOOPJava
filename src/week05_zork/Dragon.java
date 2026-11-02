package week05_zork;

import java.util.ArrayList;
import java.util.Random;

public class Dragon {
    private ArrayList<Riddle> riddles;
    private Riddle selectedRiddle;
    private boolean acceptsQuestions;
    private Chest chestWithKey;

    public Dragon() {
        acceptsQuestions = true;
        chestWithKey = null;
        riddles = new ArrayList<>();
        riddles.add(new Riddle("I have cities, " +
                "but no houses. I have mountains, but no trees. " +
                "I have water, but no fish. What am I?", "Map"));
        riddles.add(new Riddle("I speak without a mouth and hear without ears. " +
                "I have no body, but I come alive with wind. " +
                "What am I?", "Echo"));
        riddles.add(new Riddle("I am full of holes, yet I still hold water. " +
                "What am I?", "Sponge"));
        riddles.add(new Riddle("What has to be broken before you can " +
                "use it?", "Egg"));
        riddles.add(new Riddle("I have a single eye, but I cannot see. " +
                "I have a sharp point, but I am not a weapon. " +
                "What am I?", "Needle"));
    }

    public void setChest(Chest chest) {
        this.chestWithKey = chest;
    }

    public String askQuestion() {
        if(!acceptsQuestions) {
            return "You were wrong before, no more riddles.";
        }
        Random rand = new Random();
        int pos = rand.nextInt(riddles.size());
        selectedRiddle = riddles.get(pos);
        return selectedRiddle.getQuestion();
    }

    public boolean checkAnswer(String answer) {
        return selectedRiddle.checkAnswer(answer);
    }

    public String respond(String answer) {
        if (!acceptsQuestions) {
            return "You were wrong before, no more riddles.";
        }
        if  (checkAnswer(answer)) {
            return "Correct! Key is in " + chestWithKey.getType() + " chest";
        }
        else {
            acceptsQuestions = false;
            return "Wrong, get lost.";
        }
    }
}
