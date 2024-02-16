import java.util.Arrays;

public class prac2 {
    public static void reverse (int []a , int i , int j){
        int li = i;
        int ri = j;

        while (li<ri){
            int temp =a[li];
            a[li]=a[ri];
            a[ri]=temp;

            li++;
            ri--;

        }
    }


    public static void rotate ( int[] a,int k){

        k = k%a.length;

        if(k>0){
            k=k+a.length;
        }
        // part 1
        reverse(a,0,a.length-k-1);
        // part 2
        reverse(a,a.length-k,a.length-1);
        // part 3
        reverse(a,0,a.length-1);
    }

    // main method to test the program
    public static void main (String [] args) {
        // create an array of integers
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        // print the original array
        System.out.println ("Original array: " + Arrays.toString (arr));
        // rotate the array by 2 positions to the left
        int k = 2;
        rotate (arr, k);
        // print the rotated array
        System.out.println ("Rotated array: " + Arrays.toString (arr));
    }
}


