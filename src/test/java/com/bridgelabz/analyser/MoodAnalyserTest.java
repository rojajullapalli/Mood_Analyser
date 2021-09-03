package com.bridgelabz.analyser;

import com.bridgelabz.mood.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodanalyser = new MoodAnalyser("I'm in Any mood");
        String mood=moodanalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in a Sad mood");
        String mood=moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

}
