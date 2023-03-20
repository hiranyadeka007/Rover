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
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        MarsRover.setDirection(Direction.EAST);

        //When
        String commands = "MMRMMRMRRM";
        for (char command : commands.toCharArray()) {
            MarsRover.rove(command);
        }

        //Then
        assertEquals(5,MarsRover.getxCoordinate());
        assertEquals(1,MarsRover.getyCoordinate());
        assertEquals("E",MarsRover.getDirection());
    }
}
