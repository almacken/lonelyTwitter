package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood{

	protected Date date;

	public abstract String format();

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
