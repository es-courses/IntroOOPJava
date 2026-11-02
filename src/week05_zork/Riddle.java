package week05_zork;

public class Riddle {
    private String question;
    private String answer;

    public Riddle(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(String answer) {
        return answer.equals(this.answer);
    }

    public static void main() {
        Riddle r = new Riddle("What is your name?", "John Doe");
        System.out.println(r.getQuestion());
        System.out.println(r.checkAnswer("John Doe"));
        System.out.println(r.checkAnswer("John Smith"));
    }
}
