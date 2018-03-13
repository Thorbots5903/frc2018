package org.usfirst.frc.team5903.robot;

import edu.wpi.first.wpilibj.DriverStation;

/*
 * FieldInfo: A class to demonstrate working with and aggregating information from the FRC Field Management System
 *
 * Methods: getFieldInfo()
 * 			Returns a four-character string consisting of:
 * 			- current Alliance color (R or B)
 * 			- near Switch Alliance-color location (L or R)
 * 			- Scale Alliance-color location (L or R)
 * 			- far Switch Alliance-color location (L or R)
 */
public class FieldInfo {

	// Private class variables
	private DriverStation.Alliance color; // This object holds our alliance color
	private String gameData; // This string will hold the three-letter sequence of "L" and "R"
	private String Teamloc; // This string will hold the combination of alliance color and gameData

	// Public class methods
	public String getFieldInfo() {
		color = DriverStation.getInstance().getAlliance();
		gameData = DriverStation.getInstance().getGameSpecificMessage();

		if (color == DriverStation.Alliance.Blue) {
			System.out.println("Our color is blue");
			Teamloc = "B";
		} else {
			System.out.println("Our color is red");
			Teamloc = "R";
		}

		System.out.printf("Our locations: '%s'\n", gameData);

		Teamloc = Teamloc + gameData;

		System.out.printf("Teamloc is: '%s'\n", Teamloc);
		return Teamloc;
	}
}