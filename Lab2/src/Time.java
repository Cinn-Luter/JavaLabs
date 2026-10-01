// Задания 1.4, 4.4, 5.4

public class Time {
    private int totalSeconds;

    public Time(int totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    // 4.4
    public Time(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds);
    }

    public int getTotalSeconds() {
        return totalSeconds;
    }

    // 5.4
    public int getHours() {
        return totalSeconds % 86400 / 3600;
    }

    // 5.4
    public int getMinutes() {
        return totalSeconds % 3600 / 60;
    }

    // 5.4
    public int getSeconds() {
        return totalSeconds % 60;
    }

    public String toString() {
        String st = getHours() + ":";
        if (getMinutes() < 10) {
            st += "0";
        }
        st += getMinutes() + ":";
        if (getSeconds() < 10) {
            st += "0";
        }
        return st + getSeconds();
    }
}
