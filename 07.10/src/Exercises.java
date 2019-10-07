import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 16: Even or odd?

        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());

        if (num1 % 2 == 0) {
            System.out.println("Number " + num1 + " is even.");
        } else {
            System.out.println("Number " + num1 + " is odd.");
        }
    }
} 