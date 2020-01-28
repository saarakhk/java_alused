
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercises {
    public static void main(String [] args) {

        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Mandy");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        // sorting brothers
        Collections.sort(brothers);

        for (String bro : brothers) {
            System.out.println(bro);
        }

// removing the last item
        System.out.println("Removed last brother:");
        brothers.remove(brothers.size()-1);
        for (String bro : brothers) {
            System.out.println(bro);
        }

    }
}