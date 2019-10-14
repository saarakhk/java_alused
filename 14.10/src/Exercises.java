import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 19: Age check

        System.out.print("How old are you?");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0 && number < 100) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
} 