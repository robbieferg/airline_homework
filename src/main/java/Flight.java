import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Flight {
    private ArrayList<Pilot> pilotList;
    private ArrayList<CabinCrewMember> crewList;
    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Pilot> pilotList, ArrayList<CabinCrewMember> crewList, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilotList = pilotList;
        this.crewList = crewList;
        this.passengerList = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public ArrayList<Pilot> getPilotList() {
        return this.pilotList;
    }

    public ArrayList<CabinCrewMember> getCrewList() {
        return this.crewList;
    }

    public ArrayList<Passenger> getPassengerList() {
        return this.passengerList;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
        }
    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public PlaneType getPlaneType() {
        return this.plane.getPlaneType();
    }
}
