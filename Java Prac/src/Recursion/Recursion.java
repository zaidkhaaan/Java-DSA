package Recursion;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int f = factorial(n);
//        int sum = NumSum(n);
//        System.out.println(f);
//        System.out.println(sum);
//        printDecreasing(n);

//        System.out.println(addDigits1(n));
//        System.out.println(addDigits2(n));

//        System.out.println(palindromeCheck("zaid"));


//        int arr[] = {1,2,3,4,5};
//        System.out.println(sumArrayRecursive(arr,0));
//        System.out.println(arraySum(arr));

        int n = 29;
//        System.out.println(Math.sqrt(n));
//        System.out.println(checkPrime(n));

    }
    static int fib( int n ){
        if (n==0) return 0;
        if (n==1) return 1;

        return  fib(n-1)+fib(n-2);
    }


        // defining the base test case
//        if (n<=1){
//            return false;
//        }
//        return prime(n,2);
//    }

    static boolean prime(int num , int x){
        if (x  > Math.sqrt(num)){
            return true;
        }
        if (num % x ==0){
            return false;
        }
        return prime(num ,x+1);
    }

//    static void printDecreasing(int n){
//        if (n==0){
//            return;
//        }
//        System.out.println(n);
//
//        // AREA ABOVE RECURSIVE FUNCTION ALL THE CODE ABOVE THE FUNCTION
//        // WILL RUN WHILE FUNCTION IS CLIMBING UP
//
//        printDecreasing(n-1);
//        // AREA BELOW RECURSIVE FUNCTION ALL THE CODE BELOW THE FUNCTION
//        // WILL RUN WHILE FUNCTION IS GOING DOWN
//        // PUSHING OUT WHATEVER IS IN THE CALL STACK
//
//
//        System.out.println(n);
//    }


    static int factorial ( int n ){
        if (n==1){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n*fnm1;

        return fn;
    }
    static  int NumSum(int n){
        if ( n==0){
            return 0;
        }
        int sum = NumSum(n-1);
        int add = n+sum;

        return add;
    }
    static int addDigits2(int num){
//        if (n == 0) {
//            return 0; // Base case: when n is 0, return 0
//        } else {
//            int lastDigit = n % 10; // Get the last digit
//            int remainingNumber = n / 10; // Remove the last digit
//            return lastDigit + Addigit(remainingNumber); // Recursive call
//        }

        if(num < 10){
            return num;
        }

        int sum = 0;
        while (num>0){
            sum += num%10;
            num/=10;
        }
        return addDigits2(sum);
    }

    static  int addDigits1(int num) {
        if(num < 10){
            return num;
        }
        if (num == 0) {
            return 0; // Base case: when n is 0, return 0
        } else {
            if(num < 10){
                return num;
            }
            int lastDigit = num % 10; // Get the last digit
            int remainingNumber = num / 10; // Remove the last digit
            return lastDigit + addDigits1(remainingNumber); // Recursive call
        }
    }


    static boolean palindromeCheck(String s){
        return isPalindrome(s,0, s.length()-1);
    }


    static boolean isPalindrome(String s , int left , int right){
        if (left >= right){
            return true;
        }
        if (s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindrome(s,left+1,right-1);
    }

//    static int AddArray(int [] nums){
//        int sum =0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += AddArray(nums[i]);
//        }
//        return sum;
//
//    }


    static int sumArrayRecursive(int[] arr, int index) {
        if (index == arr.length) {
            return 0; // Base case: empty array
        } else {
            int currentElement = arr[index];
            int sumOfRemaining = sumArrayRecursive(arr, index + 1); // Recursive call
            return currentElement + sumOfRemaining;
        }
    }

    static int arraySum(int[] nums) {
        // Start from index 0
        return sum(nums, 0);
    }

    static int sum(int[] nums, int left) {
        // Base case: out of bounds
        if (left >= nums.length) {
            return 0;
        }
        // Add current element and recurse
        return nums[left] + sum(nums, left + 1);
    }
    }
