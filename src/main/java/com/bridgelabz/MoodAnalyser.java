package com.bridgelabz;

public class MoodAnalyser {

	String message;
	
	public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood (){
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (Exception e){
            return "HAPPY";
        }
    }
}

