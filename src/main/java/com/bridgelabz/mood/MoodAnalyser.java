package com.bridgelabz.mood;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if(message.length() == 0 ){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter VALID mood");
            }
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please Enter VALID Mood");
        }
    }
}
