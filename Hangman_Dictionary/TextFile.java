import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class TextFile {

    public static void main(String[] args) {
        ArrayList<String> wordbanks = new ArrayList<>();

        // Iterate through levels 1 to 5
        for (int level = 1; level <= 5; level++) {
            String fileName = "Qubix-Project/Hangman_Dictionary";

            // Determine the file based on the current level
            switch (level) {
                case 1:
                    fileName += "Animals.txt";
                    break;
                case 2:
                    fileName += "Cars.txt";
                    break;
                case 3:
                    fileName += "Computer_Sciences.txt";
                    break;
                case 4:
                    fileName += "Fashion_Brands.txt";
                    break;
                case 5:
                    fileName += "Animals.txt";
                    break;
            }

            // Process 6 rounds for the current level
            for (int round = 1; round <= 6; round++) {
                // Read and store words for the current level
                ArrayList<String> words = new ArrayList<>();
                try {
                    File file = new File(fileName);
                    Scanner scanner = new Scanner(file);

                    while (scanner.hasNextLine()) {
                        words.add(scanner.nextLine());
                    }

                    scanner.close();
                } catch (Exception e) {
                    System.out.println("Error reading the file: " + fileName);
                }

                // Randomly select and print a word for the current level
                if (!words.isEmpty()) {
                    String wordbank = words.get((int) (Math.random() * words.size()));
                    wordbanks.add("Level " + level + ", Round " + round + ": " + wordbank);
                }
            }
        }

        // Print the wordbanks for each level and round
        for (String wordbank : wordbanks) {
            System.out.println(wordbank);
        }
    }
}
