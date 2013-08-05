package UnitTests;

import com.zhanhonglai.direction.RoverDirection;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DirectionTurnLeftTest {
    @Test
    public void shouldBeNorthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.E;
        //WHEN
        RoverDirection result = roverDirection.leftDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.N));
    }

    @Test
    public void shouldBeWestWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.N;
        //WHEN
        RoverDirection result = roverDirection.leftDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.W));
    }

    @Test
    public void shouldBeSouthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.W;
        //WHEN
        RoverDirection result = roverDirection.leftDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.S));
    }

    @Test
    public void shouldBeEastWhenTurnLeftFromSouth() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.S;
        //WHEN
        RoverDirection result = roverDirection.leftDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.E));
    }
}
