package explorer;

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
    }

    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    public static final char MOVE = 'M';
    private  int xCoordinate = 0;
    private  int yCoordinate = 0;
    private  Direction direction = Direction.NOTHING;

    void rove(char command) {
        if (direction == Direction.NORTH) {
            switch (command) {
                case LEFT:
                    direction = Direction.WEST;
                    break;
                case RIGHT:
                    direction = Direction.EAST;
                    break;
                case MOVE:
                    yCoordinate++;
                    break;
            }
        } else if (direction == Direction.EAST) {
            switch (command) {
                case LEFT:
                    direction = Direction.NORTH;
                    break;
                case RIGHT:
                    direction = Direction.SOUTH;
                    break;
                case MOVE:
                    xCoordinate++;
                    break;
            }
        } else if (direction == Direction.SOUTH) {
            switch (command) {
                case LEFT:
                    direction = Direction.EAST;
                    break;
                case RIGHT:
                    direction = Direction.WEST;
                    break;
                case MOVE:
                    yCoordinate--;
                    break;
            }
        } else if (direction == Direction.WEST) {
            switch (command) {
                case LEFT:
                    direction = Direction.SOUTH;
                    break;
                case RIGHT:
                    direction = Direction.NORTH;
                    break;
                case MOVE:
                    xCoordinate--;
                    break;
            }
        }
    }


    public  int getxCoordinate() {
        return this.xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public  int getyCoordinate() {
        return this.yCoordinate;
    }

    public  void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public String getDirection() {
        return this.direction.toString();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

}