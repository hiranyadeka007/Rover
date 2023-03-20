package explorer;

import explorer.MarsRover.Direction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


// Inefficient Naming(Eg: dir) - Done
// Remove commented code(Dead code) - Done
// Dead code in MarsRover class(location , getlogger, setlogger) - done
// Large Class - Done
// Long Method - Inprogress-parked
// Magic Constants -  done
// Getters and setters
// Data clump (Eg, x,y and dir variables)
// Subtle duplication in Rove method
// Duplication of switch case(Blatent duplication)
// Switch case in Rove method
// static cling - done
// Code duplication on code testing Rove functionality


public class MarsRoverSpecs {
    @Test
    public void facingNorthTurningLeftHeadsToWest(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.NORTH, 3, 3);
        //When
        marsRover.rove('L');
        //Then
        thenMarsRoverShouldBeAt("W", 3, 3, marsRover );
    }

    private void thenMarsRoverShouldBeAt(String direction, int xCoordinate, int yCoordinate, MarsRover marsRover) {
        assertEquals(direction,marsRover.getDirection());
        assertEquals(xCoordinate,marsRover.getxCoordinate());
        assertEquals(yCoordinate,marsRover.getyCoordinate());
    }

    private MarsRover marsRoverIsAt(Direction direction, int xCoordinate, int yCoordinate) {
       return new MarsRover(xCoordinate,yCoordinate, direction);
    }

    @Test
    public void facingNorthTurningRightHeadsToEast(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.NORTH, 3, 3);
        //When
        marsRover.rove('R');
        //Then
        thenMarsRoverShouldBeAt("E",3,3,marsRover);
    }

    @Test
    public void facingNorthMovingForwardOneGridPointInNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.NORTH,3,3);
        //When
        marsRover.rove('M');
        //Then
        thenMarsRoverShouldBeAt("N",3,4,marsRover);

    }

    @Test
    public void facingEastTurningLeftHeadsToNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.EAST,3,3);
        //When
        marsRover.rove('L');
        //Then
        thenMarsRoverShouldBeAt("N",3,3,marsRover);
    }

    @Test
    public void facingEastTurningRightHeadsToSouth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.EAST,3,3);
        //When
        marsRover.rove('R');
        //Then
        thenMarsRoverShouldBeAt("S",3,3,marsRover);
    }

    @Test
    public void facingEastMovesForwardOneGridPointInEast(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.EAST,3,3);
        //When
        marsRover.rove('M');
        //Then
        thenMarsRoverShouldBeAt("E",4,3,marsRover);
    }

    @Test
    public void facingSouthTurningLeftHeadsToEast(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.SOUTH,3,3);
        //When
        marsRover.rove('L');
        //Then
        thenMarsRoverShouldBeAt("E",3,3,marsRover);
    }

    @Test
    public void facingSouthTurningRightHeadsToWest(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.SOUTH,3,3);
        //When
        marsRover.rove('R');
        //Then
        thenMarsRoverShouldBeAt("W",3,3,marsRover);
    }

    @Test
    public void facingSouthMovesBackWardOneGridPointInSouth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.SOUTH,3,3);
        //When
        marsRover.rove('M');
        //Then
        thenMarsRoverShouldBeAt("S",3,2,marsRover);
    }

    @Test
    public void facingWestTurningLeftHeadsToNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.WEST,3,3);
        //When
        marsRover.rove('L');
        //Then
        thenMarsRoverShouldBeAt("S",3,3,marsRover);
    }

    @Test
    public void facingWestTurningRightHeadsToNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.WEST,3,3);
        //When
        marsRover.rove('R');
        //Then
        thenMarsRoverShouldBeAt("N",3,3,marsRover);
    }

    @Test
    public void facingWestMovesBackWardOneGridPointInNorth(){
        //Given
        MarsRover marsRover = marsRoverIsAt(Direction.WEST,3,3);
        //When
        marsRover.rove('M');
        //Then
        thenMarsRoverShouldBeAt("W",2,3,marsRover);
    }
}
