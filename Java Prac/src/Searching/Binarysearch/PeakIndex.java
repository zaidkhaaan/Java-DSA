package Searching.Binarysearch;

public class PeakIndex {
    public static void main(String[] args) {
        //852
        int arr[] = {1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInmountain(arr));


    }

//    public int peakindex(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start<  end){
//
//        }
//    }

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
}
