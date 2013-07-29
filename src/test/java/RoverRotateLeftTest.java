import com.zhanhonglai.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverRotateLeftTest {
    Rover rover;
    @Before
    public void setUp(){
        rover = new Rover();
    }
    @Test
    public void shouldFaceNorthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        rover.setDirection("EAST");
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection(), is("NORTH"));
    }

    @Test
    public void shouldFaceWestWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        rover.setDirection("NORTH");
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection(),is("WEST"));
    }

    @Test
    public void shouldFaceSouthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        rover.setDirection("WEST");
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection(),is("SOUTH"));
    }

    @Test
    public void shouldFaceEastWhenTurnLeftFromSouth() throws Exception {
        //GIVEN
        rover.setDirection("SOUTH");
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection(),is("EAST"));
    }
}
