package Patterns;

import java.sql.SQLOutput;
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
//     }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//
//        for (int i = 0; i < n; i++) {
//
//            // to print stars
//            int breal
//            for (int j = 0; j <(2*n)-(2*i); j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*
        // upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        //lowerhalf
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }



         */
        //upper half
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        //lower half
//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j==0 || i==n-1 || j==n-1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//
//        }

//        Pattern s = new Pattern();
//        System.out.println(s.isArmstrong(153));




//
//        int n1  = 13;
//
//        int count = 0;
//
//        int max = 0;
//
//
//        for (int i = 2; i <= n1 ; i++) {
//             max=0;
//            for (int j = 2; j <=i ; j++) {
//                if (i%j==0){
//                    max++;
//                }
//                if (max==2){
//                    count++;
//                }
//            }
//
//        }
//        System.out.println(count);



        int n1 = 13;
        int count = 0;

        for (int i = 2; i <= n1; i++) {
            int max = 0; // Reset max for each i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    max++;
                }
            }
            if (max == 2) { // Check if i has exactly two divisors
                count++;
            }
        }
        System.out.println(count);

//        int max = 0;

//
//        for (int i = 1; i < Math.sqrt(n)  ; i++) {
//            if (n%i==0){
//                System.out.println("FALSE");
//            }
//        }
//        System.out.println("TRUE");

    }
//        public boolean isArmstrong(int n) {
//            int num = n;
//            int count = 0;
//            while ( num > 0 ){
//                num = num/10;
//                count++;
//            }
//            num = n;
//            int sum = 1;
//
//            while ( num > 0){
//                int rem = num %10;
//                sum += Math.pow(rem , count);
//                num = num /10;
//            }
//
//            return (sum == n) ? true : false;
//
//        }



}
