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




        /*
        3rd approach convert the string to char array  and use sort function
        and comapre it with original string
         */



        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr1 = str.toCharArray();
        char[] arr2 = str.toCharArray();

        Arrays.sort(arr2);

        if (arr2.equals(arr1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Non Palindrome");
        }





    }

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
