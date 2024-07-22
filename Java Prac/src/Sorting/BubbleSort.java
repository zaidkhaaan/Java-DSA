package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {5,9,8,1,2};
        int length = arr.length;

        /*
        gist:-  comapre every elelemt with the next element and swap it
        int the second for loop we will swap the elements till the largest element reaches it last position


         */
        for ( int i = 0 ; i <arr.length ; i++){
            for ( int j = 1 ; j < length-i /* after every iteration one element reaches its sorted position */;j++){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


        // TIME complexity discussion
        /*
        Bubble sort worst case time complexity O(n^2);
        Best case time complexity O(n)


         */

    }
}
