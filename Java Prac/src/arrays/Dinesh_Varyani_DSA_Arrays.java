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

    //    System.out.println( FindSecondMAx(arr));


       moveZeros(arr);
        printArray(arr);
    }





   // function to find second largest element

   /*
    static int FindSecondMAx(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                secondmax = max; // storing previous max beforre adding any new max
                max = arr[i];
            } else if (arr[i] > secondmax && arr[i] != max) {
                secondmax =arr [i];
            }
        }
        return secondmax;
    }

    */


     static  void moveZeros(int [] arr){

        int n =arr.length;
        int j =0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;

            }
            if (arr[j] != 0){
                j++;
            }
        }
    }

    static void printArray ( int [] arr){
      int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }






}
