package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {

    public Statement cabFare(List<Ride> rides)
    {
        int fare=0;
        for(co.interleap.courses.tdd.Ride ride:rides)
            fare+= ride.getFare();

        return new Statement(fare, fare/rides.size(), rides.size());

    }


}
