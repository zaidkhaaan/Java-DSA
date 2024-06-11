package Searching.Binarysearch;

public class SmallestLetter {
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {

        int letters [] = {'c','f','j'};
        char ch = 'a';
         int target = ch-0;
        System.out.println(SmallestLetter(letters , target));
    }

    static int SmallestLetter (int letters[] , int target){
        int start = 0;
        int end = letters.length-1;

        while (start <= end){
            int mid = start+(end-start)/2;

            if (letters[mid] > target) {
                end=mid-1;

            }
            else {
                start=mid+1;
            }
        }
        return letters[start % letters.length];


    }
}
