package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private String name;
    private String tag;
    private List<Flashcard> flashcards;

    public Deck(String name){
        this.name = name;
        this.flashcards = new ArrayList<>();
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flashcard> getFlashcards() {
        return flashcards;
    }

    public void setFlashcards(List<Flashcard> flashcards) {
        this.flashcards = flashcards;
    }

    public void addFlashcard(Flashcard flashcard) {
        flashcards.add(flashcard);
    }

    public void removeFlashcard(Flashcard flashcard) {
        flashcards.remove(flashcard);
    }


}
