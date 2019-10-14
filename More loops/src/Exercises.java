import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Exercise 31: Lower limit and upper limit
        System.out.print("First number: ");
        int number1 = Integer.parseInt(reader.nextLine()); // 5
        System.out.print("Second number: ");
        int number2 = Integer.parseInt(reader.nextLine()); // 10



            while (number1 <= number2) {
                System.out.print(number1);
                number1++;
        }
    }
}