import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
   /*  Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Your first number is "+num1);
        int num2 = sc.nextInt();
        System.out.println("Your second number is "+num2);

        int sum = num1 + num2 ;
        System.out.println( "The sum of two numbers is == " +sum);

        System.out.println(args[0]);
*/

    /*
        Scanner sc =new Scanner(System.in);
        int s1= sc.nextInt();
        System.out.println("Your salary is "+s1);

        if (s1>10000){
            s1=s1+2000;

        }else {
            s1 = s1+1000;

        }
        System.out.println("Your new salary is "+s1);
*/
      /*  Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count>10){
            System.out.println("While Loop running");
        }
        System.out.println("No loop "); */
  /*
        for (int num = 1; num <= 10; num+=2){
            System.out.println(num);
        }
/*

   */

      /*  Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 0; num <n ; num++) {
            System.out.println("Hello World");
        }
*/


       /* AlphabetCase
       Scanner in = new Scanner (System.in);
       char ch = in.next().trim().charAt(0);

       if (ch>='a' && ch <='z'){
           System.out.println("Lowercase");
       }
       else {
           System.out.println("Uppercase");
       }

        */

        /*  fibonacci
           Scanner in= new Scanner(System.in);
           int n = in.nextInt();

           int a =0;
           int b =1;
           int count =2;


           while (count <= n){
               int temp =b;
               b=b+a;
               a=temp;
               count++;

           }
        System.out.println(b);

         */

        /*  reverse
        int n =5555;

        int count = 0;

        while (n>0){
            int rem = n %10;
            if (rem==5){
                count++;
            }
            n=n/10;

        }

         */

        /* reverse number

        int num = 123456;

        int ans = 0;

        while (num>0){
            int rem = num % 10;
            num=num/10;

            ans=ans*10+rem;
        }

         */
//int ans = sum();
        //       System.out.println("Your addition of two numbers is == "+ans);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);

    }

    static String myGreet(String name) {
        String message = "Hello"+ name;
        return message;
    }

}



    /*
    static int sum() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Number 1 == ");

    int num1= in.nextInt();
    System.out.println("Enter Number 2 == ");
    int num2= in.nextInt();;

    int sum=num1 + num2;
    return sum;

     */



