package UnitTests;

import com.zhanhonglai.Rover;
import com.zhanhonglai.direction.RoverDirection;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverTurnLeftTest {
    Rover rover;
    @Before
    public void setUp(){
        rover = new Rover();
    }
    @Test
    public void shouldBeNorthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.EAST);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.NORTH));
    }

    @Test
    public void shouldBeWestWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.NORTH);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.WEST));
    }

    @Test
    public void shouldBeSouthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.WEST);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.SOUTH));
    }

    @Test
    public void shouldBeEastWhenTurnLeftFromSouth() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.SOUTH);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.EAST));
    }

}
