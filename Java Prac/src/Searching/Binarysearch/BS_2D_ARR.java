package Searching.Binarysearch;
import java.util.*;

public class BS_2D_ARR {
    public static void main(String[] args) {
        // searching in an matrix


        /*
         Scanner sc = new Scanner (System.in);
         int row = sc.nextInt();
         int col = sc.nextInt();

         int arr [] [] = new int [row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element you want to search");
        int target = sc.nextInt();

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
//        linearsearch(arr,target,row,col);


         */


        // BS using row & col sorted manner
//        int[][] arr1 = {
//                {10, 20, 30, 40},
//                {15, 25, 30, 45},
//                {28, 29, 37, 49},
//                {33, 34, 38, 50},
//        };
//        System.out.println(Arrays.toString(bssearch(arr1, 49)));


        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        System.out.println(Arrays.toString(search(arr,9)));


    }

    // problems


    //    search in 2d array using linear search
//    static void linearsearch (int [][] matrix, int target , int r, int c){
////        int r = 0;
////        int c = matrix.length-1;
//
//        // time complexity with linear search == O(N*N)
//
//
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                if (matrix[i][j] == target){
//                    System.out.println("Element found at position :- "+i+" "+j);
//                }
//            }
//        }
    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; // matrix might be empty

        // used if only one row is thier
        if (rows == 1) {
            return simpleBS(matrix, 0, 0, cols - 1, target);
        }
        int rstart = 0;
        int rend = rows - 1;
        int cMid = cols / 2;

        // run loop till 2 row are remaining
        while (rstart < (rend - 1))
        // if this is true it will have rows more than 2
        {
            int mid = rstart + (rend - rstart) / 2;

            if (matrix[mid][cMid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows


        if (matrix[rstart][cMid] == target) {
            return new int[]{rstart, cMid};
        }
        if (matrix[rstart + 1][cMid] == target) {
            return new int[]{rstart + 1, cMid};
        }


        // search in 1st half
        if (target <= matrix[rstart][cMid - 1]) {
            return simpleBS(matrix, rstart, 0, cMid - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rstart][cMid + 1] && target <= matrix[rstart][cols - 1]) {
            return simpleBS(matrix, rstart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rstart + 1][cMid - 1]) {

            return simpleBS(matrix, rstart + 1, 0, cMid - 1, target);

        } else {
            return simpleBS(matrix, rstart + 1, cMid + 1, cols - 1, target);
        }
        // search in 4th half
//        if ( target >= matrix[rstart][cMid-1] ){
//
//        }else{

    }





    static int[] simpleBS(int [][] matrix , int row , int colstart , int colend, int target){
        while (colstart <= colend){
            int mid = colstart +(colend-colstart)/2;

            if ( matrix[row][mid] == target){
                return new int[]{row , mid};
            }
            if(matrix[row][mid] < target){
                colstart =mid+1;
            }else{
                colend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }


    static int[] bssearch(int[][] matrix , int target){
        int row = 0; // starts with 0 col ---> matrix.length
        int col = matrix.length-1; // col strats with col-1 --->0


        while(row < matrix.length &&  col >= 0){
            if (matrix[row][col] == target){
                return new int[]{row,col};
            }
            if (matrix[row][col]<target ){
                row++;
            } else{
                col--;
            }

        }
        return new int [] {-1,-1};


    }

}
