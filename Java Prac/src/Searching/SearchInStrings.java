package Searching;

import java.util.Arrays;

public class SearchInStrings {

    public static void main(String[] args) {
        String str = "zaid";
        char target = 'i';

      //  System.out.println(LinearSearchString(str,target));
      //  System.out.println(LinearSearchString(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));

    }

    static boolean  LinearSearchString2 (String str , char target){

        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;

    }

    static int  LinearSearchString (String str , char target){

        if (str.isEmpty()){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
          //  char c = str.charAt(i);

            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;

    }
}
