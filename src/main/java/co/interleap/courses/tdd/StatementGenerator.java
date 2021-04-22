package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {

    public int cabFare(List<co.interleap.courses.tdd.Ride> rides)
    {
        int fare=0;
        for(co.interleap.courses.tdd.Ride ride:rides)
            fare+= ride.getFare();

        return fare;

    }


}
