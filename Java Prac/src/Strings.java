public class Strings {

    // tcs nqt sheet section by striver

    /*
   before understanding string functions let us study important string topics such as
   string function & string builder , string to array function , string and char functions
    sheets. char array

     */
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = n; i <= n2; i++) {
            int temp = i;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            if (reverse == i) {
                System.out.println(i + " is a palindrome");
            } else {
                System.out.println(i + " is not a palindrome");
            }

         */








        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp2 = num;
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            int fact = 1;
            for (int i = 1; i <= temp; i++) {
                fact *= i;
            }
            sum += fact;
            num = num / 10;
        }
        if (temp2 == sum) {
            System.out.println("strong number");
        } else {
            System.out.println("not strong number");
        }

         */







        /*
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number:");
                int num = sc.nextInt();
                int square = num * num;
                int temp = num;
                while (num > 0) {
                    if (num % 10 != square % 10) {
                        System.out.println("Not Automorphic");
                        return;
                    }
                    num /= 10;
                    square /= 10;
                }
                System.out.println("Automorphic");

/*


         }
         */




        /*
        String str = "take u forward";
        System.out.println("String after removing the vowels \n" + RemoveVowels(str));

         */


        /*
        String str = "take u forward";
        System.out.println("String after removing the vowels \n"+RemoveVowels(str));
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


    }
}



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






