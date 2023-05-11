package org.example.model;

import org.example.enums.FlashcardFamiliarity;

public class Flashcard {
    private String question;
    private String answer;
    private FlashcardFamiliarity familiarity;

    public Flashcard (String question, String answer, FlashcardFamiliarity familiarity){
        this.question = question;
        this.answer = answer;
        this.familiarity = familiarity;
    }

    // Getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public FlashcardFamiliarity getFamiliarity() {
        return familiarity;
    }

    public void setFamiliarity(FlashcardFamiliarity familiarity) {
        this.familiarity = familiarity;
    }
}
