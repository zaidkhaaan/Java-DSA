package Searching;

import java.util.Arrays;

public class Linear_Search {


    public static void main(String[] args) {

//        int arr [] [] ={
//
//                {23,4,1},
//                {18,12,3,9},
//                {78,99,34,56}
//
//        };

//        int target = 34;
//
//        int [] ans = search(arr,target);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(max(arr));
//        System.out.println(min(arr));

        //   System.out.println(search(arr,target));
        //   int target = -2;

        //   System.out.println(linearsearch2(arr,target));





        /*

        int nums [] ={12,345,2,6,7896};
     //   int a ;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];

            while (a>0){
                int temp = a%10;
                a =a/10;
                count++;
            }


            if (count % 2==0){
                System.out.println(nums[i] +"  Even digit");
            }else {
                System.out.println(nums[i] + " Odd digit");
            }
            count=0;
        }
        return;

    }

         */
        int nums [] ={12,345,2,6,7896,13,14,15};
        System.out.println(findNum(nums));


    }

    static int findNum(int [] nums ){
        int count = 0;
        for (int num: nums
             ) {
            if (even(num)){
                count++;
            }

        }
        return count;
    }
    static boolean even (int num){
        int noofdigits = digits(num);
        if (noofdigits % 2 ==0){
            return true;
        }
        return false;
    }

    static int digits (int num){

        if (num < 0 ){
            num = num *-1;
        }
        int count = 0;

        if (num == 0){
            return 1;
        }

        while (num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
    /*

    function to search the array
    static int []  search (int [][] arr, int target){


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row , col};
                }
            }

        }
        return new int []{-1,-1};

    }

     */

    /*
    static int  max (int [][] arr){

        int max = Integer.MIN_VALUE;

        for (int [] ints :arr) {
            for (int element: ints) {
                if (element > max){
                    max = element;
                }
            }
        }
        return max;
    }


    static int  min (int [][] arr){

        int min = Integer.MAX_VALUE;

        for (int [] ints :arr) {
            for (int element: ints) {
                if (element  < min){
                    min = element;
                }
            }
        }
        return min;
    }

     */

    // search the target and return the value

   /*
    static int linearsearch (int arr [] , int target ){

        if (arr.length ==0 ){
            return -1;
        }

       // int element = target;

        for (int index = 0; index < arr.length; index++) {

            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1 ;
    }



    */

    // search the target and return the element

    /*
    static int linearsearch2 (int arr [] , int target ){

        if (arr.length ==0 ){
            return -1;
        }

        // int element = target;

        for (int element :arr){
           // int element = arr[index];
            if(element == target){
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }

     */

    // return boolean value of for linear search

    /*
    static boolean linearsearch3 (int arr [] , int target ){

        if (arr.length ==0 ){
            return false;
        }

        // int element = target;

        for (int element :arr){
            // int element = arr[index];
            if(element == target){
                return true;
            }
        }

        return false;
    }

     */


}
