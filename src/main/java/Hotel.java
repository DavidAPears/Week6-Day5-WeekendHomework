import java.util.ArrayList;

public class Hotel {

    private String hotelname;
    private ArrayList<Bedrooms> bedrooms;
    private ArrayList<Guest> guests;

    public Hotel(String name) {

        hotelname = hotelname;

        bedrooms = new ArrayList<Bedrooms>();
        bedrooms.add(new Bedrooms.BedroomOne("Bedroom One", "Double", 79.99, 2));
        bedrooms.add(new Bedrooms.BedroomTwo("Bedroom Two", "Single", 59.99, 1));
        bedrooms.add(new Bedrooms.BedroomThree("Bedroom Two", "Doubkle", 79.99, 2));

        guests = new ArrayList<Guest>();


    }
}
