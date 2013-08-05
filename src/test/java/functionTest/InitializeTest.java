package functionTest;

import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.handler.RoverHandler;
import com.zhanhonglai.rover.Rover;
import com.zhanhonglai.position.RoverPosition;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class InitializeTest {
    Rover rover;
    RoverHandler roverHandler;
    @Before
    public void setUp(){
        rover = new Rover();
        roverHandler = new RoverHandler();
        roverHandler.setRover(rover);
    }
    @Test
    public void shouldInitialPositionWhenInputString2_3() throws Exception {
        //GIVEN
        RoverPosition expectedPosition = new RoverPosition(2,3);
        //WHEN
        roverHandler.initialPosition("2 3");
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }

    @Test
    public void shouldInitialDirectionWhenInputString_E() throws Exception {
        //GIVEN
        RoverDirection expectedDirection = RoverDirection.E;
        //WHEN
        roverHandler.initialDirection("E");
        //THEN
        assertThat(rover.getDirection(),equalTo(expectedDirection));
    }
}
