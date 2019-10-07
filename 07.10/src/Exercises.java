import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 18: Grades and points

        System.out.print("Type the points [0-60]: ");
        int num1 = Integer.parseInt(reader.nextLine());

        if (num1 <= 29) {
            System.out.println("You failed the test!");
        } else if (num1 <= 34 && num1 > 28) {
            System.out.println("Your grade is 1");
        } else if (num1 <= 39 && num1 > 34) {
            System.out.println("Your grade is 2");
        } else if (num1 <= 44 && num1 > 39 ) {
            System.out.println("Your grade is 3");
        } else if (num1 <= 49 && num1 > 44 ) {
            System.out.println("Your grade is 4");
        } else if (num1 <= 60 && num1 > 49) {
            System.out.println("Your grade is 5");
        } else {
            System.out.println("Something went wrong");
        }
    }
} 