package com.bridgelabz;

public class MoodAnalyser {

	String message;
	//Parameterize constructor
	public MoodAnalyser(String message)
	{
		this.message = message;
	}
	//default constructor
	public MoodAnalyser()
	{
		super();
	}
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

