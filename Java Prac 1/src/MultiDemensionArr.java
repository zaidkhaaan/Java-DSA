import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDemensionArr {
    public static void main(String[] args) {
     /*

     1 2 3
     4 5 6
     7 8 9

      */

         // int [] [] arr = new int [3] [];
       Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // intialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());

            }
        }
        System.out.println(list);
    }
}
