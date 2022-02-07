import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    public Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Sully Sullenberger", Rank.CAPTAIN, "XDF5678Y");
    }

    @Test
    public void hasAttributes() {
        assertEquals("Sully Sullenberger", pilot.getName());
        assertEquals(Rank.CAPTAIN, pilot.getRank());
        assertEquals("XDF5678Y", pilot.getLicenceNo());

    }
}
