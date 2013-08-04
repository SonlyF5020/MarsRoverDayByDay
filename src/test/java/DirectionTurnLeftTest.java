import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DirectionTurnLeftTest {
    @Test
    public void shouldBeNorthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        RoverDirection roverDirection = RoverDirection.EAST;
        //WHEN
        roverDirection.turnLeft();
        //THEN
        assertThat(roverDirection,equalTo(RoverDirection.NORTH));
    }
}
