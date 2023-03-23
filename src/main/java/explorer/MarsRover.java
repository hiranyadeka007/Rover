package explorer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarsRover {

    public MarsRover(Point position, Direction direction) {
        this.position = position;
        this.direction = direction;
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
                position = position.translate(deltas.get(0), deltas.get(1));
                break;
        }

      return   List.of(position, direction);

    }


}