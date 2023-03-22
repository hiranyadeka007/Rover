package explorer;

import explorer.MarsRover.Direction;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


// Inefficient Naming(Eg: dir) - Done
// Remove commented code(Dead code) - Done
// Dead code in MarsRover class(location , getlogger, setlogger) - Done
// Large Class - Done
// Long Method - Done
// Magic Constants -  Done
// Getters and setters -Done
// Data clump (Eg, x,y and dir variables) - Done
// Subtle duplication in Rove method - Done
// Duplication of switch case(Blatent duplication) - Done
// Switch case in Rove method - Done
// static cling - Done
// Code duplication on code testing Rove functionality - Done


public class MarsRoverSpecs {
    @Test
    public void facingNorthTurningLeftHeadsToWest(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.NORTH, 3, 3);
        //When
        List<?> position=marsRover.rove('L');
        //Then
        thenMarsRoverShouldBeAt("W", 3, 3, position );
    }

    private void thenMarsRoverShouldBeAt(String direction, int xCoordinate, int yCoordinate, List<?> position) {
        assertEquals(xCoordinate, position.get(0));
        assertEquals(yCoordinate, position.get(1));
        assertEquals(direction, position.get(2));
    }

    private MarsRover marsRoverIsAt(Direction direction, int xCoordinate, int yCoordinate) {
        return new MarsRover(new Point(xCoordinate, yCoordinate), direction);
    }

    @Test
    public void facingNorthTurningRightHeadsToEast(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.NORTH, 3, 3);
        //When
        List<?> position=marsRover.rove('R');
        //Then
        thenMarsRoverShouldBeAt("E",3,3,position);
    }

    @Test
    public void facingNorthMovingForwardOneGridPointInNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.NORTH,3,3);
        //When
        List<?> position=marsRover.rove('M');
        //Then
        thenMarsRoverShouldBeAt("N",3,4,position);

    }

    @Test
    public void facingEastTurningLeftHeadsToNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.EAST,3,3);
        //When
        List<?> position=marsRover.rove('L');
        //Then
        thenMarsRoverShouldBeAt("N",3,3,position);
    }

    @Test
    public void facingEastTurningRightHeadsToSouth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.EAST,3,3);
        //When
        List<?> position=marsRover.rove('R');
        //Then
        thenMarsRoverShouldBeAt("S",3,3,position);
    }

    @Test
    public void facingEastMovesForwardOneGridPointInEast(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.EAST,3,3);
        //When
        List<?> position=marsRover.rove('M');
        //Then
        thenMarsRoverShouldBeAt("E",4,3,position);
    }

    @Test
    public void facingSouthTurningLeftHeadsToEast(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.SOUTH,3,3);
        //When
        List<?> position=marsRover.rove('L');
        //Then
        thenMarsRoverShouldBeAt("E",3,3,position);
    }

    @Test
    public void facingSouthTurningRightHeadsToWest(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.SOUTH,3,3);
        //When
        List<?> position=marsRover.rove('R');
        //Then
        thenMarsRoverShouldBeAt("W",3,3,position);
    }

    @Test
    public void facingSouthMovesBackWardOneGridPointInSouth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.SOUTH,3,3);
        //When
        List<?> position=marsRover.rove('M');
        //Then
        thenMarsRoverShouldBeAt("S",3,2,position);
    }

    @Test
    public void facingWestTurningLeftHeadsToNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.WEST,3,3);
        //When
        List<?> position=marsRover.rove('L');
        //Then
        thenMarsRoverShouldBeAt("S",3,3,position);
    }

    @Test
    public void facingWestTurningRightHeadsToNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.WEST,3,3);
        //When
        List<?> position=marsRover.rove('R');
        //Then
        thenMarsRoverShouldBeAt("N",3,3,position);
    }

    @Test
    public void facingWestMovesBackWardOneGridPointInNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.WEST,3,3);
        //When
        List<?> position=marsRover.rove('M');
        //Then
        thenMarsRoverShouldBeAt("W",2,3,position);
    }
}
