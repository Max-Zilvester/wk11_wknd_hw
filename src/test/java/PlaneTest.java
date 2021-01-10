import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    Plane plane2;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING737);
        plane2 = new Plane(PlaneType.AIRBUSA380);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING737, plane.getPlaneType());
    }

    @Test
    public void boeing7373HasCapacityOf40(){
        assertEquals(40, plane.getCapacityFromEnum());
    }

    @Test
    public void boeing7373HasTotalWeightOf450(){
        assertEquals(450, plane.getTotalWeightFromEnum());
    }


}
// capacity - booked seats will give available seats
// we need a method for booked seeats