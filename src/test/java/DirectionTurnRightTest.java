import com.zhanhonglai.direction.RoverDirection;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DirectionTurnRightTest {
    @Test
    public void shouldBeNorthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.WEST;
        //WHEN
        RoverDirection result = roverDirection.rightDirection();
        //THEN
        assertThat(result,equalTo(RoverDirection.NORTH));
    }
}
