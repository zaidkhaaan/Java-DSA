package arrays;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        /*

         QUES :- TO TAKE THE INPUT FOR 2D-ARRAY AND DISPLAY IT

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();



        int [] [] arr = new int[n][m]; // syntax of 2-D array


     // to take the input from user for 2-D array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // used to display the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }


         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows & cols");

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter the matrix value");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();

                /*
                 (Row , Col)

               Col(row, 0),  Col (row , 1) , Col (Row ,2)
 Row(0,Col)         0 0  ,        0 1      ,     0 2
 Row(1,Col)         1 0 ,         1 1      ,     1 2
 Row(2,Col)         2 0 ,         2 1      ,     2 2

                 */
            }
        }

//
//        System.out.println("Enter the number of rows & cols for 2nd matrix ");
//        int r2 = sc.nextInt();
//        int c2 = sc.nextInt();
//
//        int[][] a1 = new int[r2][c2];
//
//        System.out.println("Enter the matrix value");
//
//        for (int i = 0; i < r2; i++) {
//            for (int j = 0; j < c2; j++) {
//                a1[i][j] = sc.nextInt();
//            }
//        }


        System.out.println("Matrix 1");
        printMatrix(a);
//        System.out.println("Matrix 2");
//        printMatrix(a1);




       // matMUL(a,r1,c1,a1,r2,c2);


        System.out.println("Transpose Matrix");

        //Transpose(a,r1,c1);
        TransinPlace(a,r1,c1);



    }


    static void Transpose ( int [] [] a , int r1 , int c1 ) {


        // Transpose of a matrix where a row is converted into col

//        if (c1 != r1){
//            System.out.println("Wrong Matrix Input");
//        }

        int arr [] [] = new int[c1][r1];
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                arr[i][j] = a[j][i];
            }
        }
        printMatrix(arr);


    }

    static void TransinPlace (int [] [] matrix , int r , int c){

        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix [i][j] = matrix[j][i];
                matrix [j][i] =temp;
            }
        }
        printMatrix(matrix);
    }




    /*
    static   void matMUL(int [] [] a , int r1, int c1 , int [] [] a1 , int r2, int c2){
        if (c1 != r2){
            System.out.println("Wrong Matrix input please make the col of first matrix equal to row of second matrix");
        }

        int arr [] [] = new int [r1] [c2];


        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    arr[i][j] += (a[i][k] * a1[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrix");
        printMatrix(arr);

    }

     */
//        add(a,r1,c1 ,a1,r2,c2);
//
//
//
//    static void add ( int [] [] a , int r1 ,int c1 , int[][]b , int r2 , int c2){
//        if (r1 != r2 || c1 != c2){
//            System.out.println("Wrong Input - Addition not possible");
//            return;
//        }
//
//        int [] [] sum = new int[r1][c1];
//
//
//        for (int i = 0; i < r1; i++) {  // rows
//            for (int j = 0; j < c1; j++) {   // cols
//
//                sum[i][j] =a[i][j]+b[i][j];
//
//            }
//        }
//        System.out.println("sum of matrix 1 and 2");
//        printMatrix(sum);
//    }

    static void printMatrix (int [] [] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +"  ");
            }
            System.out.println();
        }
    }


}
