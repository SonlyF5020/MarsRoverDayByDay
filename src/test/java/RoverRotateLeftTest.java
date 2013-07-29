import com.zhanhonglai.Rover;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
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
        assertThat(rover.getDirection(), is("NORTH"));
    }

    @Test
    public void shouldFaceWestWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setDirection("NORTH");
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection(),is("WEST"));
    }

    @Test
    public void shouldFaceSouthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setDirection("WEST");
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection(),is("SOUTH"));
    }
}
