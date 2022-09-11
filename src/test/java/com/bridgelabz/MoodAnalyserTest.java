package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void shouldReturnSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertSame("SAD", result);
    }

    @Test
    public void shouldReturnHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertSame("HAPPY", result);
    }

    @Test
    public void ShouldHandleNullMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood();
        Assert.assertSame("HAPPY", result);

    }
}