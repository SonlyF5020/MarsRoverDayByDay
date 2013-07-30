import com.zhanhonglai.Rover;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverTurnRightTest {
    @Test
    public void shouldFaceEastWhenTurnRightFromNorth() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setDirection("NORTH");
        //WHEN
        rover.turnRight();
        //THEN
        assertThat(rover.getDirection(),is("EAST"));
    }
}
