package Searching.Binarysearch;

public class MountainArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-in-mountain-array/description/



    }

    int search (int [] arr,int target) {

        int peak =peakIndexInmountain(arr);
        int firstTry = orderagnostic(arr,target,0,peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderagnostic(arr,target,peak +1,arr.length-1);

    }


    static int peakIndexInmountain(int [] arr){
            int start = 0;
            int  end = arr.length-1;


            while (start < end){
                int mid = start+(end-start)/2;

                if (arr[mid] > arr[mid+1] ){
                    // in the desc part of arr
                    // this may be the ans , but still look at left
                    // this why end != mid-1

                    end = mid;

                } else  {
                    // you are in asc part of array
                    // because we knoow mid +1 element > mid element

                    start = mid +1 ;

                }
                // in the end start == end and pontitng to largest element beacuse fo the two checks above
                // start and end are always trying to find max element in the above 2 chekcs
                // hence , when they are pointing to just one element , that is max one cuz that is what checks ssay
                // more elaboration at every point of tine for start and end , they have best answer til that time
                // and if we are saying that only item is remaing , hence cuz above line is best possible answer

            }
            return start;

        }
    static int orderagnostic( int arr[] , int target , int low , int high ){
        low = 0;
        high = arr.length-1;

        // we have to check whether the array is sorted or not

        boolean isAsc;

        // boolean isAsc = arr[start] <arr[end] ;

        if (arr[low] < arr[high]){
            isAsc = true;

        }else {
            isAsc = false;
        }

        if (isAsc) {

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid;

                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }else {
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid;

                } else if (arr[mid] > target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }



    }

