package org.example.enums;

public enum FlashcardFamiliarity {
    KNOWN("Known"),
    SOMEWHAT_KNOWN("Somewhat known"),
    STILL_LEARNING("Still learning"),
    SOMEWHAT_DIFFICULT("Somewhat Difficult/Unfamiliar"),
    DIFFICULT("Difficult/Unfamiliar");

    private final String difficulty;

    private FlashcardFamiliarity(String difficulty){
        this.difficulty = difficulty;
    }
     public String getDifficulty(){
        return difficulty;
     }
}
