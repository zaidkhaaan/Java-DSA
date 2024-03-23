package Stringss;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {


/*



        // Question 1 :- Palindrome String from Striver TCS NQT SHEET

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // was assigning the charachter itself and not making pointers and
        // then assigning

       int i  =0;  // seeting pointers
        int j = str.length()-1;

        for (int k = 0; k < str.length() ; k++)
        // running the loop over the entire string

        {
            // checking if last char = first char
            // then incrementing the loop as it is in integer value

            if (str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }

        }

        // as soon as the loop is over it will check for i and j pointers
        // if the string is palindrome  i will cross j
            if (i>j){
                System.out.println(" Palindrome");
            }else {
                System.out.println(" Not palindrome");


        }

 */

        /*
         2nd approach if 2 make it reverse  from the original string
         and compare it , if reverse is equal to original
         then it is palindrome

         */

        // 2nd approach

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String str1 =str;
        String result="";

        for (int i =str.length()-1; i >= 0; i--) {
            result +=str1.charAt(i);
        }
        if (str.equals(result)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }

         */


        // STRIVER'S APPROACH
/*
        String str = "ABCDCBA";
        boolean ans = isPalindrome(str);

        if (ans == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


 */


        // Stivers Function for palindrome


//    static private boolean isPalindrome(String s) {
//
//        /*
//        It starts by setting two pointers, left at the start of
//        the string and right at the end of the string.
//         */
//
//        int left = 0, right = s.length() - 1;
//        while (left < right)
//        /*
//        Then it enters a loop that continues
//        as long as left is less than right.
//         */
//
//        {
//            char l = s.charAt(left), r = s.charAt(right);
//            /*
//            It gets the characters at the left and right
//            positions of the string
//             */
//            if (!Character.isLetterOrDigit(l))
//                left++;
//
//            // If the character at the left is not a letter or digit,
//                // it moves the left pointer one step to the right.
//
//            else if (!Character.isLetterOrDigit(r))
//                right--;
//
//            // If the character at the right is not a letter or digit,
//                // it moves the right pointer one step to the left.
//
//            else if (Character.toLowerCase(l) != Character.toLowerCase(r))
//                return false;
//            /*
//            If both characters are letters or digits, it compares them.
//             If they are not the same (ignoring case),
//             it immediately returns false, indicating that the string is not a palindrome.
//             */
//            else {
//                left++;
//                right--;
//                /*
//                If the characters are the same,
//                it moves both pointers towards the center of the string and continues
//                to the next iteration of the loop.
//                 */
//            }
//        }
//        return true;
//        /*
//        If the function has compared all pairs of characters without finding a mismatch,
//        it exits the loop and returns true,
//        indicating that the string is a palindrome.
//         */


        // Q2 Count number of vowels, consonants, spaces in String.


        // my approach


//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        str = str.toLowerCase();
//        int length = str.length();
//
//        int vowels = 0;
//        int consotants = 0;
//        int whitespace = 0;
//
//        for (int i = 0; i < length; i++) {
//            char ch = str.charAt(i);
//           if (ch == 'a' || ch =='e'|| ch =='i'|| ch=='o'|| ch=='u'){
//               vowels++;
//           }else if ( ch >= 'a' &&  ch <= 'z'){
//               consotants++;
//           } else if (ch == ' ') {
//               whitespace++;
//           }
//        }
//        System.out.println(vowels);
//        System.out.println(consotants);
//        System.out.println(whitespace);


        // Q3 Find the ASCII value of a character
        // Problem Statement: Given a character,
        // Find the ASCII value of the character.


        // My appraoch


        /*
        // when we convert char into integer datatype we get ascII value

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int asciII =str.charAt(i);
            System.out.println(asciII);
        }

         */

        // Naive approach

        /*
        char ch = 'A';
        int ascii = ch;
        System.out.println(ascii);
         */

        //  bing ai approach

        /*
        char ch = 'A'; // replace 'A' with the character you want
        int ascii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);


         */


        // Q 4 Remove all vowels from the String
        //Problem Statement: Given a String,
        // write a program to remove vowels from a given String.



        /*
        my approach

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        str = str.toLowerCase();
        String str2 = str.replaceAll("[a e i o u A E I O U]"," ");
        String str3 = str2.replaceAll("\\s","");
        System.out.println(str3);


         */


        // 2nd approach ( By self)

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();
        String wovowel = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch =='e'|| ch =='i'|| ch=='o'|| ch=='u'){
                wovowel += " ";
            }
            else{
                wovowel +=ch;
            }

        }
        wovowel = wovowel.replaceAll("\\s","");
        System.out.println(wovowel);

         */


        // Strivers Approach

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' ||  str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                str=str.substring(0,i) + str.substring(i+1);
            }
        }

        System.out.println(str);

         */

        // Q4 Given a string,
        // write a program to remove all the whitespaces from the string


        // My appraoch

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();

        str=str.replaceAll("\\s","");
        System.out.println(str);

         */



        /*

         2nd approach

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String str1 = "";

        for (char c :str.toCharArray()){
            if ( c!= ' '){
                str1+=c;
            }
        }

        System.out.println(str1);
         */


        // strivers approach

        /*
        char[] str = "Take you forward ".toCharArray();
        int count = 0; // to track spaces seen so far

        for (int i = 0; i < str.length; i++)
            if (str[i] != ' ') {
                str[count] = str[i];
                count++; // increment count
            }

 //        System.out.println(String.valueOf(str).subSequence(0, count));

         */


        // Q6  Write a program to remove all characters from a string except alphabets in a given string.


        // My approach



        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
     //   s=s.toLowerCase();
        String s2 ="";

        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A'&& ch <= 'Z'){
                s2 +=ch;
            }else{
                s2 +=" ";
            }
        }
        s2=s2.replaceAll("\\s","");
        System.out.println(s2);
    }

         */

        // Bing ai approach


        /*
        String str = "Hello, World! 123";
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
         */


        // bing ai second approach

        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";

        for (char c: s.toCharArray()){
            if (Character.isLetter(c)){
                s1 +=c;
            }
        }
        System.out.println(s1);
         */


        // Strivers approach

        /*

        String str = "take12% *&u ^$#forward";
        int n = str.length();
        StringBuffer ans = new StringBuffer();

        for (int i = 0; i < n; i++) {
            int ascii = (int) str.charAt(i); //ascii value

            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) // if alphabets
                ans.append(str.charAt(i));
        }

        System.out.println("Resultant string:");
        System.out.println(ans.toString());

         */

        // Q7  Write a program that reverses a given string (in-place).

        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev= "";

        for (int i = s.length()-1; i >=0 ; i--) {
            rev+=s.charAt(i);
        }
        System.out.println(rev);

         */

// Q8 Remove brackets from an algebraic expression
//In this article, we will solve the most asked interview question:
// “Remove brackets from an algebraic expression”


        // my approach
        // issue trailing spaces at front

        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == ')') {
                s1 += " ";

            } else {
                s1 += ch;
            }
        }
            s1.replaceAll("\\s","");
            System.out.println(s1);

         */


        // striver approach using string builder



        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(' && s.charAt(i)!=')'){
                answer.append(s.charAt(i));
            }

            answer.toString();

        }
        System.out.println(answer);

         */

        // Q9

        // Given a string, calculate the sum of numbers in a string
        // (multiple consecutive digits are considered one number)


        // to find out numbers present in a string

        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

      for (char c : s.toCharArray()){
          if (Character.isDigit(c)){
              sb.append(c);
          }
      }

        s = sb.toString();
        System.out.println(s);

         */


        // not able to solve

        /*
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int sum = 0;
            String num = "0";

            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                    num += c; // append the digit to num
                } else {
                    sum += Integer.parseInt(num); // add the number to sum
                    num = "0"; // reset num
                }
            }

            sum += Integer.parseInt(num); // add the last number to sum
            System.out.println("The sum of numbers in the string is: " + sum);


         */

        // Q 10 Given a string, write a program to
        // Capitalize the first and last character of each word of that string.


        // easier ai approach

        /*
                  Scanner sc = new Scanner(System.in);
                  String str = sc.nextLine();
                  str.toLowerCase();
               // String str = "hello world"; // replace with your string
                String[] words = str.split(" ");
                StringBuilder result = new StringBuilder();

                for (String word : words) {
                    String firstLetter = word.substring(0, 1).toUpperCase();
                    String lastLetter = word.substring(word.length() - 1).toUpperCase();
                    String middle = word.substring(1, word.length() - 1);

                    result.append(firstLetter).append(middle).append(lastLetter).append(" ");
                }

                System.out.println(result.toString().trim());

         */

        // Q11 Problem Statement: Given a string,
        // calculate the frequency of characters in a string.



        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        char c[] = str.toCharArray();
        arrays.Arrays.sort(c);

        char ch = c[0]; //
        int count = 1;
        for (int i = 1; i < c.length; i++) {
            if (c[i] == ch) //
                count++;
            else {
                System.out.print(ch);
                System.out.print(count + " ");
                ch = c[i]; //
                count = 1;
            }
        }
        System.out.print(ch);
        System.out.print(count + " ");

         */


        // open ai method

/*
        String str = "Your string here";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " - " + freq[i]);
            }
        }

 */

        // toggle case string question


        /*
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch>='a' && ch <= 'z'){
                char upc = (char)(ch - 32);
                sb.setCharAt(i,upc);
            }else if (ch >= 'A' && ch <= 'Z') {
                char lch = (char)(ch + 32);
                sb.setCharAt(i,lch);
            }
        }
        str =sb.toString();
        System.out.println(str);

         */

        // using college wallah approach


        // PHysiCs -> phYSIcS

        /*
        for (int i = 0; i < str.length(); i++) {

            boolean flag = true; // true -> captial

            char ch = str.charAt(i);
            if (ch ==' ') continue;
            if (ch >= '0' && ch <= '9') continue;
            int ascii = (int)ch;
            if (ascii >= 97 && ascii <= 122) flag=false;// small
         //   if (ascii >= 48 && ascii <= 57) continue;
            if (flag == true) // captial
                {
                ascii += 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
            else // small

            {
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);


         */


// palindromic substring

        /*
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder gtr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                str=(str.substring(i,j);
                gtr = str.reverse();


            }
            System.out.println();
        }

         */


        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.next();



        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (isPlaindrome(str.substring(i, j)) == true) {
                    System.out.println(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println(count);



      //   System.out.println(isPlaindrome(str));

         */


        // reverse a word in a sentence

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";

     String [] s = str.split(" ");
     StringBuilder str1 = new StringBuilder();

        for (String word:s)
        {
            str1.append(word);
            str1.reverse();
            ans+=str1;
            ans += " ";
            str1 = new StringBuilder();
        }
        System.out.println(ans);


         */
        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(compresion1(str));
        System.out.println(compression2(str));

         */


        /*
        Scanner sc = new Scanner (System.in);
        String s = sc.next().replaceAll("[^a-zA-Z0-9]", "");

        s = s.toLowerCase();
        StringBuilder str = new StringBuilder(s).reverse();


        if (s.equals(str.toString())) System.out.println("true");
        else System.out.println("false");


         */




        /*
        for (int i = s.length()-1 ;i >= 0 ; i--) {
            char chstart = s.charAt(i);
            s1 +=chstart;
        }
        System.out.println(s1);

        if (s.equals(s1)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

         */



        /*

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.toLowerCase();
        String s2 ="";

        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                s2+=' ';
            }
            else {
                s2+=ch;
            }
        }
        s2=s2.replaceAll(" ","");
        System.out.println(s2);

         */


        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lowercaseCh = Character.toLowerCase(ch);
                if (lowercaseCh == 'a' || lowercaseCh == 'e' || lowercaseCh == 'i' || lowercaseCh == 'o' || lowercaseCh == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch == ' ') {
                spaces++;
            }
        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.toLowerCase();

        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

         */

        /*
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();


        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char ch1 [] = s1.toCharArray();
        char ch2 [] = s2.toCharArray();

        arrays.Arrays.sort(ch1);
        arrays.Arrays.sort(ch2);

        if (arrays.Arrays.equals(ch1, ch2)) {
            System.out.println("The two strings are anagrams of each other.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }


         */


        // convert number to string
//        int num = 42;
//        String numAsString = Integer.toString(num);
//        //System.out.println(numAsString.toLowerCase());
//
//        System.out.println("Number as string: " + numAsString +"  ");


//        String strNum = "123";
//        int parsedNum = Integer.parseInt(strNum);
//
//        int parsed1 = parsedNum+90;
//        System.out.println("Parsed integer: " + parsed1);

        /*
        String str1 = "4";
        String str2 = "04";
      int n1 = Integer.parseInt(str1);
     int n2 = Integer.parseInt(str2);
    if (n1 == n2)
    {
            System.out.println("Both numeric strings are equal.");
        }

         */

//       int apples = 5;
//      String message = String.format("I have %d apples.", apples);
//       System.out.println(message);


        /*
        String name = "Alice";
        int age = 30;
        double salary = 50000.75;
        String formattedString = String.format("Name: %s, Age: %d, Salary: %.2f", name, salary , age);
        System.out.println(formattedString);
         */

        //    String s = "ZAID";

        //   String toString (char ch) ;

        /*


        Scanner sc = new Scanner(System.in);
        String str = "1bc268"; // You can read the input string from the user if needed

        String tempSum = "0";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);

            if (Character.isDigit(s)) {
                tempSum += s;
            } else {
                sum += Integer.parseInt(tempSum);
                tempSum = "0";
            }
        }

        sum += Integer.parseInt(tempSum); // Add any remaining value in tempSum
        System.out.print("Sum: ");
        System.out.println(sum);



         */

      /*
        String str = "12abc3";
        
        String tempsum ="0";
        
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);

            if (Character.isDigit(s)){
                tempsum+=s;
            }else{
                sum+= Integer.parseInt(tempsum);
                tempsum="0";
            }

        }
        sum+=Integer.parseInt(tempsum);
        System.out.println(sum);

       */

//        String s = "Take you forward";
//       char ch [] =s.toCharArray();
        /*
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int arr [] = new int  [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        int data = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==data){
                System.out.println(i);
            }
        }

         */



        /*
        String input = "hello   world,  how   are  you?"; // Example input with extra spaces
        // Split the input string into words
       // String[] words = input.split("\\s+");
        String[] words = input.split("\\s+");

        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (!word.isEmpty())
            // .isEmpty() function
            {
                // Capitalize the first character
                char firstChar = Character.toUpperCase(word.charAt(0));

                // Capitalize the last character
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));

                // Append the modified word to the result
                result.append(firstChar).append(word.substring(1, word.length() - 1)).append(lastChar).append(" ");
            }

         */

/*



 */

        /*
        String str = "zaiddiazdiaz";
        char c[] = str.toCharArray();
        arrays.Arrays.sort(c);

        char ch = c[0]; // ??
        int count = 1;

        for (int i = 1; i < c.length; i++) {
            if (c[i] == ch) {
                count++;
            } else {
                System.out.print(ch); // ??
                System.out.print(count + " "); // ??
                ch = c[i]; // ??
                count = 1;
            }
        }
        System.out.print(ch); // After the loop, print the last character counted.
        System.out.print(count + " "); // And print how many times it appeared.

         */


        String s = "ZAIDDIAZ";
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) { // Use j < s.length() instead of j <= s.length()
                if (ch == s.charAt(j)) { // Compare characters using s.charAt(j)
                    count++;
                }
            }
        }
        System.out.println("Total duplicate characters: " + count);
    }
    }
        /*


         */






















//        String input = "hello   world,   how   are   you?"; // Example input with extra spaces
//
//        // Split the input string into words
//         String[] words = input.split("\\s+");
        // Split by one or more spaces








    /*
    public static String compresion1 (String str){
        String s = str.charAt(0) +"";

        for (int i = 1; i < str.length() ; i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if (curr != prev){
                s +=curr;
            }
        }
        str=s.toString();
        return s;
    }

    public static String compression2 (String str) {
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

        if (count >1){
            s+=count;
            count = 1;
        }
        str=s.toString();
        return s;
    }

     */

    /*

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        System.out.println(reversedSentence.toString().trim());
    }
     */



    /*
    public static boolean isPlaindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else{
                return false;
            }
        }
        return true;
    }

     */

















            /*
        String str = "take u forward";
        System.out.println("String after removing the vowels \n"+RemoveVowels(str));
         */
      /*
          public static String RemoveVowels(String str) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    str = str.substring(0, i) + str.substring(i + 1);
                    i--;
                }
            }
            return str;
        }


     */



    /*
    public static String RemoveVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        return str;
    }


     */






            /*
        String str = "abc123def564ghi789";  // Input string
        int sum = 0;  // Initialize sum of numbers
        String num = "";  // Initialize current number

        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);

            // If the current character is a digit, append it to the current number
            if (Character.isDigit(c)) {
                num += c;
            }

            // If the current character is not a digit, or it's the end of the string,
            // add the current number to the sum and reset the current number
            if (!Character.isDigit(c) || i == str.length() - 1) {
                if (!num.equals("")) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        System.out.println("The sum of numbers in the string is: " + sum);
    }
}

         */





          /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String str = "Hello, World!";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);

         */



           /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:");
        String str = sc.nextLine();
        // String str = "Hello, this is a test string without spaces.";
        String noSpacesStr = "";

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != ' ') {
                        noSpacesStr += str.charAt(i);
                    }
                }

                System.out.println(noSpacesStr);

         */

