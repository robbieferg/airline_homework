import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    public CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Roger Stevenson", Rank.CAPTAIN);
    }

    @Test
    public void crewMemberHasAttributes() {
        assertEquals("Roger Stevenson", cabinCrewMember.getName());
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }

}
