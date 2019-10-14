import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Exercise 20: Usernames

        System.out.print("What is your username? ");
        String username = reader.nextLine();
        System.out.print("What is your password? ");
        String password = reader.nextLine();

        if (((username.equals("saara")) && password.equals("java")) || ((username.equals("admin")) && password.equals("pin"))) {
            System.out.println("Oled sisselogitud");
        } else {
            System.out.println("Sellist kasutajat ei ole või on sul vale salasõna");
        }

    }
} 