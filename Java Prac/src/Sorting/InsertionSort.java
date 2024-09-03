package Sorting;

public class InsertionSort   {
    public static void main(String[] args) {
        // we will use insertion sort algorithm

        int arr [] = {2,5,9,1,3};

        for (int i = 1; i < arr.length-1; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (isGreater(arr, j,j+1)){
                    swap(arr,j,j+1);
                }else{
                    break;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        

    }
    public static void swap ( int arr[] , int i , int j){
        System.out.println("Swapping " +arr[i] +" and "+arr[j]);

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static  boolean isGreater ( int [] arr , int j , int i){
        System.out.println("Comapring "+arr[i]+" and "+arr[j]);

        if (arr[i] < arr[j]){
            return true;
        }else{
            return false;
        }
    }
}
