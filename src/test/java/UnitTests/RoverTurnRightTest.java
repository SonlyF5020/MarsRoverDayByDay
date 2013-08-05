package UnitTests;

import com.zhanhonglai.rover.Rover;
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
        rover.setDirection(RoverDirection.W);
        //WHEN
        rover.turnRoverRight();
        //THEN
        assertThat(rover.getDirection(),equalTo(RoverDirection.N));
    }

    @Test
    public void shouldBeEastWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        rover.setDirection(RoverDirection.N);
        //WHEN
        rover.turnRoverRight();
        //THEN
        assertThat(rover.getDirection(),equalTo(RoverDirection.E));
    }

    @Test
    public void shouldBeSouthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        rover.setDirection(RoverDirection.E);
        //WHEN
        rover.turnRoverRight();
        //THEN
        assertThat(rover.getDirection(),equalTo(RoverDirection.S));
    }

    @Test
    public void shouldBeWestWhenTurnLeftFromSouth() throws Exception {
        //GIVEN
        rover.setDirection(RoverDirection.S);
        //WHEN
        rover.turnRoverRight();
        //THEN
        assertThat(rover.getDirection(),equalTo(RoverDirection.W));
    }
}
