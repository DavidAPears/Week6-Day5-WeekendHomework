import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;

//   ------------ Tests for Bedroom ONE ---------------
    @Test
    public void bedroomOneHasRoomName() {
        room = new BedroomOne("Bedroom One", "Double", 79.99, 2);
        assertEquals("Bedroom One", room.getRoomName());
    }

    @Test
    public void bedroomOneHasRoomType() {
        room = new BedroomOne("Bedroom One", "Double", 79.99, 2);
        assertEquals("Double", room.getRoomType());
    }

    @Test
    public void bedroomOneHasRoomRate(){
        room = new BedroomOne("Bedroom One", "Double", 79.99, 2);
        assertEquals(79.99, room.getRoomRate(), 0.01 );
    }

    @Test
    public void bedroomOneHasRoomCapacity(){
        room = new BedroomOne("Bedroom One", "Double", 79.99, 2);
        assertEquals(2, room.getRoomCapacity());
    }

    //   ------------ Tests for Bedroom TWO ---------------

    @Test
    public void bedroomTwoHasRoomName() {
        room = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
        assertEquals("Bedroom Two", room.getRoomName());
    }

    @Test
    public void bedroomTwoHasRoomType() {
        room = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
        assertEquals("Single", room.getRoomType());
    }

    @Test
    public void bedroomTwoHasRoomRate(){
        room = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
        assertEquals(59.99, room.getRoomRate(), 0.01 );
    }

    @Test
    public void bedroomTwoHasRoomCapacity(){
        room = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
        assertEquals(1, room.getRoomCapacity());
    }

    //   ------------ Tests for Ballroom  ---------------

    @Test
    public void ballroomHasRoomName() {
        room = new Ballroom("Ballroom", "Function", 750.00, 200);
        assertEquals("Ballroom", room.getRoomName());
    }

    @Test
    public void ballroomHasRoomType() {
        room = new Ballroom("Ballroom", "Function", 750.00, 200);
        assertEquals("Function", room.getRoomType());
    }

    @Test
    public void ballroomHasRoomRate() {
        room = new Ballroom("Ballroom", "Function", 750.00, 200);
        assertEquals(750, room.getRoomRate(), 0.01);
    }

    @Test
    public void ballroomHasRoomCapacity() {
        room = new Ballroom("Ballroom", "Function", 750.00, 200);
        assertEquals(200, room.getRoomCapacity());
    }

    //   ------------ Tests for Bedroom TWO ---------------

    @Test
    public void diningRoomHasRoomName() {
        room = new DiningRoom("Dining Room", "Function", 0.00, 100);
        assertEquals("Dining Room", room.getRoomName());
    }

    @Test
    public void diningRoomHasRoomType() {
        room = new DiningRoom("Dining Room", "Function", 0.00, 100);
        assertEquals("Function", room.getRoomType());
    }

    @Test
    public void diningRoomHasRoomRate() {
        room = new DiningRoom("Dining Room", "Function", 0.00, 100);
        assertEquals(0.00, room.getRoomRate(), 0.01);
    }

    @Test
    public void diningRoomHasRoomCapacity() {
        room = new DiningRoom("Dining Room", "Function", 0.00, 100);
        assertEquals(100, room.getRoomCapacity());
    }

}










