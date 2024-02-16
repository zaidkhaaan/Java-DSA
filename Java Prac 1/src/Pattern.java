import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

/*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space;
        int row;

            space=n - 1;
            row =1;
            for (int i = 1; i <=n ; i++)
            {
                for (int j = 1; j <=space ; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= row ; j++) {
                    System.out.print("*\t");

                }

                space--;
                row++;
                System.out.println();
            }


 */

        /*
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int space=0;
        int row=n;

        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=space ; j++) {
                System.out.print("\t");

            }
            for (int j = 1; j <=row ; j++) {
                System.out.print("*\t");
            }

            space++;
            row--;
            System.out.println();

        }

         */
        /*
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int space = n/2;
        int row=1;
        for (int i =1; i <=n ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=row ; j++) {
                System.out.print("*\t");
            }

            if (i <= n/2){
                space--;
                row=row+2;
            }
            else {
                    space++;
                row -=2;
            }
            System.out.println();



         */


        /*

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int row = n/2+1;
        int space =1;
        for (int i = 1; i <=n ; i++) {
          //  System.out.println(st ar + "," +space+","+row);
            for (int j = 1; j <=row ; j++)
            {
                System.out.print("*\t");
            }
            for (int j = 1; j <=space ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=row ; j++) {
                System.out.print("*\t");
            }

            if (i <= n / 2){
                row--;
                space=space+2;
        }else {
                row++;
                space=space-2;

            }
            System.out.println();


         */
        /*
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int row = n+1;
        int space;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i + j == row){
                    System.out.print("*\t");

                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int row = n+1;
        int space;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i + j == row){
                    System.out.print("*\t");

                }else if (i==j){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

         */

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int outterspace = n / 2;
        int innerspace = -1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= outterspace; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int j = 1; j <= innerspace; j++){
                System.out.print("\t");
            }
            if(i > 1 && i < n){
                System.out.print("*\t");
            }

            if(i <= n / 2){
                outterspace--;
                innerspace += 2;
            } else {
                outterspace++;
                innerspace -= 2;
            }

            System.out.println();
        }

         */





        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int value =1;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(value+" ");
                value++;
            }
            System.out.println();

        }




        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a= 0;
        int b=1;


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a+"\t");
                int c =a+b;
                a=b;
                b=c;

            }
            System.out.println();

        }

         */


        /* question 13



        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();

        }

         */


        // question ,13,15


        // question 15
        /*
        {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int sp =n/2;
            int str =1;
            int row=1;
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <= sp; j++) {
                    System.out.print("\t");
                }

                int cval = row;
                for (int j = 1; j <= str; j++) {
                    System.out.print(cval+"\t");
                   if (j<=str/2){
                       cval++;
                   }else {
                       cval--;
                   }
                }

                if (i <= n / 2) {
                    sp--;
                    str += 2;
                    row++;

                } else {
                    sp++;
                    str -= 2;
                    row--;

                }

                System.out.println();
            }

         */
        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1;
        int space=2*n-3;


        for (int i = 1; i <=n ; i++) {
            int value =1;
        for (int j = 1; j <=row ; j++) {
            System.out.print(value+"\t");
            value++;

        }
            for (int j = 1; j <=space ; j++) {
                System.out.print("\t");
            }


            if (i==n){
                row--;
             //   value--; redo
            }

            for (int j = 1; j <=row ; j++) {
                value--;
                System.out.print(value+"\t");

            }
            row++;
            space-=2;
            System.out.println();
        }

         */
        //17
        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n/2;
        int row = 1;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=space ; j++) {
               // System.out.print("\t");

                if (i==n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

            for (int j = 1; j <=row ; j++) {
                System.out.print("*\t");
            }
            if (i <= n/2){
                row++;
            }else {
                row--;
            }
            System.out.println();
        }

         */

        // 18 , 19 redo

        /*  20
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if ( j==1 || j==n ){
                    System.out.print("*\t");
                } else if (i > n/2 && (i == j || i +j == n+1 )) {
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

         */

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1;
        int outspace=2;
        int value =1;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=outspace ; j++) {
                System.out.print("\t");
            }
            int cval=value;
            for (int j = 1; j <=row ; j++) {

                System.out.print(cval+"\t");

                if (j<=row/2){
                    cval=cval+1;
                }else{
                    cval=cval-1;
                }



            }

            if (i<=n/2){
                outspace--;
                row = row+2;
                value =value+1;
            }else {
                row=row-2;
                outspace++;
                value=value-1;
            }
            System.out.println();
        }


         */

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1;
        int space=2*n-3;

        for (int i = 1; i <=n ; i++) {

            int value =1;
            for (int j = 1; j <=row ; j++) {
                System.out.print(value+" ");
                value++;
            }
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            if ( i == n) //Last Row check
            {
                row--;
                value--;
            }
            for (int j = 1; j <=row ; j++) {
                value--;
                System.out.print(value+" ");
            }
            row++;
            space=space-2;

            System.out.println();

         */
        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n / 2; //variable to store space count
        int st = 1; //variable to store row count
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                if (i == n / 2 + 1) //checking middle row
                {
                    System.out.print("*	");
                } else {
                    System.out.print("	");
                }
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*	");
            }
            if (i <= n / 2) {
                st++;
            } else
            {
                st--;
                System.out.println();
            }
        }

         */

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space=0;
        int row=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <space ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=row ; j++) {
                System.out.print("*\t");
            }
            if (i<=n/2){
                space++;
                row=row-2;
            }else {
                space--;
                space=space+2;

            }
            System.out.println();
        }

         */
        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space=0;
        int row=n;

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=space ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=row; j++) {
                if(i>1 && i <= n/2 && j > 1 && j <row){
                    System.out.print("\t");
                }else {
                    System.out.print("*\t");
                }

            }

            if (i<=n/2){
                space++;
                row -=2;

            }else {
                space--;
                row +=2;
            }
            System.out.println();

        }

         */

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space=0;
        int row=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1)
                {
                    if (j == n || j <= n/2+1){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }

                } else if (i <= n / 2) {
                    if (j == n || j == n/2+1){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }

                } else if (i == n / 2 + 1) {
                    System.out.print("*\t");

                } else if (i < n) {
                    if (j == 1 || j == n/2+1){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                } else {
                    if (j == 1 || j >= n/2+1){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }

                }


            }
            System.out.println();

        }

         */
        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j==1 || j ==n){
                    System.out.print("*\t");

                } else if (i>n/2 && (i==j || i+j==n+1)) {
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }

            }
            System.out.println();

        }

         */


        /*
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        // Print the upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        // Print the lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

         */

        /*

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row =2*n-1;
        int star=1;
        int space=n-1;

        for (int i = 1; i <=row; i++) {

            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("*   ");
            }
            if(i<=row/2){
                star++;
                space--;
            }else {
                star--;
                space++;
            }
            System.out.println();
        }

         */

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int space =n-1;
        int col =1;
        int val=1;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print("\t");

            }
            for (int j = 1; j <=col ; j++) {
                System.out.print(val+"\t");

                if (j<=col/2){
                    val--;

                }else {
                    val++;
                }
            }
            space--;
            col=col+2;
         //   val++;

            System.out.println();
        }


         */

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int space =n-1;
        int col =1;
        int val=1;

        for (int i = 1; i <=2*n-1 ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print("\t");
            }

                for (int j = 1; j <= col; j++) {
                    System.out.print(val + "\t");

                    if (j <= col / 2) {
                        val--;

                    } else {
                        val++;
                    }


                    if (i <= n / 2 + 1) {
                        space--;
                        col = col + 2;

                    } else {
                        space++;
                        col = col - 2;

                    }
                    //   val++;

                    System.out.println();
                }


         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row=n;

        for (int i = 1; i <=2*n-1 ; i++) {
            for (int j = 1; j <=2*n-1 ; j++) {
             //   System.out.print(j+"\t");
            }
            System.out.println();
        }


        }

    }












