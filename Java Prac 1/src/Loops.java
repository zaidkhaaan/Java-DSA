import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Scanner sc= new Scanner(System.in);
        String str= sc.next();

        boolean isPalindrome = true;
        for (int i =0 ,j=str.length()-1;i<j ; i++ ,j--) {
            if (str.charAt(i)==str.charAt(j))
                continue;
            isPalindrome=false;
            break;


        }
        System.out.println(isPalindrome ? "palindrome":"not palindrome");
        }

         */
        /*
        Scanner sc = new Scanner(System.in);

        //System.out.print("Enter first number :");
        int n = sc.nextInt();
       // System.out.print("Enter second number :");
        int b = sc.nextInt();
       // System.out.print("Enter third number :");
        int c = sc.nextInt();


       int max=n;

       if (b>max){
           max=b;
       }
       if (c>max){
           max=c;
       }
        System.out.println("The maximum number is : "+max);

         */

        // Program for Case Check

        /*
        Scanner in = new Scanner(System.in);
        char ch =in.next().trim().charAt(0);

        if (ch>='n' && ch<='z'){
            System.out.println("LOWER CASE");
        }else {
            System.out.println("UPPER CASE");
        }

         */

         /* fibo neso academy


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n positive number ");
        int n=sc.nextInt();

        int result=0;
        int v1=0;
        int v2=1;
        for (int i = 1; i <=n-2 ; i++)
        {
            result =v1+v2;
            v1=v2;
            v2=result;
        }
        System.out.println("result = "+result);


          */
        /*

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n positive index to get the fibonnaci series  :");
        int n=sc.nextInt();
        int n=0;
        int b=1;
        int count =2;


        while (count <= n){
            int max =b;
            b=b+n;
            n=max;
            count++;
        }
        System.out.println("Your Fibonacci Number for the " +n+ " index == " +i);


         */

        /* problem to reverse n number

        int n = 987654321;
        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            //ans=rem;
            ans=ans+rem;



        }
        System.out.println(ans);

         */



        /* program to add digits of an integrs
        int n = 987654321;
        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            //ans=rem;
            ans=ans*10+rem;



        }
        System.out.println(ans);

         */




        /*
        int n=2;
        int i=1;
        while (i<=10){
            int c=n*i;
            System.out.println(n + " X " + i + " = " + c);
            i++;
        }

         */

        /* ANY TABLE USING NO

        Scanner sc = new Scanner(System.in);
        System.out.print("which number of  multiplication do you want ==");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int c = number * i;
            System.out.println(number + " X " + i + " = " + c);

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("which number of  factorial do you want ==");
        int number = sc.nextInt();
        int c=1;

        for (int i =1; i <=number; i++) {
             c = c*i;



        }
        System.out.print(c);

         */


        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base=");
        int base = sc.nextInt();

        System.out.print("Enter exponent=");
        int power = sc.nextInt();

        int result =1;

        for (int i = 1; i <=power ; i++) {
            result=result*base;

        }
        System.out.println(result);

         */

/*
        Scanner sc = new Scanner(System.in);
        int c= sc.nextInt();
        int ans =0;


        while (c>0){
           int r=c%10;
            c=c/10;
            ans=ans*10+r;

        }
        System.out.println(ans);

 */



 /*
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       // int n = 987654321;
        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            //ans=rem;
            ans=ans*10+rem;

        }
        System.out.println(ans);

  */

        /*
        Scanner sc=new Scanner(System.in);

        int evensum=0;
        int oddsum=0;
        char choice;
        do {
            System.out.println("Enter the Number");
            int number =sc.nextInt();
            if(number %2==0)
            {
                evensum=evensum+number;

            }
            else
            {
                oddsum=oddsum+number;
            }
            System.out.println(" Do you want to continue y/n");
             choice=sc.next().charAt(0);

        }while (choice=='y'|| choice=='Y');
        System.out.println("Sum of even numbers"+evensum);
        System.out.println("Sum of odd numbers"+oddsum);

         */


        // HCF of Two given number.

        /*
        Scanner s = new Scanner(System.in);
        int max=0;
        int min=0;
        int num1= s.nextInt();
        int num2 = s.nextInt();

        char choice;
        do {


            if(num1>max) {
                max = num1;
            }
            if (num2>min){
                min=num2;

            }
            System.out.print("Do you want to continue y/n? ");
            choice = s.next().charAt(0);
            }while(choice=='y' || choice == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);

         */


        /*

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int count = 0;
            for (int div = 2; div*div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(" Prime");
            } else {
                System.out.println("Not prime");
            }
        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                count++;
                break;

            }
        }
            if (count == 0) {
                System.out.println(i);
            }
        }

         */

        /*
         How to fiboannci
         Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int v1=0;
        int v2=1;

        for (int i = 1; i <=n ; i++)
        {
            System.out.println(v1);
            int result =v1+v2;
            v1=v2;
            v2=result;
        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum =0;
        int reverse=0;

        int count=0;
        while(a != 0)
        {
            sum += a%10;
            reverse=sum*10;
           // a=a/10;
           count++;


        }
        System.out.println(reverse);

         */

/*
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int nod = 0;
        int temp =n;
        while(temp !=0 )
        {
            temp=temp/10;
            nod++;
        }
        //  System.out.println(nod);


        int div =(int)Math.pow(10,nod-1);
        while (div != 0)
        {
            int q = n/div;
            System.out.println(q);
            n=n%div;
            div=div/10;
        }

 */




        /*

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0)
        {

            int dig =n%10;
            System.out.print(dig);
            n=n/10;

        }



         */
        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inv=0;
        int op=1;
        while (n != 0){
            int od = n%10;
            int id = op;
            int ip = od;

            inv = inv + id *(int)Math.pow(10,ip-1);

            n=n/10;
            op++;

        }
        System.out.println(inv);


         */
        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inv=0;
        int op=1;
        while (n != 0){
            int od = n%10;
            int id = op;
            int ip = od;

            inv = inv + id *(int)Math.pow(10,ip-1);

            n=n/10;
            op++;

        }
        System.out.println(inv);

         */


        // inverse of a no
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = n;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }

        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }
        int q = n / div;
        int r = n % div;

        int rot = r * mult + q;
        System.out.println(rot);


         */


        /*
       // gcd lcm
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int temp1 = n1;
        int temp2 = n2;

        while (n1 % n2 != 0)
        {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        int gcd = n2;
        int lcm = (temp1 * temp2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);


         */

        // pytha triplets
        /*
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();



        int max = n1;
        if (n2 >= max){
            n2=max;
        }
        if (n3 >= max){
            max=n3;

        }

         */

        /*
        if (max == n1){
            boolean flag =((n2*n2+n3*n3)==(n1*n1));
            System.out.println(flag);

        } else if (max == n2) {
            boolean flag =((n1*n1+n3*n3)==(n2*n2));
            System.out.println(flag);

        }else {
            boolean flag =((n2*n2+n1*n1)==(n3*n3));
            System.out.println(flag);

        }

         */



        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i * i <=n ; i++) {
            System.out.println(i*i);

        }

         */

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int space = n - 1;
        int no = 1;
        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");

            }
            for (int j = 1; j <= no; j++) {
                System.out.print(val + "\t");

                if (j <= no / 2) {
                    val--;

                } else {
                    val++;
                }
            }
            space--;
            no = no + 2;
            //   val++;

            System.out.println();

         */

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);

    }

    public static int getDifference(int b, int n1, int n2) {

     int rv=0;
     int c=0;
     int p=1;

     while (n2>0){
         int d1=n1%10;
         n1=n1/10;

         int d2=n2%10;
         n2=n2/10;

         int d =0;
         d2=d2+c;

         if(d2>=d1){
             c=0;
             d=d2-d1;
         }else{
             c=-1;
             d=d2+b-d1;
         }

         rv=rv+d*p;
         p=p*10;
     }

    return rv;
    }


}



































