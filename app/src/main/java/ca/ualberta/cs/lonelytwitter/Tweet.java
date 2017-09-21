package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by almacken on 9/13/17.
 */

public class Tweet {
    private String message;
    private Date date;
    private Mood[] moods;

    public Tweet(String message){
        this.date = new Date();
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    public Tweet(String message, Mood[] moods){
        this.message = message;
        this.moods = moods;
    }

    public Tweet(String message, Date date, Mood[] moods){
        this.date = date;
        this.message = message;
        this.moods = moods;
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public Mood[] getMoods() {
        return moods;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMoods(Mood[] moods) {
        this.moods = moods;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + this.message;
    }
}
