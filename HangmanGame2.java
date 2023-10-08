import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame2 {
    private static final String Database = "Database.txt";
    private static List<String> wordList;
    private static String secretWord;
    private static char[] guessedWord;
    private static List<Character> guessedLetters;

    public static void main(String[] args) {
        loadWordList();

        secretWord = getRandomWord();
        guessedWord = new char[secretWord.length()];
        guessedLetters = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int attempts = 6;
        boolean gameOver = false;

        System.out.println("Welcome to Hangman!");
        System.out.println("Guess the secret word with " + attempts + " attempts remaining.");

        while (!gameOver) {
            displayGuessedWord();

            System.out.print("Enter a letter: ");
            char letter = scanner.next().charAt(0);
            letter = Character.toLowerCase(letter);

            if (guessedLetters.contains(letter)) {
                System.out.println("You already tried that letter! Try again.");
                continue;
            }

            guessedLetters.add(letter);

            if (checkGuess(letter)) {
                System.out.println("Correct guess!");
            } else {
                attempts--;
                System.out.println("Wrong guess! " + attempts + " attempts remaining.");
                if (attempts == 0) {
                    gameOver = true;
                    System.out.println("You lost! The secret word was: " + secretWord);
                }
            }

            if (isWordGuessed()) {
                gameOver = true;
                System.out.println("Congratulations! You won!");
            }
        }

        scanner.close();
    }

    private static void loadWordList() {
        wordList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Database))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordList.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error loading word list from file.");
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static String getRandomWord() {
        Random rand = new Random();
        return wordList.get(rand.nextInt(wordList.size()));
    }

    private static void displayGuessedWord() {
        for (int i = 0; i < secretWord.length(); i++) {
            if (guessedWord[i] == '\u0000') {
                System.out.print("_ ");
            } else {
                System.out.print(guessedWord[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Guessed letters: ");
        for (char letter : guessedLetters) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    private static boolean checkGuess(char letter) {
        boolean correctGuess = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == letter) {
                guessedWord[i] = letter;
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    private static boolean isWordGuessed() {
        for (char letter : guessedWord) {
            if (letter == '\u0000') {
                return false;
            }
        }
        return true;
    }
}
