package Stringss;

import javax.swing.*;
import java.util.*;

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

//
//        String s = "ZAIDDIAZ";
//        s = s.toLowerCase();
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            for (int j = i + 1; j < s.length(); j++) { // Use j < s.length() instead of j <= s.length()
//                if (ch == s.charAt(j)) { // Compare characters using s.charAt(j)
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("Total duplicate characters: " + count);
//
//        String s = "ABBAz";
//        s=s.toLowerCase();

//        StringBuilder sb = new StringBuilder(s);
//        sb=sb.reverse();
//
//        if (s.equals(sb.toString())){
//            System.out.println("Palindrome");
//
//        }else{
//            System.out.println("Not palindrome");
//        }

//        int start = 0;
//        int end = s.length()-1;
//
//        for ( int i = 0 ; i < s.length() ; i++){
//
//            while (start<= end) {
//                char ch = s.charAt(start);
//                char ch1 = s.charAt(end);
//
//
//                if (ch == ch1) {
//                    start++;
//                    end--;
//                }
//
//                if (ch != ch1)
//                {
//                    System.out.println("Not Palindrome");
//                    break;
//                }
//
//            }
//
//        }
//        System.out.println("Palindrome");


//        String s1 = "";
//
//        for ( int i = s.length()-1; i >=0  ; i--){
//            char ch  = s.charAt(i);
//            s1 +=ch;
//        }
//
//        if (s.equals(s1)) System.out.println("Palindrome");
//        else System.out.println("Not Palindrome");
//
//        Scanner sc = new Scanner(System.in);
//        String s =sc.nextLine();
//        s=s.toLowerCase();
//        int vowel = 0;
//        int consonants = 0;
//        int spaces = 0;
//
//       for ( int i = 0 ; i < s.length() ; i++){
//           char ch = s.charAt(i);
//
//           if (ch == 'a'|| ch =='e'|| ch=='i'|| ch=='o'|| ch=='u'){
//               vowel++;
//           } else if (ch ==' ') {
//               spaces++;
//           } else if ( ch >= 'a' && ch <= 'z') {
//               consonants++;
//           }
//       }
//
//        System.out.print(vowel+"  "+consonants+"  "+spaces);


//        char ch = 'a';
//        int ascii = ch;


//        String str = "take u forward";
//        str=str.toLowerCase();
//        str=str.replace('a','b');
//        System.out.println(str);


//        System.out.println(RemoveSpaces(str));

//        String str = "take u forward";
//        System.out.println(str.substring(0,1));


//        int s= 1011121314;
//        String str = String.valueOf(s);
//        char [] str1 = str.toCharArray();
//        System.out.println(Arrays.toString(str1));
//        String st2 = String.valueOf(str1);
//        char[] st3 = st2.toCharArray();
//        System.out.println(Arrays.toString(st3));

//        char [] str ;
//        System.out.println(str);

//        for (char letter : str) {
//            System.out.print(letter+" ");
//        }


//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        s=s.toLowerCase();
//        char[] str = s.toCharArray();
//        int count = removeSpaces(str);
//        System.out.println(String.valueOf(str).subSequence(0, count));

//        String str = "take12% *&u ^$#forward";
//        str = str.replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println(str);

//        String str = "take12% *&u ^$#forward";
//        str=str.toLowerCase();
//        System.out.println(removeSpchra(str));
//        int n = str.length();

//        System.out.println("Resultant String");
//        System.out.println(solve(str,n));

//        String s = "zaid";
//        StringBuilder sb = new StringBuilder(s);
//        sb=sb.reverse();
//        StringBuffer sbf = new StringBuffer(s);
//        sbf=sbf.reverse();
//        System.out.println(sbf);

//        String S = "";
//        for ( int i = s.length()-1 ; i >= 0 ;i--){
//            char c = s.charAt(i);
//            S+=c;
//        }
//        System.out.println(S);


//        String str = "Hello";
//        char [] reverseString = new char[str.length()];
//        Stack<Character> stack = new Stack<Character>();
//
//        for ( int i = 0; i < str.length() ; i++){
//            stack.push(str.charAt(i));
//        }
//
//        int i = 0;
//        while (!stack.isEmpty()){
//            reverseString[i++] = stack.pop();
//
//        }


//       str = new String (reverseString);
//        str = String.valueOf(reverseString);
//        System.out.println("The reversed String is " +str);
//
//        String s = "a+((b-c)+d";
//        s=s.replace("(","");
//        s=s.replace(")","");
//        System.out.println(s);


//        String s =  "a+((b-c)+d)";
//        System.out.println(removeBrack(s));
//        System.out.println(s.substring(0,0));
//        System.out.println(s.substring(0,1));
//        System.out.println(s.substring(0,2));
//        System.out.println(s.substring(0));
//        System.out.println(s.substring(0,s.length()));


//        int c = arr.length;
//        System.out.println(c);

//        int count =removeBrackk(arr);
//        s=String.valueOf(arr).substring(0).trim();
//        System.out.println(s);

//        String s =  "a+((b-c)+d)";
//        char [] arr =s.toCharArray();
//        int count =removeSpaces(arr);
//        s=String.valueOf(arr).substring(0).trim();
//        System.out.println(s);


//        String input = "1bc2b6e84o5";
//        System.out.print("Sum: ");
//        int sum=0;
//        System.out.println(findSum(str));
//        for (int i = 0; i < input.length(); i++) {
//            char temp = input.charAt(i);
//            if (Character.isDigit(temp)) {
//                int digit = Character.getNumericValue(temp);
//                sum += digit;
//            }
//        }
//
//        System.out.println("Sum of all numbers in the string: " + sum);

//        Scanner sc = new Scanner (System.in);
//        String input = sc.nextLine();
//        input= input.toLowerCase();
//
//        String result = CaptailizeFsandLas (input);
//        System.out.println(result);


//        String str = "Take u Forward is Awesome";
//        int size = str.length();
//
//        System.out.println("String after capitalizing first and last letter of each word of the string: ");
//        System.out.println(Capitalize(str, size));


//        String str = "takeuforward";
//        Printfrequency(str);

//        String inputString = "takeuforward";
//        inputString = inputString.toLowerCase();
//        int[] frequency = new int[26]; // Assuming ASCII characters
//
//        for (char ch : inputString.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                frequency[ch - 'a']++;
//            }
//        }
//
//        System.out.println("Frequencies:");
//
//        for (int i = 0; i < frequency.length; i++) {
//            if (frequency[i] != 0) {
//                System.out.println((char) (i + 'a') + " = " + frequency[i]);
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        s=s.toLowerCase();
//        int[] freq = new int [26];
//
//        for(char ch : s.toCharArray() )
//        {
//            if(Character.isLetter(ch))
//            {
//                int index = ch-'a';
//                freq[index]++;
//            }
//
//        }
//
//        for (int i = 0 ; i < freq.length;i++){
//
//            if (freq[i]!=2){
//                System.out.print((char)(i+'a')+" ");
////                System.out.print(freq[i]+" ");
//            }
//        }

//        String str = "takeuforward";
//        Printfrequency(str);


//        String s1 = "CATE";
//        s1=s1.toLowerCase();
//
//        String s2 = "ACT";
//        s2=s2.toLowerCase();
//
//        char [] arr = s2.toCharArray();
//        char [] arr1 = s1.toCharArray();
//
//        Arrays.sort(arr);
//        Arrays.sort(arr1);
//
//        boolean isequals = Arrays.equals(arr,arr1);
//
//        if (isequals)System.out.println("Anagrams");
//        else System.out.println("NOT anagrams");


//        String str1 = "zaid";
//        String str2 = "daiz";
//        System.out.println(checkanagrams(str1,str2));

//        String s = "google";
//        Nonrepeat(s);

//        Printfrequency(s);
//
//        char ch = 'a';
//        int a = ch;
//        System.out.println(a);
//
//        String ss = "";
//        ss.length();

//        char c = 's';
//        int ch = (int)c;

//        String str = "hello";

//        int j = 0;
//        for ( int i = 0 ; i < str.length(); i++){
//            int ch = (int)str.charAt(i);
//            System.out.println(ch);
//        }

//        int j = 0;
//        int sum = 0;
//        for ( int i = 1 ; i <str.length() ; i++){
//            int ch = (int)str.charAt(i);
//            int ch1 = (int)str.charAt(j);
//
//            if(j < str.length()-1){
//                if (ch1-ch <0){
//                    sum += -1*(ch1-ch);
//                }else {
//                    sum += ch1-ch;
//                }
//                j++;
//            }
//
//        }
//        System.out.println(sum);


//
//        String ss ="{[]}";
//        System.out.println(isValid(ss));

//

//            Scanner sc = new Scanner(System.in);
////            int n = sc.nextInt();
//            String s = sc.nextLine();
//            s = s.toLowerCase();
//
//
//
//            int a = 0;
//            int e = 0;
//            int i = 0;
//            int o = 0;
//            int u = 0;
//
//            for (int j = 0; j < s.length(); j++) {
//                char ch = s.charAt(j);
//                if (ch == 'a') {
//                    a++;
//                } else if (ch == 'e') {
//                    e++;
//                } else if (ch == 'i') {
//                    i++;
//                } else if (ch == 'o') {
//                    o++;
//                } else if (ch == 'u') {
//                    u++;
//                }
//            }
//
//            // Find the maximum count among vowels
//            int maxCount = Math.max(Math.max(Math.max(Math.max(a, e), i), o), u);
//
//            // Determine which vowel(s) have the maximum count
//            StringBuilder result = new StringBuilder("Most repeated vowel(s): ");
//            if (a == maxCount) {
//                result.append("a ");
//            }
//            if (e == maxCount) {
//                result.append("e ");
//            }
//            if (i == maxCount) {
//                result.append("i ");
//            }
//            if (o == maxCount) {
//                result.append("o ");
//            }
//            if (u == maxCount) {
//                result.append("u ");
//            }
//
//            System.out.println(result.toString().trim());


//
//        String s = "ZaId";
//        char [] ch = s.toCharArray();
//        int ascii2 = 0;
//        int ascii3 = 0;
//        char ch2 = 0;
//
//        char ch3 = 0;
//
//        for(char ch1: ch){
//            int ascii = (int) ch1;
//            ascii2=0;
//            ascii3=0;
//            if(ascii >=97 & ascii <= 122  ){
//                ascii2 = ascii-32;
//            }else{
//                 ascii3 = ascii+32;
//            }
//
//            if(ascii2>0){
//               ch2 =(char)ascii2;
//                System.out.print(ch2);
//            }else{
//                 ch3 =(char)ascii3;
//                System.out.print(ch3);

//
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        s = s.toLowerCase();
//
//        int count = 1;
//
//
//        if (s.isEmpty()) {
//            System.out.println("Empty String");
//        } else {
//            for (int i = 0; i < s.length() - 1; i++) {
//
//
//                char ch = s.charAt(i);
//                char ch1 = s.charAt(i + 1);
//
//                if (ch == ch1) {
//                    count++;
//                } else {
//                    System.out.print(ch);
//                    System.out.print(count);
//                    count = 1;
//                }
//
//
//            }
//
//        }
//
//        if (count >= 1) {
//
//            System.out.print(s.charAt(s.length() - 1));
//            System.out.print(count);
//        }


//        String s = "aaabbbccdd";
//        char[] ch =s.toCharArray();
//        System.out.println(compress(ch));

//        String s = "Hello World";
//        s=s.trim();
//        int count = 0;
//
//        for (int i = s.length()-1; i >=0 ; i--) {
//            if (s.charAt(i) != ' '){
//                count++;
//            }else{
//                break;
//            }
//        }
//        System.out.println(count);

//        String haystack = "sadbutsad";
//        String needle ="sad";
//
//        System.out.println(Str(haystack,needle));

//        StringBuilder str = new StringBuilder();
//        String s = "zaid pathan";

//        StringBuilder str = new StringBuilder(s.length());
//        str=str.reverse();
//        return str.toString();
//        System.out.println(reverseWords(s));
//        System.out.println(Reversewords(s));

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        s=s.toLowerCase().trim();
//        String s1 = sc.nextLine();
//        s1=s1.toLowerCase().trim();
//
//        char [] ch = s.toCharArray();
//        char [] ch1 = s1.toCharArray();
//
//        Arrays.sort(ch);
//        Arrays.sort(ch1);
//
//        if (Arrays.equals(ch,ch1)){
//            System.out.println("Anagram");
//        }else{
//            System.out.println("Not Anagram");
//        }

//        String s = "hello";
//        s=s.toLowerCase();
//
//        for ( int i = s.length()-1 ; i >= 0 ; i--){
//            System.out.print(s.charAt(i));
//        }


//        int start = StartisVowel(s);
//        int end = EndisVowel(s);
//        char ch [] = s.toCharArray();
//
//                char temp = ch[start];
//                ch[start]= ch[end];
//                ch[end]= temp;
//
//
//        s=new String(ch);
//        System.out.println(s);

        














//        String s1 = "aA";
//        s1=reverseVowels(s1);
//        System.out.println(s1);





    }
//  static String reverseVowels(String s){
//        s=s.toLowerCase();
//        int n = s.length();
//        char ch [] = s.toCharArray();
//        int start = 0;
//        int end = s.length()-1;
//
//        while (start < end){
//
//            if (!isVowel(ch[start])){
//                start++;
//            } else if (!isVowel(ch[end])){
//             end--;
//            } else{
//                char temp = ch[start];
//                ch[start]=ch[end];
//                ch[end]= temp;
//                start++;
//                end--;
//            }
//        }
//       return String.valueOf(ch);
//    }
//
//    static boolean isVowel(char c) {
//        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//    }


//        int end = 0;
//        int max_length = 0;
//
//        List<Character> list = new ArrayList<Character>();
//
//        while (end < s.length()){
//
//            if (!list.contains(s.charAt(end))){
//                list.add(s.charAt(end));
//                end++;
//                max_length = Math.max(max_length , list.size());
//            }else{
//                list.remove(Character.valueOf(s.charAt(start)));
//                start++;
//            }
//        }
//
//        return max_length;
//    }
//    static String reverseWords(String s) {
//        StringBuilder str = new StringBuilder(s);
//        str=str.reverse();
//
//
//        return str.toString().trim();
//    }



    static String Reversewords(String s ){

        String words [] = s.split(" +");
        StringBuilder str =new StringBuilder();

        for (int i = words.length-1; i >= 0 ; i--) {
            str.append(words[i]);
            str.append(" ");


        }
        return str.toString().trim();
    }

    static int Str(String haystack , String needle){


//        for( int i = 0 ; i < haystack.length() - needle.length()+1 ; i++){
//            if (haystack.charAt(i) == needle.charAt(0)){
//                if (haystack.substring(i,needle.length()+i).equals(needle)){
//                    return i;
//                }
//            }
//
//        }
//        return -1;

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    static int compress(char[] chars) {
        int n = chars.length;

        int i = 0;
        int index = 0;

        while (i < n) {
            char curr = chars[i];

            int count = 0;
            // Find count of duplicates
            while (i < n && chars[i] == curr) {
                i++;
                count++;
            }

            // Assign it to chars and move index ahead to add the count
            chars[index++] = curr;

            // Add the count
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char ch : countStr.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }





        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() - 1) { // Ensure we don't go out of bounds
                char ch = s.charAt(i);
                char ch1 = s.charAt(i + 1);

                if (ch == ch1) {
                    count++;
                } else {
                    System.out.print(ch);
                    System.out.print(count);
                    count = 1;
                }
                i++; // Increment i to avoid infinite loop
            }
        }
         */

//                char ch = s.charAt(i);
//                char ch1 =s.charAt(i+1);
//
//                if (ch == ch1){
//                    count++;
//                }else{
//                    System.out.print(ch);
//                    System.out.print(count);
//                    count=0;
//                }


//    static char countvowel (String s){
//        int count = 0;
//        for ( int i = 0 ; i <s.length() ; i++){
//            char ch = s.charAt(i);
//
//            if (ch =='a'==)
//        }
//    }

    static boolean isValid(String s) {

        int first = 0;
        int second = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            first = (int) ch;
            for (int j = i + 1; j < s.length(); j++) {
                char ch1 = s.charAt(j);
                second = (int) ch1;

                int min = second - first;
                if ((min <= 1 && min > 0) || (min <= 2 && min > 0) || (min <= 3 && min > 0)) {
                    return true;
                } else {
                    return false;
                }
            }
//            if (ch == '(' || ch == '[' || ch == '{') {
//                for (int j = i + 1; j < s.length(); j++) {
//                    char ch1 = s.charAt(j);
//                    if (ch != ch1) {
//                        return true;
//                    }
//                }
//            } else {
//                return false;
//            }
//            int min = second-first;
//            if (min>=1 || min >=2|| min>=3){
//                return true;
//            }else {
//                return false;
//            }

        }
        return false;
    }

    static void Nonrepeat(String s) {
        char[] ch = s.toCharArray();
        int[] freq = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '-';

                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[i] == 1 && ch[i] != '-') {
                System.out.print(ch[i] + "  ");
            }
        }


    }

//    static String SortString (String str){
//        char c [] = str.toCharArray();
//        Arrays.sort(c);
//        return new String(c);
//    }
//    static boolean checkanagrams (String str1 , String str2){
//        if (str1.length() != str2.length()) return false;
//
//        str1=SortString(str1);
//        str2=SortString(str2);
//
//
//        if (str1.equals(str2)){
//            return true;
//        }
//
//        return false;
//    }

    static void Printfrequency(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                System.out.print((char) (i + 'a') + "  ");
//                System.out.print(freq[i] + " ");
            }
        }
    }


//    static String CaptailizeFsandLas(String input){
//
//        String [] words = input.split("\\s+");
//        StringBuilder result = new StringBuilder();
//
//        for (String word :words ) {
//            if (word.length() > 0) {
//
//                char firstchar = Character.toUpperCase(word.charAt(0));
//                char lastchar = Character.toUpperCase(word.charAt(word.length() - 1));
//
//                if (word.length() > 1) {
//                    result.append(firstchar).append(word,1,word.length()-1).append(lastchar).append(" ");
//                }else {
//                    result.append(firstchar).append(" ");
//                }
//            }
//        }
//        return result.toString().trim();
//    }


    static String Capitalize(String str, int size) {

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < size; i++) {
            if (i == 0 || i == (size - 1)) // Converting first and last index character to
            //  uppercase
            {
                sb.setCharAt(i, Character.toUpperCase((char) (int) str.charAt(i)));
            } else if (str.charAt(i) == ' ') // Converting characters present before and
            // after space to uppercase
            {
                sb.setCharAt(i - 1, Character.toUpperCase((char) (int) str.charAt(i - 1)));
                sb.setCharAt(i + 1, Character.toUpperCase((char) (int) str.charAt(i + 1)));
            }
        }

        return sb.toString();

    }


//    static int findSum(String str) {
//        String tempsum = "0";
//        int sum = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char c = str.charAt(i);
//
//            if (Character.isDigit(c)) {
//                tempsum += c;
//            } else {
//                sum += Integer.parseInt(tempsum);
//                tempsum = "0";
//            }
//        }
//            return sum += Integer.parseInt(tempsum);
//
//    }


//    static int removeSpaces ( char[] arr ){
//        Stack<Character> str = new Stack<Character>();
//
//        for (char ch : arr) {
//            if (ch != ')' && ch!='(' ){
//                str.push(ch);
//            }
//        }
//
//        int count = str.size();
//        for (int i = count - 1; i >= 0; i--) {
//            arr[i] = str.pop();
//        }
//
//        for (int i = count; i < arr.length; i++) {
//            arr[i] = '\0'; // Null character to indicate unused space
//        }
//
//        return count;
//    }

//    static String removeBrack(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch != '(' && ch != ')') {
//                sb.append(ch);
//            }
//        }
//        return sb.toString();
//    }

//        static int removeBrackk(char [] arr){
//
//        int count = 0;
//
//        for ( int i = 0 ; i < arr.length ; i++){
//
//            if (arr[i] != '(' && arr[i] != ')'){
//                arr[count] = arr[i];
//                count++;
//            }
//        }
//            for (int i = count; i < arr.length; i++) {
//                arr[i] = '\0'; // Null character to indicate unused space
//            }
//        return count;
//    }

//    static String removeBrack(String s){
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch == '(' || ch==')' ){
//                s=s.substring(0,i)+s.substring(i+1);
//                i--;
//            }
//        }
//        return s;
//    }

//    public static String solve(String str, int n) {
//        StringBuffer ans = new StringBuffer();
//
//        for (int i = 0; i < n; i++) {
//            int ascii = (int) str.charAt(i); //ascii value
//
//            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) // if alphabets
//                ans.append(str.charAt(i));
//        }
//
//        return ans.toString();
//    }


//    static String removeSpchra(String str){
//        String s = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >='a' && str.charAt(i) <= 'z'){
//                s +=str.charAt(i);
//            }
//        }
//        return s;
//
//    }

//    static int removeSpaces (char [] str){
//
//        int count = 0;
//
//        for ( int i = 0 ; i < str.length ; i++){
//
//            if (str[i] != ' '){
//                str[count] = str[i];
//                count++;
//            }
//        }
//        return count;
//    }


//    static String RemoveVowels(String str){
//        for ( int i = 0 ; i <str.length(); i++){
//            if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
//                str=str.substring(0,i)+str.substring(i+1);
//            }
//        }
//        return str;
//    }
//    static String RemoveSpaces(String str){
//        for ( int i = 0 ; i <str.length(); i++){
//            if (str.charAt(i)==' '){
//                str=str.substring(0,i)+str.substring(i+1);
//            }
//        }
//        return str;
//    }


//    static boolean isPalindrome (String s){
//       int start = 0;
//       int end = s.length()-1;
//
//        while (start <= end ){
//            if (s.charAt(start) != s.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }




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

}
