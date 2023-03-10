package explorer;

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
        MarsRover.setX(3);
        MarsRover.setY(3);
        MarsRover.setDir("E");

        //When
        String commands = "MMRMMRMRRM";
        for (char command : commands.toCharArray()) {
            MarsRover.rove(command);
        }

        //Then
        assertEquals(5,MarsRover.getX());
        assertEquals(1,MarsRover.getY());
        assertEquals("E",MarsRover.getDir());
    }
}
