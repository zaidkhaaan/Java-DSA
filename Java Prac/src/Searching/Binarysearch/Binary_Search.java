package Searching.Binarysearch;

public class Binary_Search {

    public static void main(String[] args) {



        /*


***************************BINARY SEARCH IN  SORTED ARRAY***************************************


        int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int ans = binarysearch(arr,22);
        System.out.println(ans);


    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;


        while (start <= end){
 //           int mid = (start + end) / 2; Might be possible that (start + end ) exceeds in java
            int mid = start + (end - start) / 2;


            if (target < arr[mid]){
                end = mid -1 ;
            } else if ( target > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;

         */

        /*
         ******************** Binary Search using descn array  ******************************************
         */





        /*
        int arr [] = {90, 75,18,12,6,4,3,1};
        int target = 75;
        int ans = binarysearch(arr,target);
        System.out.println(ans);



    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            //           int mid = (start + end) / 2; Might be possible that (start + end ) exceeds in java
            int mid = start + (end - start) / 2;


            if (target < arr[mid]) {
                start = mid + 1;
                // Logic changes  here
            } else if (target > arr[mid]) {
                end = mid - 1;
                // logic changes here
            } else {
                return mid;
            }
        }
        return -1;
    }


         */

// ************************************ Ceiling of the number **********************************************************
        int arr[] = {2, 3, 5, 9, 14, 18};
        int target = 16;

        System.out.println(bsrev(arr,target));

        // ceiling is the smallest element in array greater or = target
    }

    static int bsrev ( int arr[] , int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start+(end-start)/2;

            if (arr[mid] == target ){
                return mid;
            } else if (arr[mid] > target) {
                end=mid-1;

            } else if (arr[mid] < target ) {
                start=mid+1;
            }
        }
        return arr[end];


    }







}