
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercises {
    public static void main(String [] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        String repeatedWord;

        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if (words.contains(word)) {
                repeatedWord = word;
                break;
            }else {
                words.add(word);
            }

        } // while ends
        System.out.println("You cave the word " + repeatedWord + " twice.");
        Collections.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}