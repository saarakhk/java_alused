import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 12: Sum of the ages
        System.out.print("Type your name: ");
        String name1 = reader.nextLine();
        System.out.print("Type your age: ");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String name2 = reader.nextLine();
        System.out.print("Type your age: ");
        int num2 = Integer.parseInt(reader.nextLine());

        int theSum = num1 + num2;

        System.out.println(name1 + " and " + name2 + " are " + theSum + " years old in total.");
    }
}