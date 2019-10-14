import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 21 Leap year

        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        if (year % 4 != 0) {
            System.out.println("is not leap");
        } else if (year % 400 == 0) {
            System.out.println("is leap");
        } else if (year % 100 == 0) {
            System.out.println("is not leap");
        } else {
            System.out.println("is leap");
        }

    }
}