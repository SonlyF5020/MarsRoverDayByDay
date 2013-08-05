package UnitTests;

import com.zhanhonglai.direction.RoverDirection;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DirectionTurnRightTest {
    @Test
    public void shouldBeNorthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.W;
        //WHEN
        RoverDirection result = roverDirection.rightDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.N));
    }

    @Test
    public void shouldBeEastWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.N;
        //WHEN
        RoverDirection result = roverDirection.rightDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.E));
    }

    @Test
    public void shouldBeSouthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.E;
        //WHEN
        RoverDirection result = roverDirection.rightDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.S));
    }

    @Test
    public void shouldBeWestWhenTurnLeftFromSouth() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.S;
        //WHEN
        RoverDirection result = roverDirection.rightDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.W));
    }
}
