
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Exercise 36.4 & 36.5: Counting the average & Even and odd numbers

        System.out.println("Type numbers between 5 to -1: ");
        int number;
        int sum = 0;
        int count = 0;
        double average = 0;
        int odd = 0;
        int even = 0;

        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if(number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            } if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum+= number;
            count++;
            average = (double) sum / count;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Number of guesses: "+ count);
        System.out.println("Avarage is: " + average); // without double
        System.out.println("Even nr: " + even);
        System.out.println("Odd nr: " + odd);
    }
}