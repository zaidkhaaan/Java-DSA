import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1=num;
        int temp=num;

        int count = 0;
        while (n1>0){
            int n2=n1%10;
            count++;
            n1=n1/10;

        }

        int sum = 0;
        while (num>0){
            int digit = num%10;
             sum += Math.pow(digit,count);
             num=num/10;
        }

        if (sum==temp){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
}

         */


        /*  Perfect number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        for (int a = 1; a <num ; a++) {

            if (num % a == 0) {
                sum += a;
            }
        }
            if (temp==sum){
                System.out.println("Perfect Number");
            }else {
                System.out.println("Not a Perfect Number ");
            }



         */
        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum =0;
        for (int a = 1; a <=num ; a++) {
             sum+=a;
        }
        System.out.println(sum);


         */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();

        int sum = 0;
        for (int a = 1; a <=num ; a++) {
            sum +=a;
            a +=d;
        }
        System.out.println(sum);


         */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        if (num>num2){
            System.out.println(num+"Is greater than"+num2);
        } else if (num2>num) {
            System.out.println(num2+"Is greater than"+num);
        }
    }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The greatest of the two number is " + Math.max(num, Math.max( num1,num2)));


         */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%4==0){
            System.out.println(num+" Is a Leap year");
        }else if (num%400==0){
            System.out.println(num +" Is a Leap year ");
        } else if (num%100==0) {
            System.out.println(num+" Is not a Leap year");
        }else {
            System.out.println(num+" Not a Leap Year");
        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp =num;
        int reverse=0;
        while (num>0){
             temp = num%10;
             reverse = (reverse * 10) + temp;
            num=num/10;
        }
        System.out.println(reverse);

         */
/* q15
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp =num;
        int reverse=0;
        while (num>0) {
            temp = num % 10;

            if (temp>)
        }

 */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0;
        int b= 1;
        int sum=0;

        for (int i =1 ; i <=num ; i++) {
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;


        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int ans= 1;
        for (int i = 0; i < pow; i++) {
            ans = ans * num;
        }
        System.out.println(ans);


         */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =1;
        for (int i=1; i <=num ; i++) {
           sum =sum*i;
        }
        System.out.println(sum);

         */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp2 =num;
        int sum=0;
        int check;
        while (num>0){
            int temp=num%10;
            int fact=1;
            for (int i = 1; i <=temp ; i++) {
                fact *=i;
            }

            sum +=fact;
            num=num/10;
        }
        if (temp2==sum){
            System.out.println("strong number");
        }else{
            System.out.println("not strong number"
            );
        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c =num;
        int d =c*num;

       // System.out.println(d);
        int count=0;
        int sum=0;
        while (d>0){
            int temp=d%10;
            count++;
            d=d/10;
            if (count==2){

            }
        }

         */


        /*

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int on1=n1;
        int on2=n2;

        while (n1 % n2 != 0){
            int rem =n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd =n2;
        int lcm =(on1 * on2)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);



         */


        /*       */

        /*
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        for (int div = 2; div <=n1 ; div++) {
            while (n1%div==0){
                n1=n1/div;
                System.out.println(div);
            }
        }


         */

        /*
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int og=n1;
        int sum = 0;
        for (int div = 1; div < n1; div++) {
            if (n1 % div == 0) {
                sum = sum + div;
            }
        }

            if (sum>og){
                System.out.println("Abundant Number");
            }else{
                System.out.println("Not Abundant Number");
            }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int sum=0;
        while (n1>0){
            int temp =n1%10;
            sum=sum+temp;
            n1=n1/10;
        }
        System.out.println(sum);


         */

        /*
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();

        int sum=0;
        for (int i = n1; i <=n2 ; i++) {
            sum=sum+i;
        }
        System.out.println(sum);


         */

        /*
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        int r =n1-n2;
        int sum1=1;
        int sum2=1;

        for (int i = 1; i <=n1 ; i++) {
            sum1=sum1*i;
        }
        for (int i = 1; i <=r ; i++) {
            sum2=sum2*i;
        }

        int ans =sum1/sum2;

        System.out.println(ans);
         */


        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int i =0;
        int j =str.length() -1;
        boolean isPalindrome = true;

        while (i<=j){
            char ch1= str.charAt(i);
            char ch2=str.charAt(j);

            if (ch1 != ch2) {
               isPalindrome=false;
               break;
            }
            else {
                i++;
                j--;
            }
        }
      if (isPalindrome){
          System.out.println("Palindrome");
      }else {
          System.out.println("Not Plaindrome);
         */


        /*
        long start =System.currentTimeMillis();



        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int i =0;
        int j =str.length() -1;
        boolean isPalindrome = true;

        for (int pal =j ; pal >i ; pal--) {
            char ch1= str.charAt(i);
            char ch2=str.charAt(j);

            if (ch1 != ch2) {
                isPalindrome=false;
                break;
            }
            else {
                i++;
                j--;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
        long end =System.currentTimeMillis();

        long duration =start-end;
        System.out.println(duration);

int length = str.length();
         */


        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        int count1=0;
        int count2=0;
        int count3=0;
        int vowel=0;

        for (int i = 0; i <length ; i++) {
            char ch =str.charAt(i);

             if (ch =='a'|| ch =='e'||ch =='i'||ch =='o'||ch =='u') {
                vowel++;
            } else if (ch>='a' && ch<='z') {
                 count1++;
             } else if (ch>='A'&& ch <='Z'){
              //  System.out.println("Upper Case");
                count2++;
            } else if (ch == ' ') {
                count3++;
            }


        }
        System.out.println(vowel+" Number of vowels");
        System.out.println(count1+" Number of lower case & consonants");
        System.out.println(count2+" Number of upper case & consonants");
        System.out.println(count3+" Number of whitespaces");


         */

        /*
        char c ='Z';
        int ascii =c;
        System.out.println(ascii);
         */


        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String noVowelStrg = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' ||
                    ch == 'I' || ch == 'O' || ch == 'U')) {
                noVowelStrg += ch;
            }
        }
        System.out.println(noVowelStrg);

         */

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start =0;
        int end =str.length()-1;
        String empty="";
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);

            if (start<=end){
                i=empty;
            }
        }


         */

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if(ch == '(' && ch ==')'){
                System.out.print(ch);
            }
        }


         */


        /*
        String str = "zaid pathan will be a billionaire";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        // System.out.println(words);
        for (String word : words) {
           // System.out.println(word);
            int length = word.length();

            result.append(Character.toUpperCase(word.charAt(0)));
           // System.out.print(result);

            if (length > 1)
            {
                result.append(word.substring(1, length - 1));
                result.append(Character.toUpperCase(word.charAt(length - 1)));
            }
            result.append(" ");
        }
         result = new StringBuilder(result.toString().trim());

        System.out.println(result);

         */

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum=0;
        int sum2=0;
        String tempSum="0";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)){
                tempSum+=ch;
            }
            else {
                sum += Integer.parseInt(tempSum);
                tempSum = "0";
            }
             sum2=sum +Integer.parseInt(tempSum);
        }

        System.out.println(sum2);

         */

        /*
        String str ="ZJAK";
        String str1="";

        for (int i =str.length()-1; i>=0; i--) {
            str1+=str.charAt(i);
        }
        System.out.println(str1);

         */

        /* Maximum occuring substring
        String str = "Hello, World!";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }

         */



        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Non-repeating characters: ");

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is non-repeating
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                System.out.print(currentChar + " ");
            }
        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (Isanagram(s1,s2)){
            System.out.println(s1 +" and "+s2+" are anagram.");
        }else {
            System.out.println(s1+" and "+s2+" are not anagram.");
        }


         */


        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);


        int nmrfact = fact(n - r);

        int npr = nfact / nmrfact;
//System.out.print(n+ "P"+ r + " = " + npr);
        displayfunction(n, r,npr);

         */
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  n1= sc.nextInt();
        int f =getDigitFrequency(n,n1);
        System.out.println(f);


         */


        /*
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));

         */
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int b1= sc.nextInt();
        int b2= sc.nextInt();

        int d = getValue(n,b1,b2);
        {
            System.out.println(d);
        }


    }

    public static int getValue(int n , int b1 , int b2){
        int dec = AnyBasetoDecimal(n,b1);
        int dn = DecimaltoAnybase(dec,b2);

        return dn;
    }

    public static int DecimaltoAnybase ( int n , int b)
    {

        int rv =0;
        int p=1;
        while(n>0){
            int dig = n%b;
            n=n/b;

            rv += dig*p;
            p=p*10;

        }

        return rv;

    }




    public static int AnyBasetoDecimal(int n , int b)
    {
        int rv =0;
        int p=1;
        while(n>0){
            int dig = n%10;
            n=n/10;

            rv += dig * p;
            p=p*b;

        }

        return rv;

    }





















    /*

    public static String  compression1(String str){
        String s = str.charAt(0) +"";

        for (int i = 1; i < str.length(); i++) {
        char curr = str.charAt(i);
        char prev = str.charAt(i-1);

        if(curr != prev){
            s +=curr;
        }

        }

        return s;
    }



    public static String  compression2(String str) {
        String s = str.charAt(0) + "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    s += count;
                    count = 1;
                }
                s += curr;
            }
        }
            if (count > 1) {
                s += count;
                count = 1;
            }

        return s;
    }
}
     */































    /*
public static int getDigitFrequency(int n , int d){
        int rv =0;
        while (n>0){
            int dig = n%10;
            n=n/10;

            if (dig==d){
                rv++;
            }
        }


        return rv;
}


    /*
    static int fact(int x){
        int rv =1;

        for (int i = 1; i <=x ; i++) {
            rv=rv*i;
        }
        return rv;
    }

   static void displayfunction(int n , int r ,int npr){
        System.out.println(n+ "p" + r +" = "+npr);
    }

     */











}
















    /*

    static boolean Isanagram(String s1,String s2){
        s1=s1.replaceAll("\\s"," ").toLowerCase();
        s2=s2.replaceAll("\\s"," ").toLowerCase();

        if (s1.length() != s2.length()){
            return false;
        }

        char[] charArray1 =s1.toCharArray();
        char[] charArray2 =s2.toCharArray();

        arrays.Arrays.sort(charArray1);
        arrays.Arrays.sort(charArray2);

        return arrays.Arrays.equals(charArray1,charArray2);
    }
}

     */






















