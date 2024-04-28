package twoDarray;

import java.util.Scanner;

public class Spiral_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows & cols");

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter the matrix value");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
//        System.out.println("Matrix 1");
//        printMatrix1(a);

        printsprialorder(a,r1,c1);
    }



            static void printsprialorder (int[][] matrix , int r , int c){
        int toprow = 0 , bottomrow = r-1, leftcol = 0, rightcol=c-1;

        int element =0;
        while (element < r*c ){
            // top row -> leftCol to rightCol
            for (int j = leftcol; j <=rightcol  && element <r*c; j++) {
                System.out.print(matrix[toprow][j] +" ");
                element++;
            }

            toprow++;

            // right col -> topRow to  BottomRow
            for (int i = toprow; i <=bottomrow && element <r*c ; i++) {
                System.out.print(matrix[i][rightcol]+" ");
                element++;
            }
            rightcol--;

            // bottomrow -> rightcol to leftcol

            for (int i = rightcol; i >= leftcol && element <r*c; i--)
            // decremental for loop as we are printing from left to right
            {
                System.out.print(matrix[bottomrow][i]+" ");
                element++;
            }
            bottomrow--;
            // leftCol  ->  bottomrow to toprow

            for (int i = bottomrow; i >= toprow && element <r*c; i--) {
                System.out.print(matrix[i][leftcol]+" ");
                element++;
            }
            leftcol++;

        }

    }
    static void printMatrix1 (int [] [] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] +"  ");
            }
            System.out.println();

            // for(int j=matrix[i].length-1 ; j>=0 ; j--)
            // for (int j = 0; j < matrix[i].length; j++)
        }
    }

}
