import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    // Exercise 35: Sum of the powers

        int power, sum;

        System.out.print("Type a number: "); // nt 3
        power = Integer.parseInt(reader.nextLine());

        int i = 0;
        sum = 0;

        while (i <= power) {
            sum += (int)Math.pow(2, i);
            i++;
        }

        System.out.println("The result is " + sum);
    }
}