import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    // Exercise 34: Factorial

        System.out.print("Type a number: "); // nt 3
        int num = Integer.parseInt(reader.nextLine());

        int i = 1;
        int factorial = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }
        if (num == 0) {
            factorial = 1;
        }
        System.out.println("Factorial is " + factorial);
    }
}