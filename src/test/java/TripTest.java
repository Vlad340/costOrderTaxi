import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {

    @Test
    public void calculationAmountZero() {
        TripService trip = new TripService();
        long amount = trip.calculationAmount(0) / 100;
        assertEquals(0, amount);
    }

    @Test
    public void calculationAmountNoBonus() {
            TripService trip = new TripService();
            long amount = trip.calculationAmount(25)/100;
            assertEquals(560,amount);
    }

    @Test
    public void calculationAmountWithBonus() {
            TripService trip = new TripService();
            long amount = trip.calculationAmount(50)/100;
            assertEquals(1_007,amount);
    }

    @Test
    public void calculationAmountWithLimitBonus() {
            TripService trip = new TripService();
            long amount = trip.calculationAmount(100)/100;
            assertEquals(1_960,amount);
    }
}