
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Exercise 36.2: The sum of the numbers

        System.out.println("Type numbers between 5 to -1: ");
        int number;
        int sum = 0;

        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if(number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            sum+= number;
        }
        System.out.println("Sum: " + sum);
    }
}