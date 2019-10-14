import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Exercise 29: Even numbers
        int number = 2;

            while (number <= 100) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
                number++;
        }
    }
}