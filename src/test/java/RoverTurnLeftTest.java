import com.zhanhonglai.Rover;
import com.zhanhonglai.direction.RoverDirection;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverTurnLeftTest {
    @Test
    public void shouldBeNorthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setRoverDirection(RoverDirection.EAST);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.NORTH));
    }

    @Test
    public void shouldBeWestWhenTurnLeftFromNorth() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setRoverDirection(RoverDirection.NORTH);
        //WHEN
        rover.turnRoverLeft();
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(RoverDirection.WEST));
    }

}
