package com.bridgelabz;

public class MoodAnalyserMain {



	public static void main(String[] args) {

		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String happyMood = moodAnalyser.analyseMood();
		System.out.println("My mood is :" + happyMood);
		String sadMood = moodAnalyser.analyseMood();
		System.out.println("My mood is :" + sadMood);
	}
}
