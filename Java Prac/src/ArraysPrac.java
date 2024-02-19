import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrac {
    public static void main(String[] args) {
//        // Initialize an array
//        int[] arr = {5, 6, 7, 8, 9};
//
//        // Print the original array
//        System.out.println("Original array:");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        // Call the reverse method
//        reverse(arr);
//
//        // Print the reversed array
//        System.out.println("Reversed array:");
//        for (int i : arr) {
//            System.out.print(i + " ");

        /*
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k] +"\t");
                }
                System.out.println();
            }
        }

         */


        /*

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int [] arr = new int [a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int limit = (int)Math.pow(2 , arr.length);


        for (int i = 0; i < limit; i++) {
            // convert i to binary and use 0's and 1's
            String set ="";
            int temp =i;


            for (int j = arr.length-1 ; j >=0 ; j--)
            //for (int j = 0; j < arr.length; j++)
            {
                int r = temp % 2;
                temp = temp / 2;

                if(r == 0){
                    set ="-\t"+ set;
                }else {
                    set= arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }



         */


       }




    }


//    public static void reverse (int [] arr) {
//        int i =0;
//        int j =arr.length-1;
//
//        while (i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }
//    }






