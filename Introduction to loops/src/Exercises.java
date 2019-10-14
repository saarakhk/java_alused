import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 22: Password

        System.out.println("welcome to the calculator");

        while (true) {
            System.out.print("Enter THE password: ");
            String password = reader.nextLine();
            if (password.equals("carrot")) {
                break;
            } else if (!(password.equals("carrot"))) {
                System.out.println("The password is WRONG");
            }

        }

        System.out.println("The secret is: there is no secret!");

    }
}