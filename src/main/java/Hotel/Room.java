package Hotel;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private String roomName;
    private String roomType;
    private double roomRate;
    private int capacity;


    public Room(String roomName, String roomType, double roomRate, int capacity) {
        this.roomName = roomName;
        this.roomType = roomType;
        this.roomRate = roomRate;
        this.capacity = capacity;
    }


}