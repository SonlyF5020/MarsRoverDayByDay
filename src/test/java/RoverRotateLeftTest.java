import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.assertThat;

public class RoverRotateLeftTest {
    @Test
    public void shouldFaceNorthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setDirection("EAST");
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection(),is("North"));

    }
}
