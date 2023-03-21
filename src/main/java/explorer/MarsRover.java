package explorer;

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

        Direction(String value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return value;
        }

        private static final Map<String, Direction> directions = Map.of("W", WEST, "N", NORTH, "S", SOUTH, "E", EAST);
        public static Direction from(String value) {
            return directions.getOrDefault(value, NOTHING);
        }

        private Direction turnRightFromWest() {
            return NORTH;
        }

        private Direction turnLeftFromWest() {
            return SOUTH;
        }

        private Direction turnRightFromEast() {
            return SOUTH;
        }

        private Direction turnLeftFromEast() {
            return NORTH;
        }

        private Direction turnRightFromNorth() {
            return EAST;
        }

        private Direction turnLeftFromNoth() {
            return WEST;
        }

        private Direction turnRightFromSouth() {
            return WEST;
        }

        private Direction turnLeftFromSouth() {
            return EAST;
        }
    }

    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    public static final char MOVE = 'M';
    private  int xCoordinate = 0;
    private  int yCoordinate = 0;
    private  Direction direction = Direction.NOTHING;

    List<?> rove(char command) {
        if (direction == Direction.NORTH) {
            switch (command) {
                case LEFT:
                    direction = Direction.NORTH.turnLeftFromNoth();
                    break;
                case RIGHT:
                    direction = Direction.NORTH.turnRightFromNorth();
                    break;
                case MOVE:
                    yCoordinate++;
                    break;
            }
        } else if (direction == Direction.EAST) {
            switch (command) {
                case LEFT:
                    direction = Direction.EAST.turnLeftFromEast();
                    break;
                case RIGHT:
                    direction = Direction.EAST.turnRightFromEast();
                    break;
                case MOVE:
                    xCoordinate++;
                    break;
            }
        } else if (direction == Direction.SOUTH) {
            switch (command) {
                case LEFT:
                    direction = Direction.SOUTH.turnLeftFromSouth();
                    break;
                case RIGHT:
                    direction = Direction.SOUTH.turnRightFromSouth();
                    break;
                case MOVE:
                    yCoordinate--;
                    break;
            }
        } else if (direction == Direction.WEST) {
            switch (command) {
                case LEFT:
                    direction = Direction.WEST.turnLeftFromWest();
                    break;
                case RIGHT:
                    direction = Direction.WEST.turnRightFromWest();
                    break;
                case MOVE:
                    xCoordinate--;
                    break;
            }
        }

      return   List.of(xCoordinate,yCoordinate,direction.value);

    }


}