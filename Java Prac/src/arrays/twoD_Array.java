package arrays;
import java.util.Scanner;

public class twoD_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows & cols for matrix 1 ");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter the matrix value for matrix 1");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
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
//        printMatrix(a);
//        wavetraversal(a,r,c);


        /*

        // Important exit point of matrix

        int dir = 0;
        int i = 0;
        int j = 0;

        while (true) {
            dir = (dir + a[i][j] % 4);

            if (dir == 0) {
                // east
                j++; // colmun increase
            } else if (dir == 1) {
                // south
                i++; // row increase
            } else if (dir == 2) {
                // west
                j--;
            } else if (dir == 3) {
                // north
                i--;
            }


            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == a.length) {
                i--;
                break;
            } else if (j == a[0].length) {
                j--;
                break;
            }


        }
        System.out.println(i);
        System.out.println(j);

         */

        /*
        // Diagonal Traversal
        int n = r;

        for (int g = 0; g < a.length; g++) {
//
            for (int i = 0 , j =g ; j < a.length;i++,j++ ){
                System.out.print(a[i][j]+"  ");



                }
            }

         */

        // Saddle point in an matrix
        // minimum value in row and maximum value in column


        for (int i = 0; i < a.length; i++) {

        }
        
        }








//    static void wavetraversal(int [][] arr , int r , int c) {
//
//
//
//        for (int i = 0; i <= c-1 ; i++) {
//           if (i % 2 == 0) {
//               for (int j = 0; j <= r - 1; j++) {
//                   System.out.print(arr[j][i] +" ");
//               }
//           }   else{
//                   for (int j = r-1 ; j>=0 ;j--){
//                       System.out.print                (arr[j][i] +" ");
//                   }
//               }
//
//        }
//    }
        static void printMatrix (int [] [] matrix){
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
