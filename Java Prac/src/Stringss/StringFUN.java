package Stringss;

public class StringFUN {
    public static void main(String[] args) {

        // SUBSTRING METHOD IS USED TO PRINT SPECIFIC INDEX OF THE STRING

//        String s = "ZAID";
//
//        s=s.substring(0); // PASS THE STARTING INDEX
//        System.out.println(s);

        // SUBSTRING METHOD USED TP PRINT START AND END CHARACHTER OF AN GIVEN STRING

//        s=s.substring(0,s.length());  // PASS START & END INDEX BOTH
//        WHILE PASSING BOTH THE VALUE IT PRINTS THE CHARCHTER -1 FROM THE END
//        System.out.println(s);


//************** BASIC PROGRAM TO PRINT ALL SUBSTRING IN A STRING ***************************

//        for (int i = 0; i  < s.length(); i++){
//            for (int j = i; j <= s.length() ; j++) {
//
//                System.out.println(s.substring(i,j));
//            }
//        }

//*************************** trim () method is used to trim the white spaces in a string*******
        // used to trail the leading and trailing whitespaces in an string

//        String S = "    qwer     ";
//        System.out.println(S);
//        S=S.trim();
//        System.out.println(S);


//******************** stripIndent() Method -->  used to remove the "Incident" White spaces in an string *******
        // stripIndent() is only used in java version above 12

        /*
        The stripIndent() method in Java is used to remove incidental leading whitespace from every line in a multiline string.
         This method is especially useful when dealing with multiline strings that have been indented for readability in the code
         but where the leading whitespace is not desired in the actual string content.




         */

        // *********** DIFFRENT STRIP FUNCTIONS**********************
//        stripLeading()

//        String s = "   qwer pathan       ";
//        s=s.stripLeading(); --> removes the leading spaces
//        System.out.println(s);

//        s=s.stripTrailing(); --> removes the trailing spaces

//        s=s.strip(); --> removes both leading & traling whitespaces

//        System.out.println(s);



        // Diffrence betweeen strip () and trim() and concat();

        /*
        Strip() :- Removes leading and trailing whitespace from a string
        Behavior: It uses Unicode-aware whitespace removal.

        trim():- Purpose: Removes leading and trailing whitespace from a string.
        Behavior: It removes only the ASCII whitespace characters (space, tab, etc.),
        not the entire set of Unicode whitespace characters.


        key diffrence
        trip() vs. trim(): Both methods remove leading and trailing whitespace,
        but strip() handles all Unicode whitespace characters,
        while trim() only removes ASCII whitespace.

        concat(): Purpose: Concatenates the specified string to the end of the current string.
        Behavior: It returns a new string that is the concatenation of
        the current string and the specified string.







         */

        //***********************DIFFRENT SPLIT FUNCTIONS *************************

        String s = "ZAID,PATHAN";
//        s=s.split();
        /*
        split(String regex)
         Purpose: Splits the string around matches of the given regular expression (regex).

         regex: The delimiting regular expression.

         Returns: An array of strings computed by splitting the string around matches of
         the given regex.

         String str = "apple,banana,cherry";
         String[] fruits = str.split(",");
          for (String fruit : fruits) {
            System.out.println(fruit)
          }

          STRING WITH LIMIT

          split(String regex, int limit)
          Purpose: Splits the string around matches of the given regular expression (regex),
          with a limit on the number of resulting substrings

          regex: The delimiting regular expression.
          limit: The maximum number of substrings to return. If limit is positive, the result array will contain at most limit elements,
          and the last element will contain all remaining parts of the string.

          If limit is zero,
          the result will be the same as // if no limit is provided// , but trailing empty strings will be discarded.

          If limit is negative,
          the result array can have any length, and trailing empty strings will not be discarded.




         */


//******************************STRING BOOLEAN FUNCTIONS *************************
//        String s = "geeks for geeks ";

//        System.out.println(s.contains("AID")); --> matches the charachter ( specified sequence of char values) and return boolean value from the string
//        System.out.println(s.matches("geeks")); --> method checks if the entire string matches the given regular expression

        // regionMatches() --> checks for the subregion
//        String S = "geeks for geeks ";

//        System.out.println(s.regionMatches(8,S,0,5));
//        System.out.println(S.contentEquals("geeks"));

        // region match with boolean


        /*
        boolean contains(CharSequence s)
        Purpose: Checks if the string contains the specified sequence of char values.

        EXAMPLE:-
        String str = "Hello, World!";
        System.out.println(str.contains("World")); // true
        System.out.println(str.contains("world")); // false


        boolean endsWith(String suffix)
        Purpose: Checks if the string ends with the specified suffix.

        EXAMPLE:-
        String str = "Hello, World!";
        System.out.println(str.endsWith("World!")); // true
        System.out.println(str.endsWith("Hello"));  // false


        boolean equals(Object anObject)
        Purpose: Compares this string to the specified object.
        The result is true if and only if the argument is not null and is a
        String object that represents the same sequence of characters as this object.

        EXAMPLE :-
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true

        boolean equalsIgnoreCase(String anotherString)
        Purpose: Compares this string to another string, ignoring case considerations.

        EXAMPLE:-
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        boolean isEmpty()
        Purpose: Checks if the string is empty (length is 0).

        EXAMPLE:-
        String str1 = "";
        String str2 = "Hello";
        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false


        boolean isBlank()
        Purpose: Checks if the string is empty or contains only white space codepoints
        EXAMPLE:-
        String str1 = "";
        String str2 = "   ";
        String str3 = "Hello";
        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true
        System.out.println(str3.isBlank()); // false


        boolean matches(String regex)
        Purpose: Tells whether or not this string matches the given regular expression.
        EXAMPLE:-
        String str = "12345";
        System.out.println(str.matches("\\d+")); // true (matches one or more digits)
        System.out.println(str.matches("\\D+")); // false (matches one or more non-digits)

        Regular Expression: \\d+
        \\d: This part of the regular expression represents any digit. It is a shorthand character class in regular expressions that matches any single digit from 0 to 9. The double backslash \\ is used because backslashes are also used as escape characters in Java strings, so you need to escape the backslash itself.

       Example: \\d matches 1, 2, 3, etc.
       +: This is a quantifier that means "one or more times". It specifies that the preceding character or group (in this case, \\d) should appear at least once but can appear multiple times.

       Example: \\d+ matches 1, 12, 123, 1234, etc.





       public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)

       The regionMatches method checks if a specific part (or region) of one string matches a specific part of another string.
       It allows you to compare substrings from two different strings.

       Parameters
       ignoreCase: A boolean value. If true, the method ignores case differences when comparing characters. If false, the method considers case differences.
       toffset: The starting index in the first string (the string on which the method is called) where the comparison begins.
       other: The second string to be compared with the first string.
       ooffset: The starting index in the second string (other) where the comparison begins.
       len: The number of characters to compare in both strings.










        boolean startsWith(String prefix)
        Purpose: Checks if the string starts with the specified prefix.

        EXAMPLE:-
        String str = "Hello, World!";
        System.out.println(str.startsWith("Hello")); // true
        System.out.println(str.startsWith("World")); // false


        boolean startsWith(String prefix, int toffset)
        Purpose: Checks if the substring of this string starting
        at the specified index starts with the specified prefix.

        EXAMPLE:-
        String str = "Hello, World!";
        System.out.println(str.startsWith("World", 7)); // true


        boolean contentEquals(CharSequence cs)
        Purpose: Compares this string to the specified CharSequence.
        The result is true if and only if this string represents
        the same sequence of char values as the specified sequence.

        Example:-
        String str = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(str.contentEquals(sb)); // true


        boolean contentEquals(StringBuffer sb)
        Purpose: Compares this string to the specified StringBuffer.
        The result is true if and only if this string represents
        the same sequence of char values as the specified StringBuffer.

        EXAMPLE:-
        String str = "Hello";
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(str.contentEquals(sb)); // true

        boolean equalsIgnoreCase(String anotherString)
        Purpose: Compares this string to another string,
         ignoring case considerations.

         EXAMPLE:-
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equalsIgnoreCase(str2)); // true































         */



//****************************** REPLACE FUNCTION IN STRINGS **********************
        // replace vs replaceall function in java

        // replace works on
        // It can take either a pair of char or a pair of CharSequence (like String) arguments


        // replaceALL works on
        //It takes a regex string as the first argument and
        // the replacement string as the second argument.

        /*

        EXAMPLE
        String original = "foo";
        String replaced = original.replace('o', 'a'); // "faa"
        String replacedAll = original.replaceAll("o", "a"); // "faa"

         */

        //**************************** String.valueOf(str) *****************************
        // Direct string class function (String.____())



        //****************************** String subsequence **************************


    }
    // NOTE :- " " are used for string literals  & ' ' are used for chrachter literals

    // STRING BUILDER FUNCTIONS

    // STRING BUFFER FUNCTIONS
    // Charahter Class

    //parseInt

    // Character.getNumericValue


    // char indexing appraoch





}
