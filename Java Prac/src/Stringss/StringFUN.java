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

        // *********** DIFFRENT STRIP FUNCTIONS**********************
// stripLeading()

//        String s = "   qwer pathan       ";
//        s=s.stripLeading(); --> removes the leading spaces
//        System.out.println(s);

//        s=s.stripTrailing(); --> removes the trailing spaces
//        s=s.strip(); --> removes both leading & traling whitespaces

//        System.out.println(s);



        // Diffrence betweeen strip () and trim() and concat();

        //***********************DIFFRENT SPLIT FUNCTIONS *************************

        String s = "ZAID,PATHAN";


//******************************STRING BOOLEAN FUNCTIONS *************************
//        String s = "geeks for geeks ";

//        System.out.println(s.contains("AID")); --> matches the charachter ( specified sequence of char values) and return boolean value from the string
//        System.out.println(s.matches("geeks")); --> method checks if the entire string matches the given regular expression

        // regionMatches() --> checks for the subregion
//        String S = "geeks for geeks ";

//        System.out.println(s.regionMatches(8,S,0,5));
//        System.out.println(S.contentEquals("geeks"));

        // region match with boolean


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
