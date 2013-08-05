package UnitTests;

import com.zhanhonglai.direction.RoverDirection;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DirectionTurnRightTest {
    @Test
    public void shouldBeNorthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.WEST;
        //WHEN
        RoverDirection result = roverDirection.rightDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.NORTH));
    }

    @Test
    public void shouldBeEastWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.NORTH;
        //WHEN
        RoverDirection result = roverDirection.rightDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.EAST));
    }

    @Test
    public void shouldBeSouthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.EAST;
        //WHEN
        RoverDirection result = roverDirection.rightDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.SOUTH));
    }

    @Test
    public void shouldBeWestWhenTurnLeftFromSouth() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.SOUTH;
        //WHEN
        RoverDirection result = roverDirection.rightDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.WEST));
    }
}
