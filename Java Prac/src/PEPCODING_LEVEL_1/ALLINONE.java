package PEPCODING_LEVEL_1;

import java.util.Scanner;

public class ALLINONE {
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 0){
            System.out.println("ZERO");
        } else {
            String result = a > 0 ? "The number is positive ":"The number is negative";
            System.out.println(result);
        }

         */

        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();

//        if (a % 2 == 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }

//        String result = a % 2 == 0 ? "Even" : "Odd";
//        System.out.println(result);

//        if (iseven(a)) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }


//         int sum = 0;
//        for (int i = 1; i <= a ; i++) {
//             sum += i;
//        }
//        System.out.println(sum);
//
//        System.out.println(a*(a+1)/2);


//        int sum = 0;
//        for (int i = a; i <=b ; i++) {
//            sum += i;
//        }

//        int sum = b*(b+1)/2 - a*(a+1)/2 + a;
//
//        System.out.println(sum);


        //      int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c =sc.nextInt();


//        if (a > b)
//        {
//            System.out.println(a+" is greater than b "+b);
//        } else {
//            System.out.println(b+" is greater than a "+a);
//        }

//
//        System.out.println(Math.max(a,b));

//        if (a >= b && a >= c){
//            System.out.println(a+" is greatest");
//        }else if (b >= a && b >= c){
//            System.out.println(b+ " is greatest");
//        } else if (c >= a && c >=b) {
//            System.out.println(c +" is greatest");
//        }



        /*
        if ((a >= b) && (a >= c))  System.out.println (a + " is the greatest");

            //checking if num2 is greatest
        else if (b >= a && b >= c)  System.out.println (b + " is the greatest");

            // num3 has to be greatest then if not above
        else System.out.println (c + " is the greatest");

         */

//        int temp , result;
//
//        temp = a > b ? a:b ;
//        result = temp > c ? temp:c ;
//
//        System.out.println(result);


//

        /*
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
    System.out.println("Leap Year");
} else {
    System.out.println("Not Leap Year");
}

         */


//        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
//            System.out.println("Leap Year");
//        }else{
//            System.out.println("Not Leap Year");
//        }


        //  int sum;
//


//        Scanner sc = new Scanner (System.in);
        //       String num = sc.nextLine();
//        String num ="9876543219876543219876";

        //   System.out.println("Sum of digits :"+getSum(num) );

//


//        String s = sc.nextLine();
//       s= s.toLowerCase();
//        String reversed = new StringBuilder(s).reverse().toString();
//        boolean  c = reversed.equals(s);
//        System.out.println(c);



        /*

        ARMSTRONG NUMBER
        int a = sc.nextInt();
        int b = a ;
        int c = a;
        int count = 0;
        while (a>0){
            a = a/10;
            count++;
        }
        int sum=0;
        while (b>0){
            int temp  = b%10;
            sum += Math.pow(temp,count);
            b=b/10;

        }
        if (sum == c){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armstrong");
        }

         */

//
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//
//        System.out.print(a+","+ b);
//
//        for (int i = 2; i <n ; i++) {
//
//            int nextterm = a+b;
//            a=b;
//            b=nextterm;
//
//            System.out.print(","+nextterm+"");
//
//        }

//        int n = sc.nextInt();
//
//        int fact=1;
//        for (int i = 1; i <= n ; i++) {
//            fact *= i;
//        }
//        System.out.println(fact);

//        int n = sc.nextInt();
//        int n1 = sc.nextInt();

//        int temp = 1;
//
//        for (int i = 1; i <=n1 ; i++) {
//            temp= temp*2;
//        }
//
//        System.out.println(temp);


//        int n2 =(int) Math.pow(n,n1);
//        System.out.println(n2);

//        double base1 = 1.5;
//        double expo1 = 2.5;
//
//        double expo2 = -2.5;
//
//        double res= Math.pow(base1,expo1);
//        double res1 =Math.pow(base1,expo2);
//        System.out.print(res +"  "+ res1);


        //       int n = 10;

//        for (int i = 1; i <=10 ; i++) {
//            if (n% i ==0){
//                System.out.println(i);
//            }
//        }




        /*

        STRONG NUMBER
        int n = 145;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += getFact(digit);
            n /= 10;
        }

        System.out.println("Sum of factorials of digits: " + sum);
    }

    static int getFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

         */

//        int n = 6;
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);


//

//        int n = 4991;
//
//        int temp =n;
//
//        int sum =0;
//        while (temp > 0){
//             temp= temp%10;
//             sum += temp;
//             temp=temp/10;
//        }
//
//        if (n %  sum==0){
//            System.out.println("Harshad Number");
//        }else {
//            System.out.println("NOT");
//        }


//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <n ; i++) {
//            if (n % 1 == 0){
//                sum+=i;
//            }
//        }
//
//        if (sum>n){
//            System.out.println("abundant number");
//            System.out.println("The abundace is "+(sum-n));
//        }

        int n1= sc.nextInt();
        int n2 = sc.nextInt();

        int on1 = n1;
        int on2 = n2;

        while (n1 %  n2 != 0){
            int rem = n1%n2;
            n1=n2;
            n2 = rem;

        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd ;
        System.out.println(gcd +"  "+lcm);


    }
}

//    static int getdigit (int n ){
//        int temp = n;
//
//        while (temp > 0 ){
//            temp %=10;
//            getfact(temp);
//        }
//        return  0 ;
//    }
//
//    static int getfact(int n ){
//        int temp = getdigit(n);
//
//        for (int i = 1; i <temp ; i++) {
//            temp *=i;
//        }
//        return temp;
//
//    }


    /*
    static int getSum(String num)
    {
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum = sum+num.charAt(i) - 48;
        }
        return sum;
    }


     */




        /*
        static boolean iseven (int number)


            return (number & 1) == 0 ;
            /*
            For even numbers, the least significant bit is 0, so the result of the operation number & 1 will be 0.
            For odd numbers, the least significant bit is 1, so the result will be 1.
            Therefore, (number & 1) == 0 will return true for even numbers and false for odd numbers.
            This makes the code more efficient as bitwise operations are faster
             */






