import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {

    @Test
    void calculationAmount() {
        {
            Trip trip = new Trip();
            long amount = trip.calculationAmount(0)/100;
            assertEquals(0,amount);
        }
        {
            Trip trip = new Trip();
            long amount = trip.calculationAmount(25)/100;
            assertEquals(560,amount);
        }
        {
            Trip trip = new Trip();
            long amount = trip.calculationAmount(50)/100;
            assertEquals(1_007,amount);
        }
       {
            Trip trip = new Trip();
            long amount = trip.calculationAmount(100)/100;
            assertEquals(1_960,amount);
        }

    }
}