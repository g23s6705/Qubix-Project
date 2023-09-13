
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Word_Database {
    public static void main(String[] args) {
        // Define the file containing the words for the Hangman game
        File file = new File("/storage/615F-18FC/Hangman/Words_Hangman.txt");

        try {
            // Create a scanner to read from the file
            Scanner scan = new Scanner(file);

            // Loop through the words in the file
            while (scan.hasNext()) {
                // Read a word from the file in lowercase
                String word = scan.next().toLowerCase();
                System.out.println(word);//printout all the word in the text file
                
                // Call the playHangman method to play the game with the word
                //playHangman(word);
                
            }

            // Close the scanner after reading all words
            scan.close();
            
        }catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Method to play the Hangman game with a given word
    public static void playHangman(String word) {
        

        // Example:
        // 1. Display the word with blanks for unguessed letters.
        // 2. Prompt the user for a letter guess.
        // 3. Check if the guess is correct and update the game state.
        // 4. Repeat until the word is guessed or the maximum number of attempts is reached.
    }
}
