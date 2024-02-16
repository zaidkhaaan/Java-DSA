import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);

        //  int n = sc.nextInt();
        //  int sum =0;
        // while (n>0) {
        //   sum += n % 10;
        // n /=10;

        //}
        //System.out.println("sum" +sum);


        //     String str ="ab cd";

        //     for (int i=0; i<=str.length()-1;i++)
        //       System.out.print(str.charAt(i)+ " ");

//    Scanner s = new Scanner(System.in);
        //       System.out.println("enter a positive integer n:");
        //      int n= s.nextInt();

        //      int result = 0;
        //      int v1=1;
        //     int v2=1;

        //     for (int i=1 ;i<= n-2;i++){
        //         result = v1 + v2;
        //         v1 = v2;
        //        v2 = result;
        //      }
        //      System.out.println("result =  " + (result == 0 ? 1 :result ));

        //      Scanner s = new Scanner(System.in);
        //      String a= s.next();
        //     String reverse="";

        //    for (int i =a.length()-1; i >= 0; i--)
        //   //     System.out.print(a.charAt(i));
        //   reverse += a.charAt(i);
        //   System.out.println(reverse);

        //   Scanner s = new Scanner(System.in);
        //   String a= s.next();

        //   boolean isPalindrome= true;

        //   for (int i=0 ,j=a.length()-1;i<j;i++,j--){

        //       if (a.charAt(i)==a.charAt(j))
        //            continue;

        //       isPalindrome =false;
        //        break;

        //      }
        //      System.out.println(isPalindrome ? "palindrome":"not palindrome");

        //       Scanner s = new Scanner(System.in);
        //       int n = s.nextInt();

        //       for (int i =1;i<=n;i++) {
        //           for (int j =1;j<=i;j++)
//                System.out.print(i);


        //       System.out.println();

        //      Scanner s = new Scanner(System.in);
        //       int n = s.nextInt();

        //      for (int i =1;i <= n;i++)
        //      {
        //           for (int j=1;j <=n - i; j++)
        //               System.out.print(" ");

        //           for (int j = 1; j <= i - 1; j++)
        //               System.out.print("*");

        //           System.out.println();

        //       Scanner s = new Scanner(System.in);
        //      int n = s.nextInt();

        //     for (int i =1;i <= n;i++)
        //   {
        //           for (int j=1;j <=n - i; j++)
        //               System.out.print(" ");
//
        //           for (int j = 1; j <= 2*i - 1; j++)
//                System.out.print("*");

        //           System.out.println();


//            Scanner s = new Scanner(System.in);
        //           int n = s.nextInt();

        //           for (int i =1;i <= n;i++) {

        //               for (int j=1;j <=n - i; j++)
        //                   System.out.print(" ");

//                for (int j = 1; j <= 2*i - 1; j++)
//                    if (i == n)
        //                      System.out.print("*");
//                    else
//                        if (j == 1 || j == 2*i - 1)
//                            System.out.print(" ");
        //                       else
//                            System.out.print(" ");

        //               System.out.println();
        //           }


//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();

//        for (int i =1;i <= n;i++) {
//            for (int j = 1; j <= n ; j++)
        //               System.out.print("*");


//            System.out.println();
        //       }

      //  pattern1(4);
        pattern2(5);

    }


    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();


        }

    }
    static void pattern2(int n) {
        for (int row = 1; row < 2 *n  ; row++)
         {
             int c = row > n ?2*n-row :row;
            for (int col = 1; col < c; col++)
            {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}



