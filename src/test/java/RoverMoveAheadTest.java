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

    @Test
    public void shouldArrive_1_2_whenMoveWestFrom_2_2() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setDirection("WEST");
        rover.setPosition(2,2);
        //WHEN
        rover.move();
        //THEN
        assertThat(rover.getDirection(),is("WEST"));
        assertThat(rover.getXPosition(),is(1));
        assertThat(rover.getYPosition(),is(2));
    }

    @Test
    public void shouldArrive_2_3_whenMoveNorthFrom_2_2() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setDirection("NORTH");
        rover.setPosition(2,2);
        //WHEN
        rover.move();
        //THEN
        assertThat(rover.getDirection(),is("NORTH"));
        assertThat(rover.getXPosition(),is(2));
        assertThat(rover.getYPosition(),is(3));
    }
}
