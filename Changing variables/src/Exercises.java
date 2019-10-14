import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Exercise 25: Sum of three numbers
        int sum = 0;
        int read;

        System.out.println("Type a number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;

        System.out.println("Type second nr: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;

        System.out.println("Type third nr: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;

        System.out.println("Sum: " + sum);

    }
}