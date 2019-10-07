import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 14: A positive number

        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());

        if (num1 > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
} 