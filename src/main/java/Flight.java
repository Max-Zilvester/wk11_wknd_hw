import java.util.ArrayList;

public class Flight {

    private PlaneType plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Passenger> passengerList;

    public Flight(PlaneType plane, String flightNo, String destination, String departureAirport, String departureTime){
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengerList = new ArrayList<Passenger>();
    }

    public PlaneType getPlaneType() {
        return plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public int getCapacityFromEnum() {
        return this.plane.getCapacity();
    }


//    public void bookOnAvailableSeats(Passenger passenger) {
//        if (plane.getCapacity() < getCapacityFromEnum()){
//          this.passengerList.add(passenger);
//        }
//    }

    public int getPassengerCount() {
        return passengerList.size();
    }

    public int getNumberOfAvailableSeats() {
        return this.plane.getCapacity() - getPassengerCount();
    }
}
