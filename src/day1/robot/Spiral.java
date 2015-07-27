package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot nancy = new Robot();
		nancy.setSpeed(10);
		nancy.penDown();
		for (int i = 0; i < 75; i++) {
			nancy.setRandomPenColor();
			nancy.move(5 * i);
			nancy.turn(360 / 5);
			nancy.setPenWidth(i);
		}

	}
}
