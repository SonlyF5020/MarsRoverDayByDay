import com.zhanhonglai.direction.RoverDirection;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DirectionTurnLeftTest {
    @Test
    public void shouldBeNorthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.EAST;
        //WHEN
        RoverDirection result = roverDirection.turnLeft();
        //THEN
        assertThat(result,equalTo(RoverDirection.NORTH));
    }

    @Test
    public void shouldBeWestWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.NORTH;
        //WHEN
        RoverDirection result = roverDirection.turnLeft();
        //THEN
        assertThat(result,equalTo(RoverDirection.WEST));
    }
}
