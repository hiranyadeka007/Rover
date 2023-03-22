package explorer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarsRover {

    public MarsRover(Point position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public enum Direction {
        NORTH("N"),
        WEST("W"),
        EAST("E"),
        SOUTH("S"),
        NOTHING("");
        private String value;
        private static final Map<Direction, List<?>> compass = new HashMap<Direction, List<?>>(){{
            put(NORTH, List.of(WEST, EAST, List.of(0, 1)));
            put(SOUTH, List.of(EAST, WEST, List.of(0, -1)));
            put(EAST, List.of(NORTH, SOUTH, List.of(1, 0)));
            put(WEST, List.of(SOUTH, NORTH, List.of(-1, 0)));
            put(NOTHING, List.of(NOTHING, NOTHING));
        }};

        Direction(String value) {
            this.value = value;
        }

        public Direction turnLeft(){
            return (Direction) compass.get(this).get(0);
        }

        public Direction turnRight(){
            return (Direction) compass.get(this).get(1);
        }

        public List<Integer> deltas(){
           return  (List<Integer>) compass.get(this).get(2);
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
    private Point position;
    private  Direction direction;

    List<?> rove(char command) {
        switch (command) {
            case LEFT:
                direction = direction.turnLeft();
                break;
            case RIGHT:
                direction = direction.turnRight();
                break;
            case MOVE:
                List<Integer> deltas = direction.deltas();
                position.translate(deltas.get(0), deltas.get(1));
                break;
        }

      return   List.of(position.getxCoordinate(),position.getyCoordinate(),direction.value);

    }


}