package PEPCODING_LEVEL_1;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
//        int arr[] = {10, 30, 20, 20, 30, 10, 10, 30, 10, 30};

//        int occ=1;
//        for (int i = 0; i < arr.length; i++) {
//            for ( int j = 1 ; j <arr.length; j++){
//                if (arr[i]==arr[j]){
//                    occ++;
//                }
//            }
//            System.out.println(arr[i]+"  "+ occ);
//
//            occ=0;

//        int n = arr.length;
//        int i = 0, j = 0;
//
//        while (i < n) {
//            while (j < n && arr[i] == arr[j]) {
//                j++;
//            }
//            System.out.println("Element: " + arr[i] + " Frequency: " + (j - i));
//            i = j;
//


        // COunt frequency of elemnts in array
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the size of array");

        int n = sc.nextInt();

        int arr[] = new int[n];
        for ( int i = 0 ; i < arr.length; i++){

            arr[i]=sc.nextInt();
        }

        int n1 = arr.length;
        CountFreq(arr,n1);


    static void CountFreq(int arr[] , int n1){

        // make boolean array of size equivalent to arr and it automatically intialises to false

        boolean visited []= new boolean[n1];

        for (int i = 0 ; i < arr.length ; i++){

            if (visited[i] == true)
                continue;

            // continue statment skips the remaining part of the execution

            int count = 1;

            for ( int j = i+1 ; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+"   "+count);

        }

         */


//        Arrays.sort(arr3);


//        for (int i = 0; i <arr3.length ; i++) {
//            for (int j = i+1 ; j <arr3.length; j++){
//
//                if (arr3[i] < arr3[j]) {
//                    int temp = arr3[i];
//                    arr3[i] = arr3[j];
//                    arr3[j] = temp;
//                }
//            }
//        }



//
//        int k = removeDuplicates(arr);
//        System.out.println("The array after removing duplicate elements is ");
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + " ");
//
//        }

        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }




//    static int removeDuplicates(int[] arr) {
//        int i = 0;
//        for (int j = 1; j < arr.length; j++) {
//            if (arr[i] != arr[j]) {
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//        return i + 1;
//    }


  //  static int[] arrDupli (int arr[] , int n ){
//        int arr1[]= new int[n];
//
//        boolean [] visited = new boolean[n];
//
//        for (int i = 0 ; i <arr.length ; i++){
//
//            if(visited[i]==true)
//                continue;
//
//            for (int j = i+1 ; j <arr.length; j++){
//                if (arr[i]==arr[j]){
//                    arr1[i]= arr[i];
//                    visited[j]=true;
//                }
//            }
//
//        }
//        return arr1;
//    }

//        int arr1[] = new int[n];
//        int count = 0;
//
//        boolean[] visited = new boolean[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (visited[i] == false) {
//                arr1[count] = arr[i];
//                count++;
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[i] == arr[j]) {
//                        visited[j] = true;
//                    }
//                }
//            }
//        }
//
//        for (int i = count; i < n; i++) {
//            arr1[i] = 0;
//        }
//
//        return arr1;
//    }

}

