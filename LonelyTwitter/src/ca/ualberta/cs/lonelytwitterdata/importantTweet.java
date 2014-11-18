package ca.ualberta.cs.lonelytwitterdata;

import java.util.Date;

import android.util.Log;


public class importantTweet extends LonelyTweet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public importantTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}
	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}
	
	@Override
	public String toString() {
		String impTweet = getTweetDate() + " | " + getTweetBody();
		Log.i(impTweet, impTweet);
		return impTweet;
	}


}
