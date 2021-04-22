package co.interleap.courses.tdd;

public class Ride {
    private final int kilometer;
    private final int minutes;

    public Ride(int kilometer, int minutes) {
        this.kilometer = kilometer;
        this.minutes = minutes;
    }

    public int getKilometer() {
        return kilometer;
    }

    public int getMinutes() {
        return minutes;
    }
}
