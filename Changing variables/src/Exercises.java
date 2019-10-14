import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Exercise 26: Sum of many numbers
        int sum = 0;

        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum += read;

            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}