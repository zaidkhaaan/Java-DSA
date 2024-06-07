package Searching;

public class OrderAGnostic {

    public static void main(String[] args) {
        /*
        STEPS
        1) to find element in the hwere the order is not mentioned
        2) we will use order of agnostic approach
        3) compaare first and last element of the array
        4) if first < last array in asec order and asec approach will be used
        5) is last < first then array in desc order and desc logic will be used
         */


     //   int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
//        int [] arr = {99,80,75,22,11,10,5,2,-3};
//        int target = 22;
//        int ans = orderAgnostic(arr,target);
//        System.out.println(ans);


        int arr[] = {90,80,70,60,30,10};
        int target = 30;

        System.out.println( orderagnostic(arr,target));




    }

    static int orderagnostic( int arr[] , int target ){
           int low = 0;
           int high = arr.length-1;

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


//    static  int orderAgnostic (int [] arr, int target) {
//        int start = 0;
//        int end = arr.length -1 ;
//
//        boolean isAsc = arr[end] > arr[start];
//
//        while (start<=end){
//
//            // int mid = (start + mid) /2 will be possible it will exceed the range of index
//
//
//            int mid =start +(end-start) /2;
//
//            if (arr[mid] == target){
//                return mid;
//            }
//
//            if (isAsc){
//                if (target < arr[mid]){
//                    end = mid -1 ;
//                } else {
//                    start = mid +1;
//                }
//            } else {
//                if (target > arr [mid]){
//                    end= mid-1;
//                }else {
//                    start= mid+1;
//                }
//            }
//        }
//        return -1;
//    }
}
