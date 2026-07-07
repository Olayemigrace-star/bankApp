package zone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeoPoliticalZonesTest {
    @Test
    public void geoPoliticalZonesExist() {
        GeoPoliticalZones zones = new GeoPoliticalZones();
        assertNotNull(zones);
    }

    @Test
    public void testToReturnTheGeoPoliticalTheyBelongToTest() {
        GeoPoliticalZones zones = new GeoPoliticalZones();
        assertEquals(Zones.NORTH_CENTRAL, zones.getStateName("kogi"));
    }

    @Test
    public void testNotToReturnTheGeoPoliticalTheyBelongToTest() {
        GeoPoliticalZones zones = new GeoPoliticalZones();
        assertEquals(Zones.UNKNOWN, zones.getStateName("ikeja"));

        }
    }

