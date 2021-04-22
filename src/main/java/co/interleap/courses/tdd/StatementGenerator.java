package co.interleap.courses.tdd;

public class StatementGenerator {
    public static final int FARE_PER_KILOMETER=10;
    public static final int FARE_PER_MINUTE=1;
    public int cabFare(int kilometer,int minutes)
    {
        if(kilometer==0 || minutes==0) return 0;
        return kilometer*FARE_PER_KILOMETER+minutes*FARE_PER_MINUTE;

    }
}
