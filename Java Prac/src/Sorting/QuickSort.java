package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int arr[]={8,5,1,3,7,2,9,6};
        quickSort(arr,0,arr.length-1);
    }


     static void quickSort(int[] arr, int lo , int hi){

        if (lo >= hi){
            return;
        }
        int pivot = arr[hi];
        int pi = parition(arr,pivot,lo,hi);
        quickSort(arr,lo,pi-1);
        quickSort(arr,pi+1,hi);
        print(arr);
    }

    static int parition(int[] arr, int pivot , int lo , int hi) {
        System.out.println("pivot --> " +pivot);
        // Quick sort algo
        //  we have to find the pivot

        int i = lo;  // 0 to j-1 ->  less than pivot area
        int j = lo;  // j to i-1 -> greater than pivot
                    // i to end -> unknown

        while (i <= hi){
            if (arr[i] <= pivot){
                swap(arr, i , j);
                i++;
                j++;
            }else{
                  i++;
            }
        }
        System.out.println("pivot index ->"+(j-1));
        return(j-1);

    }

     static void swap ( int arr[] , int i , int j){
        System.out.println("Swapping " +arr[i] +" and "+arr[j]);

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
