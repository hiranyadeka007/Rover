package explorer;

import explorer.MarsRover.Direction;
import org.junit.jupiter.api.Test;

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
        MarsRover marsRover = new MarsRover(3,3,Direction.EAST);

        //When
        String commands = "MMRMMRMRRM";
        for (char command : commands.toCharArray()) {
            marsRover.rove(command);
        }

        //Then
        assertEquals(5,marsRover.getxCoordinate());
        assertEquals(1,marsRover.getyCoordinate());
        assertEquals("E",marsRover.getDirection());
    }
}
