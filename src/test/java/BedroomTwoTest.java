import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTwoTest {

    BedroomTwo bedroomTwo;

    @Before
    public void before() {
        bedroomTwo = new BedroomTwo("Bedroom Two", "Single", 59.99, 1);
    }
}
