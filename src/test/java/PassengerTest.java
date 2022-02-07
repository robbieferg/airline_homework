import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    public Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Robbie Ferguson", 2);
    }

    @Test
    public void hasAttributes() {
        assertEquals("Robbie Ferguson", passenger.getName());
        assertEquals(2, passenger.getNumberOfBags());

    }
}
