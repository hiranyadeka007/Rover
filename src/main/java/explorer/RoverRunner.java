package explorer;

import explorer.MarsRover.Direction;

import java.util.ArrayList;
import java.util.List;

public class RoverRunner {

    public static void main(String[] args) {

        String currentPosition = "3 3 E";
        String commands = String.join("", List.of(String.valueOf(MarsRover.MOVE),
            String.valueOf(MarsRover.MOVE), String.valueOf(MarsRover.RIGHT))); //"MMRMMRMRRM";

        String[] positions = currentPosition.split(" ");
        MarsRover marsRover = new MarsRover(new Point(Integer.valueOf(positions[0]),Integer.valueOf(positions[1])),Direction.from(positions[2]));

        List<?> position=new ArrayList<>();
        for (char command : commands.toCharArray()) {
            position=marsRover.rove(command);
        }

        System.out.println("currentPosition..." + currentPosition);
        System.out.println("commands..." + commands);
        System.out.println("newPosition..." + position.get(0) + " " + position.get(1) + " " + position.get(2));
    }
}
