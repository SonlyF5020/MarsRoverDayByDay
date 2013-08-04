import com.zhanhonglai.Rover;
import com.zhanhonglai.direction.RoverDirection;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverTurnRightTest {
    Rover rover;
    @Before
    public void setUp(){
        rover = new Rover();
    }
    @Test
    public void shouldBeNorthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.WEST);
        //WHEN
        rover.turnRoverRight();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.NORTH));
    }

    @Test
    public void shouldBeEastWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.NORTH);
        //WHEN
        rover.turnRoverRight();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.EAST));
    }

    @Test
    public void shouldBeSouthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.EAST);
        //WHEN
        rover.turnRoverRight();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.SOUTH));
    }

    @Test
    public void shouldBeWestWhenTurnLeftFromSouth() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.SOUTH);
        //WHEN
        rover.turnRoverRight();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.WEST));
    }
}
