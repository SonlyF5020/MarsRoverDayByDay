import com.zhanhonglai.Rover;
import com.zhanhonglai.position.RoverPosition;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverPositionMoveTest {
    @Test
    public void shouldArrive_3_2_whenMoveEastFrom_2_2() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setDirection("EAST");
        rover.setPosition(new RoverPosition(2,2));
        //WHEN
        rover.moveAhead();
        RoverPosition expectedPosition = new RoverPosition(3,2);
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }
}
