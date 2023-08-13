package J110_2_2;

public class Durations {
    private int hour;
    private int minutes;
    private int seconds;

    public Durations (int minutes, int seconds) {
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Durations (int hour, int minutes, int seconds) {
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }


    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {

        this.minutes = minutes;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public void setSeconds(int seconds)
    {

        this.seconds = seconds;
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour can not be negative");
        }
        this.hour = hour;
    }

    public String getDurationInfo() {
        if (getHour() > 0) {
            return String.format("%02d:%02d:%02d", getHour(), getMinutes(), getSeconds());
        } else {
            return String.format("%02d:%02d", getMinutes(), getSeconds());
        }
    }
}