import org.junit.Before;

public class FlightTest {
    public Flight flight;
    public Pilot pilot1;
    public Pilot pilot2;
    public CabinCrewMember crewMember1;
    public CabinCrewMember crewMember2;
    public CabinCrewMember crewMember3;
    public Plane plane;

    @Before
    public void before() {
        flight = new Flight();
    }
}
