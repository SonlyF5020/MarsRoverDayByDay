package functionTest;

import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.handler.RoverHandler;
import com.zhanhonglai.Rover;
import com.zhanhonglai.position.RoverPosition;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class InitializeTest {
    @Test
    public void shouldInitialPositionWhenInputString2_3() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        RoverHandler roverHandler = new RoverHandler();
        roverHandler.setRover(rover);
        RoverPosition expectedPosition = new RoverPosition(2,3);
        //WHEN
        roverHandler.initialPosition("2 3");
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }

    @Test
    public void shouldInitialDirectionWhenInputString_E() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        RoverHandler roverHandler = new RoverHandler();
        roverHandler.setRover(rover);
        RoverDirection expectedDirection = RoverDirection.EAST;
        //WHEN
        roverHandler.initialDirection("E");
        //THEN
        assertThat(rover.getRoverDirection(),equalTo(expectedDirection));
    }
}
