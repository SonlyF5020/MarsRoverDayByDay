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
        rover.setDirection(RoverDirection.EAST);
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection(),equalTo(RoverDirection.NORTH));
    }

}
