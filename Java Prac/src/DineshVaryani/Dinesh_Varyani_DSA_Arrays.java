package DineshVaryani;

import java.util.Scanner;

public class Dinesh_Varyani_DSA_Arrays {
    public static void main(String[] args) {


        //  System.out.println("zaid");

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }


         */
        //   int capacity = arr.length;

        //   System.out.println("size of og arrray  " + arr.length);

        // arr = resize(arr,10);

        // System.out.println("size after resizing "+arr.length);

        //    System.out.println( FindSecondMAx(arr));


        //  moveZeros(arr);
        //    printArray(arr);


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


    /*
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
                j++;  // to keep the counter at last
            }
        }
    }
     */



    /*

    static int [] resize (int [] arr , int capacity){
        int [] temp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;

    }



 // to find out the missing number in linear acending order array

     */
//        int arr[] = {1, 2, 3, 4, 6};
//        int totalsum = findsum(arr) - sum(arr);
//        System.out.println(totalsum);

          /*
    static int sum (int arr [] ){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }


    // approach 2 to find out the maximum straight by putting +t to arr.lenght
    static int findmax ( int arr [] ){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }

    static int findsum (int arr []){
        int n = arr.length+1;
        int totalsum = n* (n+1)/2;
        return totalsum;
    }

    static void printArray ( int [] arr){
      int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
//    https://pillai-edu-in.zoom.us/j/89605395066?pwd=dVhzN3g4K01ac2E2OTZHU0NCZXd1Zz09


          Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int N = sc.nextInt();

        // Read the elements of the array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the maximum and second maximum elements in the array
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        // The maximum possible sum of a "fair" subsequence is the sum of the maximum and second maximum elements
        int maxSum = max1 + max2;

        System.out.println(maxSum);

    }
}



     */

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

        // The maximum possible sum of a "fair" subsequence is the sum of the maximum and second maximum elements
        int arr [] = {8,1,0,2,1,0,3};
        moveZeros(arr, arr.length);
    }

    static void moveZeros (int arr[] , int n){
        int n1 =arr.length;
        int j =0;
        for (int i = 0; i < n1; i++) {
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;

            }
            if (arr[j] != 0){
                j++;  // to keep the counter at last
            }
        }
        printarray(arr);

    }

    static void printarray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        if (isPalindrome(s)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not Palindrome");
//        }


    }



//    static boolean isPalindrome (String word){
//        char [] charArray = word.toCharArray();
//
//        int start = 0;
//        int end =word.length()-1;
//
//        while (start < end){
//            if (charArray[start] != charArray[end]){
//                return false;
//            }
//            start++;
//            end--;
//
//        }
//        return true;
//
//    }



