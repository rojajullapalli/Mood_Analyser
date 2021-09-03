package com.bridgelabz.mood;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood() {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
