
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);



        System.out.println("The greatest number is: " + greatest(list));
        for (int nr : list){
            System.out.println(nr);
        }

    }

    public static int greatest(ArrayList<Integer> list) {
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}