import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Ex8
        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        int theSum = number1 + number2;

        System.out.println("Sum of the numbers: " + theSum);
    }
}