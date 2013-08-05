package functionTest;

import com.zhanhonglai.Rover;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.handler.RoverHandler;
import com.zhanhonglai.position.RoverPosition;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class IntegrationTest {
    @Test
    public void shouldMoveTo_3_minus_1_N_When_accept_command_MRRMMLMRMLML_from_1_1_N() throws Exception {
        //GIVEN
        RoverHandler roverHandler = new RoverHandler();
        Rover rover = new Rover();
        roverHandler.setRover(rover);
        //WHEN
        roverHandler.initialPosition("1 1");
        roverHandler.initialDirection("N");
        roverHandler.handleCommands("MRRMMLMRMLML");
        //THEN
        RoverPosition expectedPosition = new RoverPosition(3,-1);
        RoverDirection expectedDirection = RoverDirection.N;
        assertThat(rover.getPosition(),equalTo(expectedPosition));
        assertThat(rover.getRoverDirection(),equalTo(expectedDirection));
    }
}
