package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {
    static class Ride{
        int kilometer;
        int minutes;
    }
    public static final int FARE_PER_KILOMETER=10;
    public static final int FARE_PER_MINUTE=1;
    public int cabFare(List<co.interleap.courses.tdd.Ride> rides)
    {
        int fare=0;
        for(co.interleap.courses.tdd.Ride ride:rides)
            fare+=ride.getKilometer() *FARE_PER_KILOMETER+ ride.getMinutes() *FARE_PER_MINUTE;

        return fare;

    }


}
