/*
 * Copyright (c) 2017 Alexander Mackenzie, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact almacken@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A mood that returns that it is sad when format is called
 * @author almacken
 * @version 1.0
 * @see Mood
 */
public class Sad extends Mood{

	/**
	 * Creates a Sad object at the current date
	 */
	public Sad(){
		this.date = new Date(System.currentTimeMillis());
	}

	/**
	 * Creates a Sad object at the given date
	 * @param date The date given to this object
	 */
	public Sad(Date date){
		this.date = date;
	}

	/**
	 * Gives a Sad-dependent output
	 * @return String representing the mood "Sad"
	 */
	@Override
	public String format() {
		return "Mood is: Sad...";
	}
}
