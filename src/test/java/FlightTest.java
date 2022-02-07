import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    public Flight flight;
    public Pilot pilot1;
    public Pilot pilot2;
    public CabinCrewMember crewMember1;
    public CabinCrewMember crewMember2;
    public CabinCrewMember crewMember3;
    public Plane plane;
    public ArrayList<Pilot> pilotList;
    public ArrayList<CabinCrewMember> crewList;

    @Before
    public void before() {
        pilotList = new ArrayList<Pilot>();
        pilotList.add(pilot1);
        pilotList.add(pilot2);
        crewList = new ArrayList<CabinCrewMember>();
        crewList.add(crewMember1);
        crewList.add(crewMember2);
        crewList.add(crewMember3);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilotList, crewList, plane, "FR756", "EDI", "GLA", "15:45");
    }

    @Test
    public void hasPilotList() {
        assertEquals(2, flight.getPilotList().size());
    }

    @Test
    public void hasCrewList() {
        assertEquals(3, flight.getCrewList().size());
    }

    @Test
    public void passengerListStartsEmpty() {
        assertEquals(0, flight.getPassengerList().size());
    }

    @Test
    public void hasPlane() {
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void hasStringAttributes() {
        assertEquals("FR756", flight.getFlightNumber());
        assertEquals("EDI", flight.getDestination());
        assertEquals("GLA", flight.getDepartureAirport());
        assertEquals("15:45", flight.getDepartureTime());
    }


}
