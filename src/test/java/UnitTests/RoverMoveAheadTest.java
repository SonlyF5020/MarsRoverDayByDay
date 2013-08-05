package UnitTests;

import com.zhanhonglai.rover.Rover;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.position.RoverPosition;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverMoveAheadTest {
    @Test
    public void shouldArrive_3_2_whenMoveEastFrom_2_2() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setPosition(new RoverPosition(2,2));
        rover.setDirection(RoverDirection.E);
        RoverPosition expectedPosition = new RoverPosition(3,2);
        //WHEN
        rover.move();
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }

    @Test
    public void shouldArrive_1_2_whenMoveWestFrom_2_2() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setPosition(new RoverPosition(2,2));
        rover.setDirection(RoverDirection.W);
        RoverPosition expectedPosition = new RoverPosition(1,2);
        //WHEN
        rover.move();
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }

    @Test
    public void shouldArrive_2_3_whenMoveNorthFrom_2_2() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setPosition(new RoverPosition(2,2));
        rover.setDirection(RoverDirection.N);
        RoverPosition expectedPosition = new RoverPosition(2,3);
        //WHEN
        rover.move();
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }

    @Test
    public void shouldArrive_2_1_whenMoveSouthFrom_2_2() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setPosition(new RoverPosition(2,2));
        rover.setDirection(RoverDirection.S);
        RoverPosition expectedPosition = new RoverPosition(2,1);
        //WHEN
        rover.move();
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }
}
