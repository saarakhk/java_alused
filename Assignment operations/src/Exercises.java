import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    // Exercise 32: The sum of a set of numbers
        System.out.print("Until what? "); // nt 3
        int untilNumber = Integer.parseInt(reader.nextLine());

        int i = 0;
        int sum = 0;

        while (i < untilNumber) {
            i++;  // means the same as i = i + 1;
            sum = sum + i;
        }
        System.out.print(sum);
    }
}