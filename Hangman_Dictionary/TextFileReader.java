import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class TextFileReader {

    public static void main(String[] args) {
        // Level 1
        ArrayList<String> word1 = new ArrayList<>();
        try {
            File file1 = new File("/Qubix-Project/Hangman_Dictionary/Animals.txt");
            Scanner scan1 = new Scanner(file1);

            while (scan1.hasNextLine()) {
                word1.add(scan1.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error reading the file");
        }
        String wordbank1 = word1.get((int) (Math.random() * word1.size()));
        System.out.println("Level 1: " + wordbank1);

        // Level 2
        ArrayList<String> word2 = new ArrayList<>();
        try {
            File file2 = new File("/Qubix-Project/Hangman_Dictionary/Cars.txt");
            Scanner scan2 = new Scanner(file2);

            while (scan2.hasNextLine()) {
                word2.add(scan2.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error reading the file");
        }
        String wordbank2 = word2.get((int) (Math.random() * word2.size()));
        System.out.println("Level 2: " + wordbank2);

        // Level 3
        ArrayList<String> word3 = new ArrayList<>();
        try {
            File file3 = new File("/Qubix-Project/Hangman_Dictionary/Computer_Sciences.txt");
            Scanner scan3 = new Scanner(file3);

            while (scan3.hasNextLine()) {
                word3.add(scan3.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error reading the file");
        }
        String wordbank3 = word3.get((int) (Math.random() * word3.size()));
        System.out.println("Level 3: " + wordbank3);

        // Level 4
        ArrayList<String> word4 = new ArrayList<>();
        try {
            File file4 = new File("/Qubix-Project/Hangman_Dictionary/Fashion_Brands.txt");
            Scanner scan4 = new Scanner(file4);

            while (scan4.hasNextLine()) {
                word4.add(scan4.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error reading the file");
        }
        String wordbank4 = word4.get((int) (Math.random() * word4.size()));
        System.out.println("Level 4: " + wordbank4);

        // Level 5
        ArrayList<String> word5 = new ArrayList<>();
        try {
            File file5 = new File("/Qubix-Project/Hangman_Dictionary/Fruits");
            Scanner scan5 = new Scanner(file5);

            while (scan5.hasNextLine()) {
                word5.add(scan5.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error reading the file");
        }
        String wordbank5 = word5.get((int) (Math.random() * word5.size()));
        System.out.println("Level 5: " + wordbank5);
    }
}
