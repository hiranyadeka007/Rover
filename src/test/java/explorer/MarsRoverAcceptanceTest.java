package explorer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverAcceptanceTest {
    // shouldMoveRoverToDestination
    // shouldTestTheBehaviourOfRover
    // shouldUpdateRoverPosition
    // shouldMoveRoverToDestinationWhenUserGivesASetOfCommands
    // shouldRoverMoveFromOnePositionToAnother
    // roverNavigatesTheTerrain
    // roverNavigatesThePlateau
    @Test
    public void roverNavigatesThePlateau(){
        //Given
        MarsRover marsRover = new MarsRover(new Point(3, 3),Direction.EAST);

        //When
        String commands = "MMRMMRMRRM";
        List<?> orientation=new ArrayList<>();
        for (char command : commands.toCharArray()) {
            orientation=marsRover.rove(command);
        }

        //Then
        Point position = (Point) orientation.get(0);
        assertEquals(new Point(5, 1), position);
        assertEquals(Direction.from("E"),orientation.get(1));
    }
}
