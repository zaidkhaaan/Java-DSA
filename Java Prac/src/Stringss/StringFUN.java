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

//        System.out.println(s.contains("AID")); --> matches the charachter ( specified sequence of char values)
//        and return boolean value from the string
//        System.out.println(s.matches("geeks")); --> method checks if the entire string matches the given regular expression

        // regionMatches() --> checks for the subregion
//        String S = "geeks for geeks ";

//        System.out.println(s.regionMatches(8,S,0,5));
//        System.out.println(S.contentEquals("geeks"));

        // region match with boolean

        /*
        Usage: regionMatches() is used to compare specific regions (substrings) within strings, allowing you to compare parts of one string with parts of another.
       Parameters: regionMatches() requires you to specify starting indices and lengths for both strings being compared, offering more control over which parts of the strings are compared.
       Return Value  Value: regionMatches() returns true or false based on whether the specified regions match exactly.
      contentEquals(): is used to check if the entire content of one string matches another string or CharSequence, and it returns a boolean value.

       Summary:
              regionMatches() compares specific regions of two strings.
              contentEquals() checks if the entire content of one string matches another CharSequence.
         */


        /*
        // it checks for charchters equence (words in a string)

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

        // checks for contents and the memory location the string


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






****************************STRING INTERGER BASED FUNCTION**************************************
// RETURN'S A NUMERIC VALUE




codePointAt(int index):

Returns the Unicode code point value at the specified index within the string.
If the index is within the valid range of the string, it returns the Unicode code point of the character at that index.
This method handles supplementary characters (those with code points above \uFFFF).

String str = "Hello";
int codePoint = str.codePointAt(1); // Returns the code point for 'e'



codePointBefore (int index)
Returns the Unicode code point value before the specified index within the string.
Similar to codePointAt, but it returns the code point of the character just before the specified index.

String str = "Hello";
int codePoint = str.codePointBefore(2); // Returns the code point for 'e'





codePointCount (int beginIndex, int endIndex);

Returns the number of Unicode code points in the specified range of the string.
The range is from beginIndex (inclusive) to endIndex (exclusive).

EXAMPLE:-

String str = "Hello";
int codePointCount = str.codePointCount(1, 4); // Returns 3 (for 'ell')



compareTo (String anotherString)
Compares two strings lexicographically.
Returns a negative integer, zero, or a positive integer as
the calling string is less than, equal to, or greater than anotherString.

String str1 = "hello";
String str2 = "world";
int result = str1.compareTo(str2); // Returns a negative value since "hello" is lexicographically less than "world"

Compares two strings lexicographically, ignoring case differences.
Returns a negative integer, zero, or a positive integer as
the calling string is lexicographically less than, equal to, or greater than str, ignoring case considerations.


compareToIgnoreCase (String str)
Compares two strings lexicographically, ignoring case differences.

Returns a negative integer, zero, or a positive integer as
the calling string is lexicographically less than, equal to, or
greater than str, ignoring case considerations.


String str1 = "Hello";
String str2 = "HELLO";
int result = str1.compareToIgnoreCase(str2); // Returns 0 since "Hello" is equal to "HELLO" ignoring case



hashCode ()
Returns a hash code value for the string.
The hash code is computed based on
the characters of the string and is used in hash-based data structures like Hashing.HashMap

String str = "Hello";
int hashCode = str.hashCode();



indexof (int ch)

Returns the index within the string of the first occurrence of the specified character (ch).
Returns -1 if the character does not occur in the string.

String str = "Hello";
int index = str.indexOf('e'); // Returns 1 (index of 'e' in "Hello")




index0f (String str)

Returns the index within the string of the first occurrence of the specified substring (str).
Returns -1 if the substring does not occur in the string

String str = "Hello";
int index = str.indexOf("lo"); // Returns 3 (index of "lo" in "Hello")


LastIndex0f(int ch)

Returns the index within the string of the last occurrence of the specified character (ch).
Searches backward from the end of the string.
Returns -1 if the character does not occur in the string.

String str = "Hello";
int index = str.lastIndexOf('l'); // Returns 3 (last index of 'l' in "Hello")


lastIndex0f (String str)
Returns the index within the string of the last occurrence of the specified substring (str).
Searches backward from the end of the string.
Returns -1 if the substring does not occur in the string

String str = "Hello";
int index = str.lastIndexOf("l"); // Returns 3 (last index of "l" in "Hello")


lastIndexof (int ch, int fromIndex)
Returns the index within the string of the last occurrence of the specified character (ch), searching backward starting at the specified index (fromIndex).
Returns -1 if the character does not occur in the string from the specified index.

String str = "Hello";
int index = str.lastIndexOf('l', 2); // Returns 2 (last index of 'l' before index 2 in "Hello")


LastIndex0f (String str, int fromindex)

Returns the index within the string of the last occurrence of the specified substring (str), searching backward starting at the specified index (fromIndex).
Returns -1 if the substring does not occur in the string from the specified index.

String str = "Hello";
int index = str.lastIndexOf("l", 3); // Returns 3 (last index of "l" before index 3 in "Hello")


startswith (String prefix)
Checks whether the string starts with the specified prefix (prefix).
Returns true if the string starts with the prefix; otherwise, false.

String str = "Hello";
boolean startsWith = str.startsWith("He"); // Returns true














**********************************CHARACHTER CLASS FUNCTION********************************
    the Character class is typically used in programming languages like Java
    to represent and manipulate single characters


Character.isDigit(char ch)
Description: Determines if the specified character is a digit.
Example: Character.isDigit('5') returns true.


Character.isLetter(char ch)
Description: Determines if the specified character is a letter.
Example: Character.isLetter('a') returns true.



Character.isLetterOrDigit(char ch)
Description: Determines if the specified character is a letter or a digit.
Example: Character.isLetterOrDigit('a') returns true.


Character.isWhitespace(char ch)
Description: Determines if the specified character is a whitespace character.
Example: Character.isWhitespace(' ') returns true.



Character.isUpperCase(char ch)
Description: Determines if the specified character is an uppercase letter.
Example: Character.isUpperCase('A') returns true


Character.isLowerCase(char ch)
Description: Determines if the specified character is a lowercase letter.
Example: Character.isLowerCase('a') returns true.



Character.toUpperCase(char ch)
Description: Converts the specified character to uppercase.
Example: Character.toUpperCase('a') returns 'A'.




Character.toLowerCase(char ch)
Description: Converts the specified character to lowercase.
Example: Character.toLowerCase('A') returns 'a'.


Character.isSpaceChar(char ch)
Description: Determines if the specified character is a Unicode space character.
Example: Character.isSpaceChar(' ') returns true.



Character.isJavaIdentifierStart(char ch)
Description: Determines if the specified character is permissible as the first character in a Java identifier.
Example: Character.isJavaIdentifierStart('A') returns true.


Character.isJavaIdentifierPart(char ch)
Description: Determines if the specified character is permissible as part of a Java identifier.
Example: Character.isJavaIdentifierPart('1') returns true.



Character.isDefined(char ch)
Description: Determines if the specified character is defined in Unicode.
Example: Character.isDefined('A') returns true.



Character.isSurrogate(char ch)
Description: Determines if the specified character is a Unicode surrogate code unit.
Example: Character.isSurrogate('\uD800') returns true.



Character.getType(char ch)
Description: Returns a value indicating the general category of the character.
Example: Character.getType('A') returns Character.UPPERCASE_LETTER.


Character.toString(char ch)
Description: Returns a String object representing the specified character.
Example: Character.toString('A') returns "A".



  Character.getNumericValue







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

        //**************************** STRING CLASS FUNCTION *****************************
        // Direct string class function (String.____())
/*
        String.valueOf();
        The String.valueOf() method is used to convert different types of data into their string representation.
         It has several overloaded versions for different data types such as int, long, char, char[], boolean, etc.
         This is particularly useful when you want to convert other types of objects into strings

         EXAMPLE:-
         int num = 100;
        String str = String.valueOf(num);  // str becomes "100"

          char ch = 'A';
          String str2 = String.valueOf(ch);  // str2 becomes "A"

           boolean bool = true;
           String str3 = String.valueOf(bool);  // str3 becomes "true"



        String.copyValueOf();
        The String.copyValueOf() method is similar to String.valueOf() when dealing with character arrays.
        It returns a String that represents the character sequence in the specified array.
        There are two versions: one that takes the entire array and one that takes a subarray (with specified offset and count).

        char[] data = {'h', 'e', 'l', 'l', 'o'};
        String str = String.copyValueOf(data);  // str becomes "hello"

        String str2 = String.copyValueOf(data, 1, 3);  // str2 becomes "ell"



        String.format();
        The String.format() method returns a formatted string using
        the specified format string and arguments.
        It works similarly to the printf function in C. Y
        ou can use format specifiers to include variables in the string in a formatted way.

        String name = "John";
        int age = 30;
        String formattedString = String.format("My name is %s and I am %d years old.", name, age);
        // formattedString becomes "My name is John and I am 30 years old."

          double value = 12.34567;
          String formattedString2 = String.format("Value: %.2f", value);
          // formattedString2 becomes "Value: 12.35"





        String.join()

        The String.join() method joins multiple strings into a single string with a specified delimiter.
        It is useful for concatenating strings with a delimiter between each part.

        EXAMPLE;-
        String result = String.join("-", "2024", "07", "23");
        // result becomes "2024-07-23"

         List<String> items = Arrays.asList("apple", "banana", "cherry");
          String result2 = String.join(", ", items);
          // result2 becomes "apple, banana, cherry"

*/


        //****************************** String subsequence **************************


    }
    // NOTE :- " " are used for string literals  & ' ' are used for chrachter literals

    // STRING BUILDER FUNCTIONS
/*
  StringBuilder allows you to modify the sequence without creating new objects

  Diffrent functions:-

  append(String str):- Appends the specified string to this character sequence.
  insert(int offset, String str):-Inserts the specified string at the specified position.
  replace(int start, int end, String str):-Replaces the characters in a substring of this sequence with characters in the specified string.
  delete(int start, int end):-Removes the characters in a substring of this sequence.
  toString():- Converts the StringBuilder to a String

 */



    // STRING BUFFER FUNCTIONS



    //parseInt

    /*
      Method Signatures
      public static int parseInt(String s)

      Parameters: String s - the string to be parsed.
      Returns: The integer value represented by the string argument.
      Example: Integer.parseInt("123") returns 123.
      public static int parseInt(String s, int radix)

      Parameters
      String s - the string to be parsed.
      int radix - the radix to be used while parsing.
      Returns: The integer value represented by the string argument in the specified radix.
      Example: Integer.parseInt("1010", 2) returns 10 (binary to decimal conversion).


     EXAMPLE:-
        String str1 = "123";
        String str2 = "1010";

        // Parse with default radix (decimal)
        int num1 = Integer.parseInt(str1);
        System.out.println("Parsed number (decimal): " + num1); // Output: 123

        // Parse with specified radix (binary)
        int num2 = Integer.parseInt(str2, 2);
        System.out.println("Parsed number (binary): " + num2); // Output: 10

        // Handling NumberFormatException
        try {
            int num3 = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }




     */


    // char indexing appraoch



    // PLACE HOLDER IN STRINGS



}
