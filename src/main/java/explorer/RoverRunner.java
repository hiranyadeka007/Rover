package explorer;

import explorer.MarsRover.Direction;
import java.util.List;

public class RoverRunner {

    public static void main(String[] args) {

        String currentPosition = "3 3 E";
        String commands = String.join("", List.of(String.valueOf(MarsRover.MOVE),
            String.valueOf(MarsRover.MOVE), String.valueOf(MarsRover.RIGHT))); //"MMRMMRMRRM";

        String[] positions = currentPosition.split(" ");
        MarsRover marsRover = new MarsRover(Integer.valueOf(positions[0]),Integer.valueOf(positions[1]),Direction.from(positions[2]));

        for (char command : commands.toCharArray()) {
            marsRover.rove(command);
        }

        System.out.println("currentPosition..." + currentPosition);
        System.out.println("commands..." + commands);
        System.out.println("newPosition..." + marsRover.getxCoordinate() + " " + marsRover.getyCoordinate() + " " + marsRover.getDirection());
    }
}
