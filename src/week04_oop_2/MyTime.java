package week04_oop_2;

public class MyTime {
    private int hour;
    private int minute;

    public MyTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;

        if (!isValid()) {
            this.hour = 0;
            this.minute = 0;
        }
    }

    public MyTime(String time) {
        String [] tokens = time.split(":");
        if (tokens[1].length() <= 2) {  // just number, assume 24 hour
            this.hour = Integer.parseInt(tokens[0]);
            this.minute = Integer.parseInt(tokens[1]);
        }
        else {      // more than 2 assume 12 hour where last 2 are pm or am
            int start = 0;
            int end = 0;

            if (tokens[1].length() == 3) {
                start = 1;
                end = 3;
            }
            else {
                start = 2;
                end = 4;
            }
            String indicator = tokens[1].substring(start, end);
            this.minute = Integer.parseInt(tokens[1].substring(0, start));
            if (indicator.equals("pm")) {
                this.hour = Integer.parseInt(tokens[0]);
                if (this.hour < 12) {
                    this.hour += 12;
                }
            }
            else {
                this.hour = Integer.parseInt(tokens[0]);
            }
        }

        if (!isValid()) {
            this.hour = 0;
            this.minute = 0;
        }
    }

    public boolean isValid() {
        if (this.hour < 0 || this.hour > 23) {
            return false;
        }
        if (this.minute < 0 || this.minute > 59) {
            return false;
        }
        return true;
    }

    public String get12hour() {
        String timeStr = "";
        if (this.hour == 12) {
            timeStr = this.hour + ":" + this.minute + "pm";
        }
        else if (this.hour < 12) {
            timeStr = this.hour + ":" + this.minute + "am";
        }
        else {
            int t = this.hour - 12;
            timeStr = t + ":" + this.minute + "pm";
        }
        return timeStr;
    }

    public String get24hour() {
        String timeStr = this.hour + ":" + this.minute;
        return timeStr;
    }


    static void main() {
        MyTime a = new MyTime(14, 26);
        MyTime b = new MyTime(8, 11);
        MyTime c = new MyTime(12, 49);

        MyTime d = new MyTime("10:12pm");
        MyTime e = new MyTime("26:59pm");
        MyTime f = new MyTime("11:62pm");

        System.out.println(a.get12hour());
        System.out.println(b.get12hour());
        System.out.println(c.get12hour());
        System.out.println(a.get24hour());
        System.out.println(b.get24hour());
        System.out.println(c.get24hour());
        System.out.println(d.get24hour());
        System.out.println(e.get24hour());
        System.out.println(f.get24hour());
    }
}
