package arrays;

import java.util.Scanner;

public class Dinesh_Varyani_DSA_Arrays {
    public static void main(String[] args) {



      //  System.out.println("zaid");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

    }



}
