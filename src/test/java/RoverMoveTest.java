import com.zhanhonglai.Rover;
import com.zhanhonglai.position.RoverPosition;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverMoveTest {
    Rover rover;
    @Before
    public void setUp(){
        rover = new Rover();
    }
    @Test
    public void shouldArrive_3_2_whenMoveEastFrom_2_2() throws Exception {
        //GIVEN
        rover.setDirection("E");
        rover.setPosition(new RoverPosition(2,2));
        //WHEN
        rover.move();
        RoverPosition expectedPosition = new RoverPosition(3,2);
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }

    @Test
    public void shouldArrive_1_2_whenMoveWestFrom_2_2() throws Exception {
        //GIVEN
        rover.setDirection("W");
        rover.setPosition(new RoverPosition(2,2));
        //WHEN
        rover.move();
        RoverPosition expectedPosition = new RoverPosition(1,2);
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }

    @Test
    public void shouldArrive_2_3_whenMoveNorthFrom_2_2() throws Exception {
        //GIVEN
        rover.setDirection("N");
        rover.setPosition(new RoverPosition(2,2));
        //WHEN
        rover.move();
        RoverPosition expectedPosition = new RoverPosition(2,3);
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }

    @Test
    public void shouldArrive_2_1_whenMoveSouthFrom_2_2() throws Exception {
        //GIVEN
        rover.setDirection("S");
        rover.setPosition(new RoverPosition(2,2));
        //WHEN
        rover.move();
        RoverPosition expectedPosition = new RoverPosition(2,1);
        //THEN
        assertThat(rover.getPosition(),equalTo(expectedPosition));
    }
}
