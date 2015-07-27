package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

		Robot nancy= new Robot();
		nancy.penDown();
		nancy.setPenColor(Color.MAGENTA);
		nancy.setSpeed(200);
		nancy.setPenWidth(10);
		for (int i = 0; i < 5; i++) {
			nancy.move(100);
			nancy.turn(40);
			
		}
	}
}
			
			
		
				
			
			
	
