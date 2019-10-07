import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 17: Greater number

        System.out.print("Type the first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        int greaterNumber =  Math.max(num1,num2);

        if (num1 > num2) {
            System.out.println("Number " + num1 + " is bigger than " + num2);
        } else if (num1 < num2) {
            System.out.println("Number " + num2 + " is bigger than " + num1);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
} 