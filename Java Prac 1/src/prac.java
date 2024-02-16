import java.util.Arrays;
import java.util.Scanner;

public class prac {
    public static void main(String[] args) {

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int os = n/2;
        int is = -1;

        for (int i =1; i<=n;i++){
            //System.out.print(os +", "+is);
            for (int j = 1; j <=os ; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int j = 1; j <= is ; j++) {
                System.out.print("\t");
            }
            if(i > 1 && i < n){
                System.out.print("*\t");
            }

            if (i <= n/2){
                os--;
                is+=2;
            }
            else{
                os++;
                is-=2;
            }
            System.out.println();

         */

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int row = 1; row <=n ; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("\t");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+"  ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

         */
        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int space = n - 1;
        int col = 1;
        int val = 1;
        int no = 1;

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= col; j++) {
                System.out.print(no + "\t");

                /*
                if (j <= col / 2) {
                    val--;

                } else {
                    val++;
                }

                 */

        /*
           Scanner sc =new Scanner(System.in);
            int N = sc.nextInt();

            if(N%2==0 && (N>=2 && N<=5)){
                System.out.println("Not Weird ");
            } else if(N%2==0 && (N>=6 && N <= 20)){
                System.out.println("Wierd");
            }else if(N%2==0 && N>20 ){
                System.out.println("Not Weird");
            }else{
                System.out.println(" Not Wierd");
            }

            sc.close();

         */

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);
        int nmrfact = fact(n-r);

        int npr = nfact / nmrfact;
        System.out.println(n + "p" + r + " = " + npr);

    }

    public static int fact(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv = rv * i;
        }
        return rv;

         */

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);

    }
    public static int getDigitFrequency (int n , int d){
        int rv =0;
        while ( n>0){
            int dig =n%10;
            n=n/10;

            if (dig ==d){
                rv++;
            }
        }
        return rv;
         */
        //  sum();
        //   greeting();
        //  int ans = sum3(20, 30);
        //System.out.println(ans);

        /*
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            int div = 2;
            while (div * div <= n) {
                if (n % div == 0) {
                    break;
                }
                div++;
            }

            if (div * div > n) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

         */


        // ARRAYS QUESTIONS IMP


        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max){
                max=arr[i];
            }
            if (arr [i] < min) {
                min = arr[i];
            }
        }

        int span = max - min;
        System.out.println(span);



         */

        // Question 2 on arrays find element in arr

        /*
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int data = sc.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==data){

            index= i;
            break;
        }
        }
        System.out.println(index);



         */

        // Array question



        /*
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max){
                max=arr[i];
            }
        }
        for (int floor = max; floor >=1 ; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }



         */


        // Array question on sum

        /*
        Scanner sc = new Scanner (System.in);


        int n1 = sc.nextInt();
        int [] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i]=sc.nextInt();
        }


        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i]=sc.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;
        int c = 0;

        // while (i >= 0 || j >= 0)
        while (k>=0) {
            int d = c;

            if (i >= 0)
                d += a1[i];

            if (j >= 0)
                d += a2[j];

            c = d / 10;
            d = d % 10;
            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (c > 0) {
            System.out.print(c);
        }
        for (int val : sum) {
            System.out.print(val);
        }
    }

         */
        /*
        Scanner sc = new Scanner (System.in);


        int n1 = sc.nextInt();
        int [] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i]=sc.nextInt();
        }


        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i]=sc.nextInt();
        }

        int diff[] = new int[n2];
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int a1v = (i >= 0 ? a1[i] : 0);
            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + 10 + c - a1v;
                c = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < diff.length && diff[idx] == 0) {
            idx++;
        }

        while (idx < diff.length) {
            System.out.println(diff[idx++]);

        }
         */


        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count =0;
        for (int div = 2; div*div <= n ; div++) {
            if (n % div == 0){
                count++;
                break;
            }

        }

        if (count==0){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }



         */


        /*
        int n = 10;
        for (int i = 1; i <= n ; i++) {
            System.out.println(i+"  "+isPrime(i));
        }

    }
        static boolean isPrime(int n){
            if (n <= 1){
                return false;
            }

            int c = 2;
            while (c*c <= n) {
                if (n % c == 0) {
                    return false;
                }
                c++;
            }
            return true;



         */


        /*
        int n = 20;
        boolean ans = (isPrime(n));
        if (n != 1 && ans == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non-Prime Number");
        }
    }



    public static boolean isPrime(int N) {

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;



         */

        /*

        int n = 20;
        boolean ans = (isPrime(n));
        if (n != 1 && ans == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non Prime Number");
        }
    }
        public static boolean isPrime(int N) {

            for (int i = 2; i < Math.sqrt(N); i++) {
                if (N % i == 0) {
                    return false;
                }
            }
            return true;


        }}

         */

        /*
        int n = 40;
        boolean [] prime = new boolean[n+1];
        System.out.println(prime[0]);
        sieveoferatosthenes(n, prime);



    }

// false in array means the number is prime
    static void sieveoferatosthenes(int n , boolean[] prime){
        for (int i = 2; i*i <=n ; i++) {

            if(!prime[i]){ //  This line checks if the
                // current number is not marked as true in the array
                for (int j = i*2; j <=n ; j+=i) {
                    prime[j] = true;
                }

            }
        }

        for (int i = 2 ; i <= n ; i++) {
            if (!prime[i]){ //  This line checks if
                // the current number is not marked as true
                System.out.println(i+" ");
            }
        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }


        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;
        int c = 0;

        // while (i >= 0 || j >= 0)
        while (k >= 0) {
            int d = c;

            if (i >= 0)
                d += a1[i];

            if (j >= 0)
                d += a2[j];

            c = d / 10;
            d = d % 10;
            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (c > 0) {
            System.out.print(c);
        }
        for (int val : sum) {
            System.out.print(val);

        }

         */

        // subraction of an array

        /*
        Scanner sc = new Scanner (System.in);


        int n1 = sc.nextInt();
        int [] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i]=sc.nextInt();
        }


        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i]=sc.nextInt();
        }

        int diff[] = new int[n2];
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int a1v = (i >= 0 ? a1[i] : 0);
            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + 10 + c - a1v;
                c = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < diff.length && diff[idx] == 0) {
            idx++;
        }

        while (idx < diff.length) {
            System.out.println(diff[idx++]);

        }

         */


        // declare and initialize an array of integers

        /*
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

            // print the original array
          //  System.out.print ("Original array: " + Arrays.toString (arr));

            // call the reverse function
            reverse (arr);

            // print the reversed array
            System.out.println ("Reversed array: " + Arrays.toString (arr));

    }

    public static void reverse (int[] a) {

        int i = 0;
        int j = a.length-1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

         */

/*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }

        int limit =(int)Math.pow(2, arr.length);

        for (int i = 0; i < limit; i++) {
            String set ="";
            int temp = i;

            for (int j = arr.length-1; j >=0; j--) {
                int r = temp%2;
                temp=temp/2;
                if (r==0){
                    set="-\t" + set;
                }else {
                    set=arr[j]+ "\t" +set;

                }
            }
            System.out.println(set);
            
        }

 */
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }
         int data = sc.nextInt();

        int low = 0;
        int high = arr.length-1;
        int ceil =0;
        int floor=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(data>arr[mid]){
                low=mid+1;
                floor=arr[mid];//formula to reasign low
            } else if (data < arr[mid]) {
                high=mid-1;
                ceil=arr[mid];// formula to reasign high
            }else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);

         */

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }
        int data = sc.nextInt();

        int lo=0;
        int hi =arr.length-1;
        int fi =-1;

        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (data>arr[mid]){
                lo=mid+1;
            } else if (data < arr[mid]) {
                hi=mid-1;
            }else {
                fi = mid;
                hi= mid-1;
            }


        }
        System.out.println(fi);

         lo=0;
         hi =arr.length-1;
        int li =-1;

        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (data>arr[mid]){
                lo=mid+1;
            } else if (data < arr[mid]) {
                hi=mid-1;
            }else {
                li = mid;
                lo= mid+1;
            }


        }
        System.out.println(li);


         */
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverse = 0;
        while (n>0){
            n = n%10;
            reverse=reverse*10+n;
            n = n / 10;

        }
        System.out.println(reverse);


         */

        Scanner sc = new Scanner(System.in);
        int n1 = 12;
        int n2 = 13;

        int sum = n1+n2;

        System.out.println(sum);
    }




}






