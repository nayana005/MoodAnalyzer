package com.bridgelabz;

public class MoodAnalyser {

	//Method to return mood based on message
	public String analyseMood(String message)
	{
		if(message.contains("sad"))
		{
			return "SAD";
		}
		else
		{
			return "HAPPY";
		}
	}
}	
	

