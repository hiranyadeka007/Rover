package explorer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverSpecs {
    @Test
    public void facingNorthTurningLeftHeadsToWest(){
        //Given
        MarsRover.setDir("N");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('L');
        //Then
        assertEquals("W",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }

    @Test
    public void facingNorthTurningRightHeadsToEast(){
        //Given
        MarsRover.setDir("N");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('R');
        //Then
        assertEquals("E",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }

    @Test
    public void facingNorthMovingForwardOneGridPointInNorth(){
        //Given
        MarsRover.setDir("N");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('M');
        //Then
        assertEquals("N",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(4,MarsRover.getY());
    }

    @Test
    public void facingEastTurningLeftHeadsToNorth(){
        //Given
        MarsRover.setDir("E");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('L');
        //Then
        assertEquals("N",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }

    @Test
    public void facingEastTurningRightHeadsToSouth(){
        //Given
        MarsRover.setDir("E");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('R');
        //Then
        assertEquals("S",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }

    @Test
    public void facingEastMovesForwardOneGridPointInEast(){
        //Given
        MarsRover.setDir("E");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('M');
        //Then
        assertEquals("E",MarsRover.getDir());
        assertEquals(4,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }

    @Test
    public void facingSouthTurningLeftHeadsToEast(){
        //Given
        MarsRover.setDir("S");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('L');
        //Then
        assertEquals("E",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }

    @Test
    public void facingSouthTurningRightHeadsToWest(){
        //Given
        MarsRover.setDir("S");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('R');
        //Then
        assertEquals("W",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }

    @Test
    public void facingSouthMovesBackWardOneGridPointInSouth(){
        //Given
        MarsRover.setDir("S");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('M');
        //Then
        assertEquals("S",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(2,MarsRover.getY());
    }

    @Test
    public void facingWestTurningLeftHeadsToNorth(){
        //Given
        MarsRover.setDir("W");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('L');
        //Then
        assertEquals("S",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }

    @Test
    public void facingWestTurningRightHeadsToNorth(){
        //Given
        MarsRover.setDir("W");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('R');
        //Then
        assertEquals("N",MarsRover.getDir());
        assertEquals(3,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }

    @Test
    public void facingWestMovesBackWardOneGridPointInNorth(){
        //Given
        MarsRover.setDir("W");
        MarsRover.setX(3);
        MarsRover.setY(3);
        //When
        MarsRover.rove('M');
        //Then
        assertEquals("W",MarsRover.getDir());
        assertEquals(2,MarsRover.getX());
        assertEquals(3,MarsRover.getY());
    }
}
