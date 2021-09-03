package com.bridgelabz.analyser;

import com.bridgelabz.mood.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser registration = new MoodAnalyser();
        String mood=registration.analyseMood("This is Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser registration = new MoodAnalyser();
        String mood=registration.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD", mood);
    }

}
