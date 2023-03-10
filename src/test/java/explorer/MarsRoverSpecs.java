package explorer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


// Inefficient Naming(Eg: dir) - Done
// Remove commented code(Dead code)
// Dead code in MarsRover class(location , getlogger, setlogger)
// Magic Constants
// Getters and setters
// Data clump (Eg, x,y and dir variables)
// Subtle duplication in Rove method
// Duplication of switch case(Blatent duplication)
// Switch case in Rove method
// static cling
// Code duplication on code testing Rove functionality


public class MarsRoverSpecs {
    @Test
    public void facingNorthTurningLeftHeadsToWest(){
        //Given
        MarsRover.setDirection("N");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('L');
        //Then
        assertEquals("W",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }

    @Test
    public void facingNorthTurningRightHeadsToEast(){
        //Given
        MarsRover.setDirection("N");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('R');
        //Then
        assertEquals("E",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }

    @Test
    public void facingNorthMovingForwardOneGridPointInNorth(){
        //Given
        MarsRover.setDirection("N");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('M');
        //Then
        assertEquals("N",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(4,MarsRover.getyCoordinate());
    }

    @Test
    public void facingEastTurningLeftHeadsToNorth(){
        //Given
        MarsRover.setDirection("E");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('L');
        //Then
        assertEquals("N",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }

    @Test
    public void facingEastTurningRightHeadsToSouth(){
        //Given
        MarsRover.setDirection("E");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('R');
        //Then
        assertEquals("S",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }

    @Test
    public void facingEastMovesForwardOneGridPointInEast(){
        //Given
        MarsRover.setDirection("E");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('M');
        //Then
        assertEquals("E",MarsRover.getDirection());
        assertEquals(4,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }

    @Test
    public void facingSouthTurningLeftHeadsToEast(){
        //Given
        MarsRover.setDirection("S");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('L');
        //Then
        assertEquals("E",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }

    @Test
    public void facingSouthTurningRightHeadsToWest(){
        //Given
        MarsRover.setDirection("S");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('R');
        //Then
        assertEquals("W",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }

    @Test
    public void facingSouthMovesBackWardOneGridPointInSouth(){
        //Given
        MarsRover.setDirection("S");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('M');
        //Then
        assertEquals("S",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(2,MarsRover.getyCoordinate());
    }

    @Test
    public void facingWestTurningLeftHeadsToNorth(){
        //Given
        MarsRover.setDirection("W");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('L');
        //Then
        assertEquals("S",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }

    @Test
    public void facingWestTurningRightHeadsToNorth(){
        //Given
        MarsRover.setDirection("W");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('R');
        //Then
        assertEquals("N",MarsRover.getDirection());
        assertEquals(3,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }

    @Test
    public void facingWestMovesBackWardOneGridPointInNorth(){
        //Given
        MarsRover.setDirection("W");
        MarsRover.setxCoordinate(3);
        MarsRover.setyCoordinate(3);
        //When
        MarsRover.rove('M');
        //Then
        assertEquals("W",MarsRover.getDirection());
        assertEquals(2,MarsRover.getxCoordinate());
        assertEquals(3,MarsRover.getyCoordinate());
    }
}
