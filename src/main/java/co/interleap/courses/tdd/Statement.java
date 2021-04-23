package co.interleap.courses.tdd;

public class Statement {
    private int totalFare;
    private int averageFare;
    private int numberOfRides;

    public Statement(int totalFare, int averageFair, int numberOfRides) {
        this.totalFare = totalFare;
        this.averageFare = averageFair;
        this.numberOfRides = numberOfRides;
    }
    public int getTotalFare()
    {
        return totalFare;
    }

    public int getAverageFare() {
        return averageFare;
    }

    public int getNumberOfRides() {
        return numberOfRides;
    }
}
