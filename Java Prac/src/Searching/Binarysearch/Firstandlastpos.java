package Searching.Binarysearch;

import java.util.Arrays;

public class Firstandlastpos {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
//        System.out.println(Arrays.toString(searchRange(arr,target)));



    }

//    static int[] searchRange(int[] nums, int target) {
//        int[] result = {-1, -1};
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                result[0] = i;
//                break;
//            }
//        }
//        if (result[0] == -1) {
//            return result;
//        }
//        for (int i = nums.length - 1; i >= 0; i--) {
//            if (nums[i] == target) {
//                result[1] = i;
//                break;
//            }
//        }
//        return result;
//    }

    static int[] searchRange ( int nums[] , int target){
        int ans [] = {-1,-1};
        // check for first occurence if target first

        int start = 0;
        int end = nums.length-1;


        while (start <= end){
            int mid = start+(end-start)/2;

             if (nums[mid] > target) {
                end=mid-1;

            } else if (nums[mid] < target ) {
                start=mid+1;
            }
        }
        return ans;

    }
}
