package PEPCODING_LEVEL_1;

import java.util.Arrays;
import java.util.Scanner;

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

//        int arr[] = {1,1,2,2,2,3,3};
//        int k = removeDuplicates(arr);
//        System.out.println("The array after removing duplicate elements is ");
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + " ");
//        }


        // Remove Duplicates From an Unsorted Array

//        int arr[] = {2,3,1,9,3,1,3,9};
//
//        int k = removeDuplicate(arr);
//        System.out.println("After removal of  duplicate elements");
//
//        for ( int i = 0 ; i < k ; i++){
//            System.out.print(arr[i]+"  ");
//        }


//    static int removeDuplicate (int[] arr){
//        int i = 0;
//
//        for (int j = 1; j <arr.length ; j++) {
//
//            if (arr[i] != arr[j]){
//                i++;
//                arr[i]=arr[j];
//
//            }
//        }
//
//        return i+1;


//        int arr[] = {2,3,1,9,3,1,3,9};
//        int n = arr.length;
//        duplicate(arr, n);


//        int[] arr = {2, 3, 1, 9, 3, 1, 3, 9, 1, 2, 3, 10, 10, 11};
//        int n = arr.length;
//        n = removeDuplicates(arr, n);
//
//        // Print updated array
//        for (int i=0; i<n; i++)
//            System.out.print(arr[i]+" ");c

//        int k = removeDuplicates(arr, arr.length);
//        System.out.println("After removal of  duplicate elements");
//
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + "  ");
//        }


//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to insert & position to :");
//        int n = sc.nextInt() ;
//        int pos = sc.nextInt();

//        resize(arr,n );

//        int n = 8 ;

//        int value = 40;
//        int pos = 5;

//        insertatbegin(arr, n, value);
//        printarray(arr);
//        insertatEnd(arr,n,value);
//        printarray(arr);

//        insertatposition(arr, n,value,pos);
//        printarray(arr);

//        int arr[] = new int [];
//


//         int n =arr.length;
//       repeatelements(arr, n);
//        printRepeating(arr);
//        Arrays.fill(arr,1);
//        printarray(arr);


//        int nums[] = { 9,6,4,2,3,5,7,0,1};
//         int k = missingNumber(nums);
//        System.out.println(k);



        int arr [] = {0,1,0,3,12};

        moveZeroes(arr);


    }


//    1st approach

//   static void moveZeroes(int[] nums) {
//         int snowBallSize = 0;
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]==0){
//                snowBallSize++;
//            }
//            else if (snowBallSize > 0) {
//                int t = nums[i];
//                nums[i]=0;
//                nums[i-snowBallSize]=t;
//            }
//        }
//    }


    // 2nd approach

    static void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }


//    static void moveZeroes(int[] nums) {
//        if (nums.length == 1) {
//            return;
//        }
//
//        int nonZeroIndex = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[nonZeroIndex] = nums[i];
//                nonZeroIndex++;
//            }
//        }
//
//
//        while(nonZeroIndex<nums.length){
//            nums[nonZeroIndex] = 0;
//            nonZeroIndex++;
//        }
//    }


//    static void moveZeroes(int[] nums) {
//
//        int j = 1;
//
//        for ( int i = 0 ; i < nums.length ; ){
//
//            if (nums[i]==0 && nums[j] != 0){
//                int temp = nums[i];
//                nums [i]= nums[j];
//                nums[j] = temp;
//
//                j++;
//                i++;
//
//            }else{
//                j++;
//            }
//
//            if (nums[i] != 0 ){
//                i++;
//            }
//
//        }

    }

//    static int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//
//        // Case 1
//        // if all no missing number
//        if (nums[0] != 0) return 0;
//
//        // Case 2
//        // if x number is not equal to arr.length
//        if (nums[n - 1] != n) return n;
//
//        // Case 3
//        // replace it with arr.index
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != i) return i;
//        }
//
//        return 0;
//    }

//    static int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//
//        // Case 1
//        if (nums[0] != 0) return 0;
//
//        // Case 2
//        if (nums[n - 1] != n) return n;
//
//        // Case 3
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != i) return i;
//        }
//
//        return 0;
//    }


//    static int removeDuplicates(int[] nums) {
//        int i = 0;
//        int k = 1;
//
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[i] != nums[j]) {
//                i++;
//                nums[i] = nums[j];
//                k++;
//
//
//            }
//        }
//        return k;
//    }
//static int missingNumber(int[] nums) {
//    int n = nums.length;
//    int ans = 0;
//
//    // first ietrating over every element and X-OR it with every element
//    for (int i = 1; i <= n; i++) {
//        ans = ans ^ i;
//    }
//
//    // second iteration over every element with ans which will be zero this time with index value
//    for (int i = 0; i < nums.length; i++) {
//        ans = ans ^ nums[i];
//    }
//    return ans;
//}



//    static int[] twoSum(int[] nums, int target) {
////        Arrays.sort(nums);
//        int j = 0;
//        for(int i = 0; i <  nums.length   ;  i++){
//            {
//                if (nums[i] + nums[j+1] == target){
//                    j++;
//                    return new int [] {i,i+1};
//                }
//            }
//        }
//        return null;
//
//    }

//    static int repeatelements(int arr[], int n) {
//
////        boolean[] ans = new boolean[n];
//
//
////        for (int i = 0; i < arr.length; i++) {
////            if (ans[i] = true)
////                continue;
//        Arrays.sort(arr);
//        int i = 0;
//
//
//        for (int j = 1; j < arr.length; j++) {
//
//            if (arr[i] == arr[j]) {
//                arr[j] = arr[j + 1];
//                i++;
//            }
//        }
//        return i + 1;
//    }

//

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//               if (arr[i]!=arr[j]){
//                   System.out.print(arr[i]+"  ");
//               }
//            }
//        }

//
//    }
//
//        static void printRepeating( int[] arr){
//            // First sort the array so duplicate elements become neighbors
//            Arrays.sort(arr);
//
//            for (int i = 1; i < arr.length; i++) {
//                // If current element is the same as the previous
//                if (arr[i] == arr[i - 1]) {
//                    // Print the element
//                    System.out.print(arr[i] + " ");
//                    // Skip over all duplicates of this element
//                    while (i < arr.length && arr[i] == arr[i - 1]) {
//                        i++;
//                    }
//                }
//            }
//        }

//        static void duplicate ( int arr[], int n ){
//            int mark[] = new int[n];
//
//            for (int i = 0; i < arr.length; i++) {
//                mark[i] = 1;
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                if (mark[i] == 1) {
//                    for (int j = i + 1; j < arr.length; j++) {
//                        if (arr[i] == arr[j]) {
//                            mark[j] = 0;
//                        }
//                    }
//                }
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                if (mark[i] == 1) {
//                    System.out.print(arr[i] + "  ");
//                }
//            }
//        }
//
//
//        static void printarray ( int arr[]){
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}
//
//    static void insertatbegin( int arr[] , int n , int value){
//        for (int i = n-1 ; i>=0 ; i--){
//            arr[i+1]=arr[i];
//        }
//        arr[0]=value;
//    }
//
//    static void insertatEnd(int[] arr, int n, int value)
//    {
//        arr[n] = value;
//    }
//
//    static void insertatposition(int[] arr, int n, int value, int pos)
//    {
//        for (int i = n; i >= pos; i--)
//        {
//            arr[i] = arr[i - 1];
//        }
//        arr[pos - 1] = value;
//    }


//    static void resize(int arr[] , int n ){
//
//    int arr1[] = new int [arr.length+1];
//        arr1[arr1.length-1]=n;
//        for (int i = 0; i < arr.length ; i++) {
//            arr1[i]=arr[i];
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]+" ");
//        }
//
//    }


//    static int removeDuplicate(int[] arr) {
//        int i = 0;
//        Arrays.sort(arr);
//
//        for (int j = 1; j < arr.length; j++) {
//
//            if (arr[i] != arr[j]) {
//                i++;
//                arr[i] = arr[j];
//
//            }
//        }
//
//        return i + 1;
//    }


//    static int removeDuplicates(int[] arr, int n) {
//        if (n == 0 || n == 1)
//            return n;
//
//        // Sort the array
//        Arrays.sort(arr);
//
//        int j = 0;
//
//        // Start traversing the sorted array
//        for (int i = 0; i < n - 1; i++)
//            // If current element is not equal to next element, then store that current element
//            if (arr[i] != arr[i + 1])
//                arr[j++] = arr[i];
//
//        // Store the last element as whether it is unique or repeated, it hasn't been stored yet
//        arr[j++] = arr[n - 1];
//
//        return j;
//    }
//}


//    static void duplicate(int arr[], int n) {
//
//        int mark[] = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            mark[i] = 1;
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (mark[i] == 1) {
//                for (int j = i + 1; j < n; j++) {
//                    if (arr[i] == arr[j]) {
//                        mark[j] = 0;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (mark[i] == 1) {
//                System.out.print(arr[i] + ",");
//            }
//        }
//    }







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



