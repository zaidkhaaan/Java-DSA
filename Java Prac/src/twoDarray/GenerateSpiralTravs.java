package twoDarray;

import java.util.Scanner;

public class GenerateSpiralTravs {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int [] [] matrix = printsprialorder(n);
        printMatrix1(matrix);

    }

    static int[] [] printsprialorder (int n){

        int [] [] matrix = new int[n][n];


        int toprow = 0 , bottomrow = n-1, leftcol = 0, rightcol=n-1;
        int curr = 1;



        while (curr < n*n ){
            // top row -> leftCol to rightCol
            for (int j = leftcol; j <=rightcol  && curr <= n*n; j++) {
                matrix[toprow][j] = curr;
                curr++;
            }

            toprow++;

            // right col -> topRow to  BottomRow
            for (int i = toprow; i <=bottomrow && curr <=n*n ; i++) {
                matrix[i][rightcol] = curr++;

            }
            rightcol--;

            // bottomrow -> rightcol to leftcol

            for (int i = rightcol; i >= leftcol && curr <=n*n; i--)
            // decremental for loop as we are printing from left to right
            {
               matrix[bottomrow][i]=curr;
                curr++;
            }
            bottomrow--;
            // leftCol  ->  bottomrow to toprow

            for (int i = bottomrow; i >= toprow && curr <=n*n; i--) {
               matrix[i][leftcol]=curr;
                curr++;
            }
            leftcol++;

        }
        return matrix;

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
