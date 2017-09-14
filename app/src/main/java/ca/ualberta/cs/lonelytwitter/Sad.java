package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends Mood{

	public Sad(){
		this.date = new Date(System.currentTimeMillis());
	}

	public Sad(Date date){
		this.date = date;
	}

	@Override
	public String format() {
		return "Mood is: Sad...";
	}
}
