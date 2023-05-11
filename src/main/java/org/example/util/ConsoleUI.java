package org.example.util;

import org.example.enums.FlashcardFamiliarity;
import org.example.model.Flashcard;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

public class ConsoleUI {
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to Flashcard App!");
        System.out.println("1. Create a new flashcard");
        System.out.println("2. View a flashcard");
        System.out.println("3. Edit a flashcard");
        System.out.println("4. Delete a flashcard");
        System.out.println("5. Exit");
    }

    public int getUserChoice() {
        System.out.print("Enter your choice: ");
        //adding a lambda expression
        return  validateInput(() -> scanner.nextInt());
    }

    private int validateInput(Supplier<Integer> inputSupplier) {
        int choice;
        do {
            try {
                choice = inputSupplier.get();
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Clear the invalid input
                System.out.println("Invalid input. Please enter a number.");
                System.out.print("Enter your choice: ");
            }
        } while (true);
        return choice;
    }

    public void displayFlashcard(Flashcard flashcard) {
        System.out.println("Question: " + flashcard.getQuestion());
        System.out.println("Answer: " + flashcard.getAnswer());
        System.out.println("Familiarity: " + flashcard.getFamiliarity());
    }

    public String getQuestionFromUser() {
        System.out.print("Enter the question: ");
        return scanner.nextLine();
    }

    public String getAnswerFromUser() {
        System.out.print("Enter the answer: ");
        return scanner.nextLine();
    }

    public FlashcardFamiliarity getDifficultyFromUser() {
        System.out.println("Choose the difficulty:");
        FlashcardFamiliarity[] difficulties = FlashcardFamiliarity.values();
        for (int i = 0; i < difficulties.length; i++) {
            System.out.println((i + 1) + ". " + difficulties[i].getDifficulty());
        }
        int choice = scanner.nextInt();
        return difficulties[choice - 1];
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

