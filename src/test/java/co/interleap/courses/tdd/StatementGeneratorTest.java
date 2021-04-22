package co.interleap.courses.tdd;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
public class StatementGeneratorTest {
    @Test
    public void CabTravelsZeroKMInZeroMin()
    {
        List<Ride> rides=Collections.singletonList(new Ride(0,0));
        assertEquals(0,new StatementGenerator().cabFare(rides));
    }

    @Test
    public void CabTravelsZeroKMInSomeMin()
    {
        List<Ride> rides=Collections.singletonList(new Ride(0,2));
        assertEquals(2,new StatementGenerator().cabFare(rides));
    }

    @Test
    public void CabTravelsSomeKMInZeroMin()
    {
        List<Ride> rides=Collections.singletonList(new Ride(3,0));
        assertEquals(30,new StatementGenerator().cabFare(rides));
    }

    @Test
    public void CabTravelsSomeKMInSomeMin()
    {
        List<Ride> rides=Collections.singletonList(new Ride(2,1));
        assertEquals(21,new StatementGenerator().cabFare(rides));
    }

    @Test
    public void CabWithMultipleRides()
    {
        List rides=Arrays.asList(new Ride(3,2),new Ride(1,1));
        assertEquals(43,new StatementGenerator().cabFare(rides));
    }


}
