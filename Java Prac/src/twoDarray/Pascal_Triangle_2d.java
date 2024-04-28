package twoDarray;

import java.util.Scanner;

public class Pascal_Triangle_2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int ans [] [] = pascal(n);
        printMatrix1(ans);
    }


    static int[] [] pascal(int n){
        int [] [] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            // ith row has i +1 columns
            /*
              ans[0] = new int [1];
              ans [1] = new int[2];

             */
            ans[i] = new int[i+1];

            // first & last element of every row is 1

            ans[i][0] = ans[i][i] =1;

            for (int j = 1; j < i ; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans;
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
