package explorer;

import explorer.MarsRover.Direction;
import java.util.List;

public class RoverRunner {

    public static void main(String[] args) {

        String currentPosition = "3 3 E";
        String commands = String.join("", List.of(String.valueOf(MarsRover.MOVE),
            String.valueOf(MarsRover.MOVE), String.valueOf(MarsRover.RIGHT))); //"MMRMMRMRRM";

        String[] positions = currentPosition.split(" ");
        MarsRover.setxCoordinate(Integer.valueOf(positions[0]));
        MarsRover.setyCoordinate(Integer.valueOf(positions[1]));
        MarsRover.setDirection(Direction.from(positions[2]));

        for (char command : commands.toCharArray()) {
            MarsRover.rove(command);
        }

        System.out.println("currentPosition..." + currentPosition);
        System.out.println("commands..." + commands);
        System.out.println("newPosition..." + MarsRover.getxCoordinate() + " " + MarsRover.getyCoordinate() + " " + MarsRover.getDirection());
    }
}
