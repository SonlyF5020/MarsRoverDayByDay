import com.zhanhonglai.Rover;
import com.zhanhonglai.position.RoverPosition;
import org.junit.Test;

public class RoverPositionMoveTest {
    @Test
    public void shouldArrive_3_2_whenMoveEastFrom_2_2() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        rover.setPosition(new RoverPosition(2,2));
        //WHEN
        rover.move();
        RoverPosition expectedPosition = new RoverPosition(3,2);
        //THEN
        assertThat(rover.getXPosition(),equals(expectedPosition));
    }
}
