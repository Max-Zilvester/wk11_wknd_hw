import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;
    Passenger passenger;
    Passenger passenger2;

    @Before
    public void setUp() {
        flight = new Flight(PlaneType.AIRBUSA380, "FR756", "FRA", "LHR", "12:00");
//        flight2 = new Flight(PlaneType.BOEING737, "GR243", "GER", "HAM", "13:00");
        passenger = new Passenger("Max", 3);
        passenger2 = new Passenger("Shelly", 2);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.AIRBUSA380, flight.getPlaneType());
    }

    @Test
    public void canGetFlightNo() {
        assertEquals("FR756", flight.getFlightNo());
    }

    @Test
    public void canGetDestination() {
        assertEquals("FRA", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport() {
        assertEquals("LHR", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals("12:00", flight.getDepartureTime());
    }

    @Test
    public void canGetnumberOfAvailableSeats(){
        assertEquals(20, flight.getCapacityFromEnum());
    }

    @Test
    public void canGetNumberOfPassengers(){
       assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(20, flight.getNumberOfAvailableSeats());
   }
}