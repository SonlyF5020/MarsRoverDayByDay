import com.zhanhonglai.Rover;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverMoveAheadTest {
    @Test
    public void shouldArrive_3_2_whenMoveEastFrom_2_2() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setDirection("EAST");
        rover.setPosition(2,2);
        //WHEN
        rover.move();
        //THEN
        assertThat(rover.getDirection(),is("EAST"));
        assertThat(rover.getXPosition(),is(3));
        assertThat(rover.getYPosition(),is(2));
    }
}
