package co.interleap.courses.tdd;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
public class StatementGeneratorTest {
    @Test
    public void CabWithMultipleRides()
    {
        List rides=Arrays.asList(new Ride(3,4),new Ride(5,1));
        Statement statement=new StatementGenerator().cabFare(rides);
        assertEquals(85,statement.getTotalFare());
        assertEquals(42,statement.getAverageFare());
        assertEquals(2,statement.getNumberOfRides());
    }


}
