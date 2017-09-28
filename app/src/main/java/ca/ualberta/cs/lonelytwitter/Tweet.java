/*
 * Tweet
 *
 * Version 1.0
 *
 * Created on 9/13/17.
 *
 * Copyright (c) 2017 Alexander Mackenzie, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact almacken@ualberta.ca.
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Tweet represents a single tweet object for the application lonelyTwitter.<br>
 * It contains a text message, the date it was created on, and a list of associated moods.
 * @author almacken
 * @version 1.0
 * @see Mood
 */
public class Tweet {
    private String message;
    private Date date;
    private Mood[] moods;

    /**
     * Creates a tweet with a given body.
     * @param message The text in the Tweet's body.
     */
    public Tweet(String message){
        this.date = new Date();
        this.message = message;
    }

    /**
     * Creates a tweet with a different date than the current one.
     * @param message The text in the Tweet's body.
     * @param date The date atached to the Tweet
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

//    public Tweet(String message, Mood[] moods){
//        this.message = message;
//        this.moods = moods;
//    }
//
//    public Tweet(String message, Date date, Mood[] moods){
//        this.date = date;
//        this.message = message;
//        this.moods = moods;
//    }
//
//    public String getMessage(){
//        return this.message;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public Mood[] getMoods() {
//        return moods;
//    }

    /**
     * Sets the message for this Tweet, throwing an exception if the message is >140 characters
     * @param message The new text in the Tweet's body
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public void setMoods(Mood[] moods) {
//        this.moods = moods;
//    }

    /**
     * Converts Tweet to String, formatted as the date followed by the message.
     * @return Textual representation of this Tweet
     */
    @Override
    public String toString(){
        return date.toString() + " | " + this.message;
    }
}
