import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    // Exercise 33: The sum between two numbers

        System.out.print("First number: "); // nt 3
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Second number: "); // nt 5
        int secondNumber = Integer.parseInt(reader.nextLine());

        // int i = 0;
        int sum = 0;

        while (firstNumber <= secondNumber) {
            sum = sum + firstNumber;
            firstNumber++;
        }
        System.out.print(sum);
    }
}