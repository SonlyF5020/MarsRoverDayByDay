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
        rover.setRoverDirection(RoverDirection.E);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.N));
    }

    @Test
    public void shouldBeWestWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.N);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.W));
    }

    @Test
    public void shouldBeSouthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.W);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.S));
    }

    @Test
    public void shouldBeEastWhenTurnLeftFromSouth() throws Exception {
        //GIVEN
        rover.setRoverDirection(RoverDirection.S);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.E));
    }

}
