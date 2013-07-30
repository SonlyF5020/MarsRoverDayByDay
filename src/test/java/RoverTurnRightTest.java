import com.zhanhonglai.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverTurnRightTest {
    Rover rover;
    @Before
    public void setUp(){
        rover = new Rover();
    }
    @Test
    public void shouldFaceEastWhenTurnRightFromNorth() throws Exception {
        //GIVEN
        rover.setDirection("NORTH");
        //WHEN
        rover.turnRight();
        //THEN
        assertThat(rover.getDirection(),is("EAST"));
    }

    @Test
    public void shouldFaceSouthWhenTurnRightFromEast() throws Exception {
        //GIVEN
        rover.setDirection("EAST");
        //WHEN
        rover.turnRight();
        //THEN
        assertThat(rover.getDirection(),is("SOUTH"));
    }

    @Test
    public void shouldFaceWestWhenTurnRightFromSouth() throws Exception {
        //GIVEN
        rover.setDirection("SOUTH");
        //WHEN
        rover.turnRight();
        //THEN
        assertThat(rover.getDirection(),is("WEST"));

    }

    @Test
    public void shouldFaceNorthWhenTurnRightFromWest() throws Exception {
        //GIVEN
        rover.setDirection("WEST");
        //WHEN
        rover.turnRight();
        //THEN
        assertThat(rover.getDirection(),is("NORTH"));

    }
}
