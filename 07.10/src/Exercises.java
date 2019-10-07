import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 15: Age of majority

        System.out.print("How old are you? ");
        int num1 = Integer.parseInt(reader.nextLine());

        if (num1 < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority");
        }
    }
} 