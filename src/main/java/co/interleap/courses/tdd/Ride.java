package co.interleap.courses.tdd;

public class Ride {
    public static final int FARE_PER_KILOMETER=10;
    public static final int FARE_PER_MINUTE=1;
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

    int getFare() {
        return getKilometer() * FARE_PER_KILOMETER + getMinutes() * FARE_PER_MINUTE;
    }
}
