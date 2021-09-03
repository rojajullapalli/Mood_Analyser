package com.bridgelabz.analyser;

import com.bridgelabz.mood.MoodAnalyser;
import com.bridgelabz.mood.MoodAnalyserException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodanalyser = new MoodAnalyser("I'm in Any mood");
        try {
            String mood=moodanalyser.analyseMood();
            Assertions.assertEquals("HAPPY", mood);
        }catch (MoodAnalyserException e){
            e.printStackTrace();
        }

    }

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in a Sad mood");
        try{
            String mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("SAD", mood);
        }catch (MoodAnalyserException e){
            e.printStackTrace();
        }
    }

    @Test
    void givenMessage_WhenNull_ReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
           moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenMessage_WhenEmpty_ThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");

        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
            System.out.println(e.getMessage());
        }
    }
}
