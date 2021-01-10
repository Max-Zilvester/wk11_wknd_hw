import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    Passenger passenger2;

    @Before
    public void before(){
        passenger = new Passenger("Max", 3);
        passenger2 = new Passenger("Shelly", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Max", passenger.getName());
    }

    @Test
    public void canGetNoOfBags(){
        assertEquals(3, passenger.getNoOfBags());
    }
}
