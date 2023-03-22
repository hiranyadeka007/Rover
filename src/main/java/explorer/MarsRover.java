package explorer;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarsRover {

    public MarsRover(int xCoordinate, int yCoordinate, Direction direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public enum Direction {

        NORTH("N"),
        WEST("W"),
        EAST("E"),
        SOUTH("S"),
        NOTHING("");
        private String value;
        private static final Map<Direction, List<Direction>> compass = new HashMap<Direction, List<Direction>>(){{
            put(NORTH, List.of(WEST, EAST));
            put(SOUTH, List.of(EAST, WEST));
            put(EAST, List.of(NORTH, SOUTH));
            put(WEST, List.of(SOUTH, NORTH));
            put(NOTHING, List.of(NOTHING, NOTHING));
        }};

        Direction(String value) {
            this.value = value;
        }

        public Direction turnLeft(){
            return compass.get(this).get(0);
        }

        public Direction turnRight(){
            return compass.get(this).get(1);
        }

        @Override
        public String toString() {
            return value;
        }

        private static final Map<String, Direction> directions = Map.of("W", WEST, "N", NORTH, "S", SOUTH, "E", EAST);
        public static Direction from(String value) {
            return directions.getOrDefault(value, NOTHING);
        }
    }

    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    public static final char MOVE = 'M';
    private  int xCoordinate = 0;
    private  int yCoordinate = 0;
    private  Direction direction = Direction.NOTHING;

    List<?> rove(char command) {
        switch (command) {
            case LEFT:
                direction = direction.turnLeft();
                break;
            case RIGHT:
                direction = direction.turnRight();
                break;
        }
        if (direction == Direction.NORTH) {
            switch (command) {
                case MOVE:
                    xCoordinate = move(xCoordinate, 0);
                    yCoordinate = move(yCoordinate, 1);
                    // TODO : Abstraction in progress
                    new Point(xCoordinate, yCoordinate);
                    break;
            }
        } else if (direction == Direction.EAST) {
            switch (command) {
                case MOVE:
                    xCoordinate = move(xCoordinate, 1);
                    yCoordinate = move(yCoordinate, 0);
                    break;
            }
        } else if (direction == Direction.SOUTH) {
            switch (command) {
                case MOVE:
                    xCoordinate = move(xCoordinate, 0);
                    yCoordinate = move(yCoordinate, -1);
                    break;
            }
        } else if (direction == Direction.WEST) {
            switch (command) {
                case MOVE:
                    xCoordinate = move(xCoordinate, -1);
                    yCoordinate = move(yCoordinate, 0);
                    break;
            }
        }

      return   List.of(xCoordinate,yCoordinate,direction.value);

    }

    private int move(int coordinate, int step){
        return coordinate+step;
    }


}