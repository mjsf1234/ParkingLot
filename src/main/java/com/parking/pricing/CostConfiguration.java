package main.java.com.parking.pricing;

public class CostConfiguration {
    private static CostConfiguration instance;

    public static CostConfiguration getInstance() {
        if (instance == null) {
            instance = new CostConfiguration();
        }
        return instance;
    }

    public final double TWO_WHEELER_HOURLY_RATE = 3.0;
    public final double TWO_WHEELER_DAILY_RATE = 15.0;
    public final double TWO_WHEELER_MONTHLY_RATE = 80.0;
    public final double THREE_WHEELER_HOURLY_RATE = 4.0;
    public final double THREE_WHEELER_DAILY_RATE = 20.0;
    public final double THREE_WHEELER_MONTHLY_RATE = 100.0;
    public final double FOUR_WHEELER_HOURLY_RATE = 5.0;
    public final double FOUR_WHEELER_DAILY_RATE = 25.0;
    public final double FOUR_WHEELER_MONTHLY_RATE = 120.0;
}
