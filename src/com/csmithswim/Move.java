package com.csmithswim;

class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        robot.stepForward(); // your implementation here
        System.out.println(toX);
        System.out.println(toY);
    }
}