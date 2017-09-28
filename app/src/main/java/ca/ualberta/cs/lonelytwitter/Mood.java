/*
 * Copyright (c) 2017 Alexander Mackenzie, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact almacken@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * An abstract superclass that represents a mood associated with a Tweet.<br>
 * Allows a Date to be associated with this Mood, and the includes the abstract format method.
 * @author almacken
 * @version 1.0
 * @see Happy
 * @see Sad
 */
public abstract class Mood{

	protected Date date;

	public abstract String format();

	/**
	 * Returns the mood's date.
	 * @return This mood's date.
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * Sets the mood's date
	 * @param date The new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
