package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends Mood{

	public Happy(){
		this.date = new Date(System.currentTimeMillis());
	}

	public Happy(Date date){
		this.date = date;
	}

	@Override
	public String format() {
		return "Mood is: Happy!";
	}
}
