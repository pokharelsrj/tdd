package co.interleap.courses.tdd;
import org.junit.Test;
import static org.junit.Assert.*;
public class StatementGeneratorTest {
    @Test
    public void CabTravelsZeroKMInZeroMin()
    {
        assertEquals(0,new StatementGenerator().cabFare(0,0));
    }

    @Test
    public void CabTravelsZeroKMInSomeMin()
    {
        assertEquals(2,new StatementGenerator().cabFare(0,2));
    }

    @Test
    public void CabTravelsSomeKMInZeroMin()
    {
        assertEquals(30,new StatementGenerator().cabFare(3,0));
    }

    @Test
    public void CabTravelsSomeKMInSomeMin()
    {
        assertEquals(21,new StatementGenerator().cabFare(2,1));
    }
}
