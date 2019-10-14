import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Exercise 30: Up to a certain number
        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());

        int number2 = 1;

            while (number2 <= number) {
                System.out.print(number2);
                number2++;

        }
    }
}