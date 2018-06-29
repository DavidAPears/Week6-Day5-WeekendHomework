package HotelTest.RoomsTest;

import Hotel.Rooms.BedroomOne;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomOneTest {

    BedroomOne bedroomOne;

    @Before
    public void before() {
        bedroomOne = new BedroomOne("Room 1", "Double Room", 79.99, 2, "Mr Andrew Jones");
    }

    @Test
    public void hasGuest() {
        assertEquals("Mr Andrew Jones", bedroomOne.getGuest());
    }

}








