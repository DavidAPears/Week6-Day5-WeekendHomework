
import FunctionRooms.Ballroom;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class BallroomTest {

    Ballroom ballroom;

    @Before
    public void before() {
        ballroom = new Ballroom("Bedrooms.FunctionRooms.FunctionRooms.Ballroom", "Function", 750.00, 200);
    }
}
