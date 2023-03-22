package explorer;

import explorer.MarsRover.Direction;
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
        List<?> position=new ArrayList<>();
        for (char command : commands.toCharArray()) {
            position=marsRover.rove(command);
        }

        //Then
        assertEquals(5,position.get(0));
        assertEquals(1,position.get(1));
        assertEquals("E",position.get(2));
    }
}
