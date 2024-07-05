package Searching.Binarysearch;
import java.util.*;

public class BS_2D_ARR {
    public static void main(String[] args) {
        // searching in an matrix

         Scanner sc = new Scanner (System.in);
         int row = sc.nextInt();
         int col = sc.nextInt();

         int arr [] [] = new int [row][col];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < row +1 ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }


    }

    // problems

    static void search (int [][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;
        return;

    }

}
