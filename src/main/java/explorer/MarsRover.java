package explorer;

import java.util.logging.Logger;

public class MarsRover {
    private static int xCoordinate = 0;
    private static int yCoordinate = 0;
    private static String direction = "";
    private Logger logger = Logger.getLogger("MarsRoboRover") ;

    public static void main(String[] args) {

        String currentPosition = "3 3 E";
        String commands = "MMRMMRMRRM";

        String[] positions = currentPosition.split(" ");
        xCoordinate = Integer.valueOf(positions[0]);
        yCoordinate = Integer.valueOf(positions[1]);
        direction = positions[2];

        for (char command : commands.toCharArray()) {
            rove(command);
        }

        System.out.println("currentPosition..." + currentPosition);
        System.out.println("commands..." + commands);
        System.out.println("newPosition..." + xCoordinate + " " + yCoordinate + " " + direction);
    }

     static void rove(char command) {
        if (direction.equalsIgnoreCase("N")) {
            switch (command) {
                case 'L':
                    direction = "W";
                    break;
                case 'R':
                    direction = "E";
                    break;
                case 'M':
                    yCoordinate++;
                    break;
            }
        } else if (direction.equalsIgnoreCase("E")) {
            switch (command) {
                case 'L':
                    direction = "N";
                    break;
                case 'R':
                    direction = "S";
                    break;
                case 'M':
                    xCoordinate++;
                    break;
            }
        } else if (direction.equalsIgnoreCase("S")) {
            switch (command) {
                case 'L':
                    direction = "E";
                    break;
                case 'R':
                    direction = "W";
                    break;
                case 'M':
                    yCoordinate--;
                    break;
            }
        } else if (direction.equalsIgnoreCase("W")) {
            switch (command) {
                case 'L':
                    direction = "S";
                    break;
                case 'R':
                    direction = "N";
                    break;
                case 'M':
                    xCoordinate--;
                    break;
            }
        }
    }

    public static String location() {
        return "[" + xCoordinate + ", " + "y" + ", " + direction + "]";
    }

    public static int getxCoordinate() {
        return xCoordinate;
    }

    public static void setxCoordinate(int xCoordinate) {
        MarsRover.xCoordinate = xCoordinate;
    }

    public static int getyCoordinate() {
        return yCoordinate;
    }

    public static void setyCoordinate(int yCoordinate) {
        MarsRover.yCoordinate = yCoordinate;
    }

    public static String getDirection() {
        return direction;
    }

    public static void setDirection(String direction) {
        MarsRover.direction = direction;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}