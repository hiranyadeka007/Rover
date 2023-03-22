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
        NORTH("N") {
            Direction turnRight() {
                return EAST;
            }

            Direction turnLeft() {
                return WEST;
            }
        },
        WEST("W") {
            Direction turnRight() {
                return NORTH;
            }

            Direction turnLeft() {
                return SOUTH;
            }
        },
        EAST("E") {
            Direction turnRight() {
                return SOUTH;
            }

            Direction turnLeft() {
                return NORTH;
            }
        },
        SOUTH("S") {
            Direction turnRight() {
                return WEST;
            }

            Direction turnLeft() {
                return EAST;
            }
        },
        NOTHING("") {
            Direction turnRight() {
                return NOTHING;
            }

            Direction turnLeft() {
                return NOTHING;
            }
        };
        private String value;

        Direction(String value) {
            this.value = value;
        }

        abstract Direction turnLeft();
        abstract Direction turnRight();

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
                    yCoordinate++;
                    break;
            }
        } else if (direction == Direction.EAST) {
            switch (command) {
                case MOVE:
                    xCoordinate++;
                    break;
            }
        } else if (direction == Direction.SOUTH) {
            switch (command) {
                case MOVE:
                    yCoordinate--;
                    break;
            }
        } else if (direction == Direction.WEST) {
            switch (command) {
                case MOVE:
                    xCoordinate--;
                    break;
            }
        }

      return   List.of(xCoordinate,yCoordinate,direction.value);

    }


}