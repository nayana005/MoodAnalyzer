package com.bridgelabz;

public class MoodAnalyserMain {

	public static void main(String args[])
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String message = "I am in happy mood";
		String mood = moodAnalyser.analyseMood(message);
		System.out.println(mood);
	}
}
