package Hotel.Rooms;
import Hotel.Room;

public class BedroomOne extends Room {

    private String guest;

    public BedroomOne(String roomName, String roomType, double roomRate, int capacity, String guest) {
        super(roomName, roomType, roomRate, capacity);{
            this.guest = guest;
        }

    }

    public String getGuest(){
        return this.guest;
    }


}

