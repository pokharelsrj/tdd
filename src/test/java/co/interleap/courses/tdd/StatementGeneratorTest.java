package co.interleap.courses.tdd;
import org.junit.Test;
import static org.junit.Assert.*;
public class StatementGeneratorTest {
    @Test
    public void CabTravelsZeroKMInZeroMin()
    {
        assertEquals(0,new StatementGenerator().cabFare(0,0));
    }
}
