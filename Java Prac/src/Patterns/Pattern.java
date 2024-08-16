package Patterns;

import java.util.Scanner;



/*
STEPS  TO FOLLOW FOR ANY PATTERN

STEP 1) FIGURE OUT NO. OF LINES TO BE PRINTED (ROWS)  WRITE DOWN YOUR OUTER LOOP ON IT
STEP 2) FIGURE OUT WHAT IS HAPPENING AT EVERY LINE & TRY TO CONNECT WITH THE OUTTER LOOP
        IF POSSIBLE ,WRITE YOUR INNER LOOP ON THIS BASIS
STEP 3) EXECUTE PRINT WHEN NEEDED
STEP 4) OBSERVE THE SYMMETRY (OPTIONAL)


 */

public class Pattern {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//        for (int i = 0 ; i < n ;i++) { // 0 , 1, 2, 3,4
//            for (int j = 0  ; j < n-i-1 ; j++) {
//                System.out.print(" ");
//            } // spaces
//
//            for (int j = 0; j <=i ; j++) {
//                System.out.print("*");
//            } // left
//            for( int j = 0 ; j < i ;j++){
//                System.out.print("*");
//            }// right
//            System.out.println();
//
//        }


//            for (int i = 0 ; i < n ;i++)  // no of rows
//
//            {
//
//                for (int j = 0; j < i; j++) {
//                    System.out.print(" ");
//                }
//
//            for (int j = 0; j < n-i; j++) {
//                System.out.print("*");
//            } // left
//
//            for( int j = 0 ; j < n-i-1 ;j++){
//                System.out.print("*");
//            }// right
//            System.out.println();


        // pattern 9

        /*
        for( int i = 0 ; i < n ; i++) {

            for (int j = 0; j < n - i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for( int i = 0 ; i < n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n-i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


         */

        /*
        Pattern 10
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */


        /*
        Pattern 11
        for (int i = 0; i < n; i++) {
             int start = 0;
             if ( i % 2 == 0 ) start = 1;
            for (int j = 0; j <=i ; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }

         */


        // my solution for pattern 12
//        int j2=0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <=i; j++) {
//                j2=j2+1;
//                System.out.print(j2);
//
//            }
//            for (int j = 0; j < n-i-1 ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0 ; j <= i ; j++) {
//                System.out.print(j2);
//                j2=j2-1;
//            }
//            System.out.println();
//
//        }



        /*
        // actual solution

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);

            }
            for (int j = 0; j < (2*n)-(2*i) ; j++) {
                System.out.print(" ");
            }
            for (int j = i ; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();

        }

         */

//        int j2=0;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                j2++;
//                System.out.print(j2+" ");
//
//            }
//
//            System.out.println();
//        }

//        int ch = (int) 'A'; // 65-69
//        System.out.println(ch);


//        int n = 4;
//        int j2=65;
//        int j3=65;
//        int j4;
//        for (int i = 0; i < 4; i++) {
//
//            // left space
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//            // left pattern
//            for (int j = 0; j <= i; j++) {
//                char ch = (char) j2;
//                System.out.print(ch);
//                j2++;
//            }
//            j2 = 65;
//
//            // right pattern
//            for (int j = 0; j < i; j++) {
//                char ch = (char) j3;
//                System.out.print(ch);
//                j3--;
//            }
//
//
//            System.out.println();
//
//        }

//        for (int i = 0; i < 4; i++) {
//            for (char j ='A'; j < 'A'+i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//


        /*  striver solution
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);

                if (j <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }


            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

         */

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//
//        }


    }

}
