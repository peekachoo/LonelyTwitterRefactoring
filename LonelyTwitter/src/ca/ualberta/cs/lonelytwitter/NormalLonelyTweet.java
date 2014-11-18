package ca.ualberta.cs.lonelytwitter;

import java.io.Serializable;
import java.util.Date;

import ca.ualberta.cs.lonelytwitterdata.LonelyTweet;

public class NormalLonelyTweet extends 
LonelyTweet implements Serializable {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody();
	}
}
