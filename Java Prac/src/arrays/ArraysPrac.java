package arrays;

import java.util.*;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrac {
    public static void main(String[] args) {
//        // Initialize an array
//        int[] arr = {5, 6, 7, 8, 9};
//
//        // Print the original array
//        System.out.println("Original array:");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        // Call the reverse method
//        reverse(arr);
//
//        // Print the reversed array
//        System.out.println("Reversed array:");
//        for (int i : arr) {
//            System.out.print(i + " ");

        /*
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k] +"\t");
                }
                System.out.println();
            }
        }

         */


        /*

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int [] arr = new int [a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int limit = (int)Math.pow(2 , arr.length);


        for (int i = 0; i < limit; i++) {
            // convert i to binary and use 0's and 1's
            String set ="";
            int temp =i;


            for (int j = arr.length-1 ; j >=0 ; j--)
            //for (int j = 0; j < arr.length; j++)
            {
                int r = temp % 2;
                temp = temp / 2;

                if(r == 0){
                    set ="-\t"+ set;
                }else {
                    set= arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }



         */


        // Q1 find smallest number in an array


        // stivers approach

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        arrays.Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

         */

        // My approach






        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int low =arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (low>arr[i]) {
                low=arr[i];
            }


        }
        System.out.println(low);


         */
/*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arrays.Arrays.asList(arr);
         //int n1 = arr.asList();
        System.out.println(arr);

 */


        // studying the methods in Array Class
        //  int intArr[] = { 10, 20, 15, 22, 35 };


        // exp:1
        // To convert the elements as List
        /*
        System.out.println("Integer Array as List: "
                + arrays.Arrays.asList(intArr));
         */

        /* EXP :- 2
        String[] array = new String[] {"A", "B", "C", "D"};
        List<String> list = arrays.Arrays.asList(array);
        System.out.println("The list is: " + list);
         */

        /*
        String arr [] = {"a","z","b","e","c"};

        arrays.Arrays.sort(arr);

         */


        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
         */
        // System.out.println(arrays.Arrays.toString(arr));

        /*
        int [] Intarr = { 10, 20, 15, 22, 35 };

        arrays.Arrays.sort(Intarr);

        int intkey = 35;

        // Print the key and corresponding index
        System.out.println(intkey + " found at index = "  + arrays.Arrays.binarySearch(Intarr ,intkey));
         */


        /*
        int  [] intArr1 = { 10, 20, 15, 22, 35 };

        arrays.Arrays.sort(intArr1);

        int intKey = 22;

        System.out.println(intKey + " found at index = " + arrays.Arrays.binarySearch(intArr1, 0, 4, intKey));


         */

        // Get the Array

        /*
        int array1 [] = { 1,2,3,4,5,6,7,8,9 ,10};

        // Get the second Array
        int array2 [] = { 10, 15, 22 ,100,14,34,56,65,32};

        // To compare both arrays
        System.out.println("Integer arrays.Arrays on comparison: "
                + arrays.Arrays.compare(array1, array2));

         */


        /*
        int zaid [] = { 10, 20, 15, 22, 35 };

        // To print the elements in one line
        System.out.println("Integer Array: "
                + arrays.Arrays.toString(zaid));

        System.out.println("\nNew arrays.Arrays by copyOf:\n");

        System.out.println("Integer Array: "
                + arrays.Arrays.toString(
                arrays.Arrays.copyOf(zaid, 10)));
         */

        // Get the arrays.Arrays

        /*
        int zaid1[][] = { { 10, 20, 15, 22, 35 } };

        // Get the second arrays.Arrays
        int zaid2[][] = { { 10, 20, 15,22,35 } };

        // To compare both arrays
        System.out.println("Integer arrays.Arrays on comparison: "
                + arrays.Arrays.deepEquals(zaid1, zaid2));
         */

        /*
        int[][] a1 = {{10, 20}, {40, 50}, {60, 70}};
        int[][] a2 = {{30, 20}, {10, 0}, {60, 80}};
        int[][] a3 = {{10, 20}, {40, 50}, {60, 70}};

        System.out.println("Check if a1 is equal to a2: " + arrays.Arrays.deepEquals(a1, a2));
        System.out.println("Check if a2 is equal to a3: " + arrays.Arrays.deepEquals(a2, a3));
        System.out.println("Check if a1 is equal to a3: " + arrays.Arrays.deepEquals(a1, a3));

         */

        /*
        int intArr[][] = { { 10, 20, 15, 22, 35 } };

        // To get the dep hashCode of the arrays
        System.out.println("Integer Array: "
                + arrays.Arrays.deepHashCode(intArr));

         */


        /*
        int intArr1234[][] = { { 10, 20, 15, 22, 35 } };

        // To get the dep hashCode of the arrays
        System.out.println("Integer Array: "
                + arrays.Arrays.deepHashCode(intArr1234));
         */

        /*
        // Initializing an object array
        Object[] ob = { "tuts", "point" };

        // deepToString for object ob
        System.out.println("Deep String version: " + arrays.Arrays.deepToString(ob));
         */


        /*
        int intArr123[] = { 10, 20, 15, 22, 35 };

        // Get the second arrays.Arrays
        int intArr321[] = { 10, 20,15,22,35};

        // To compare both arrays
        System.out.println("Integer arrays.Arrays on comparison: "
                + arrays.Arrays.equals(intArr123, intArr321));
         */


        /*
        int intArr[] = { 10, 20, 15, 22, 35 };

        int intKey = 22;

        arrays.Arrays.fill(intArr, intKey);

        // To fill the arrays
        System.out.println("Integer Array on filling: "
                + arrays.Arrays.toString(intArr));

         */


        /*

        int intArr[] = { 10, 20, 15, 22, 35 };

        // Get the second arrays.Arrays
        int intArr1[] = { 10, 20, 22 };

        // To compare both arrays
        System.out.println("The element mismatched at index: "
                + arrays.Arrays.mismatch(intArr, intArr1));

         */

        /*

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Spliterator.OfInt spliterator = arrays.Arrays.spliterator(array);

        // Use tryAdvance() to print elements

        while(spliterator.tryAdvance((IntConsumer) (n) -> System.out.println(n)));


         */



        /*
        String[] array = {"apple", "banana", "cherry"};

        Stream<String> stream = arrays.Arrays.stream(array);
        stream.forEach(System.out::println);

         */


        // System.out.println(str.length());


        /*
int [] arr = {10,12,10,14,15,10,17};
int value = 10;
int lastidx = -1;

        for (int i = 0; i < arr.length  ; i++) {
            if (arr[i] == value){
                lastidx=i;
            }
        }
        System.out.println(lastidx);


         */

        /*
        int arr[] = {1, 5, 3,4};
        int idx = 4;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == idx) {
                ans = i; // main logic which i missed
                break;
            }
        }
        System.out.println(ans);

         */


        /*
        int arr [] ={1,5,3};

        int ans= 0;

        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>ans){
               ans = arr[i];
           }

        }
        System.out.println(ans);
        }

         */

        /*
        int arr [] ={5,6,5,3,5,4};
        int value = 7;
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value){
                count=i;
            }
        }

        System.out.println(count);

         */


        /*

        // count the number of elemnts strictly greater than x

        double arr [] = {5.6,6.2,6.1,7,6.0,5.8,5.9,6};
        int x = 6;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x){
                count++;
                //System.out.println(arr[i]);
            }
        }
        System.out.println(count);

         */


        /*
        int arr [] = {1,2,2,6,8};
        int first =arr[0];
        int second = arr[1];
        boolean check = true;


        for (int i = 0; i < arr.length; i++) {
            if (first<second){
                first++;
                second++;
                check=true;

            }else{
               check=false;
                break;
            }
        }
        System.out.println(check);


        // current element should be less than previous element

         */

        /*
        Scanner sc = new Scanner(System.in);
        int arsiz = sc.nextInt();

        int [] arr = new int[arsiz];
        boolean check = true;

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] < arr[i-1]){
                // current element less than the previous element
                check = false;
                break;
            }
        }
        System.out.println(check);

         */


        // BING AI CODE two sum

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Sum");
        int target = sc.nextInt();

        int[] result = pairSum(arr, target);

        if (result != null) {
            System.out.println("Pair found at index " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found");
        }

        its function


        //    static int[] pairSum(int[] arr, int target) {
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

         */



        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Sum");
        int target = sc.nextInt();

        System.out.println((pairSum(arr, target)));

IT's Function
 static int pairSum(int arr[], int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++)
        // To pick the first element
        {
            for (int j = i + 1; j < n; j++)
                // Traverses the second number

                for (int k = i + 2; k < n; k++) {
                    {
                        if (arr[i] + arr[j] + arr[k] == target) {
                            ans++;
                         // return new int[]{i, j, k};
                        }
                    }
                }



        }
        return ans ;
    }
         */





        /*
to count the number of triplets in an array that sum up to a given target.
BING AI CODE TO RETURN MORE THAN 1 INDEX
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Sum");
        int target = sc.nextInt();


        ArrayList<int[]> results = pairSum(arr, target);


     // ArrayList<Type> arrayList = new ArrayList<>();




        if (results.size() > 0) {
            for (int[] result : results) {
                System.out.println(Arrays.toString(result));
            }
        } else {
            System.out.println("No triplets found");
        }

         */


        /*
         static ArrayList<int[]> pairSum(int[] arr, int target) {
        int n = arr.length;
        ArrayList<int[]> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        results.add(new int[]{i, j, k});
                    }
                }
            }
        }
        return results;
    }
         */


        // ARRAY MANIPULATION

        // Find the unique number in a given array where all the element are being repeated twice

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println((findUniq(arr)));

        Function of the code
        static int findUniq(int arr[]) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++)
        // To pick the first element
        {
            for (int j = i + 1; j < n; j++)
                // Traverses the second number
                if (arr[i] == arr[j]) {
                    arr[i]=-1;
                    arr[j] = -1;
                }



        }

        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

         */


//        int arr [] = {5,4,1,6,2,9};
//        int max = arr[0];
//        int min = arr[0];
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);


//        int arr1 [] = {10,9,23,43,59,8,-1,-2};
//        int min = arr1[0];
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (min > arr1[i]){
//                min=arr1[i];
//
//            }
//        }
//        System.out.println(min);


        // Find the second largest element in the given array

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findSecondMax(arr));


        IT'S FUNCTION

         static int findMax(int[] arr) {
        int max = arr[0];
       // int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMax (int [] arr){

        int max = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findMax(arr);
        return secondmax;

         */


        // Finfd the first repeating element in the array

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(find1stelem(arr));



    // It's Function
    static int find1stelem(int[] arr){
        int n1 = arr.length;
       // int store =0;
        for (int i = 0; i < n1; i++) {
            for (int j = i+1; j < n1; j++)
            {
                if (arr[i]==arr[j]){
                  //  store=arr[i];
                   // break;
                    return arr[i];
                }
            }
        }
        return -1;

         */


        // Reverse two number

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        // Using temp function
  //  int a = 10;
 //   int b = 20;
//    int temp;
//
//    temp = a;
//    a=b;
//    b=temp;

// using sum & diffrence method

        a= a+b;
        b = a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);


         */

        // Reverse an array using another array


//        int [] arr = {1,2,3,4,5};
//        int [] ans = reverseArray(arr);
//        printArray(ans);

        //Its's Function

          /*
    static int [] reverseArray(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;

        // using for loop
        for (int i = n-1; i >= 0 ; i--) {
            ans[j]= arr[i];
            j++;
        }


//        Using while loop
//        int i = n-1; j=0;
//        while (i>=0){
//        ans[j++] = arr[i--];
//

        return ans;
    }




    static void printArray (int [] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    }

     */

        // reversing array using two pointer method in inplace

        /*
        int arr [] ={1,2,3,4,5};

        reverseArray(arr);
        printArray(arr);

     // its function to reverse


    static void reverseArray(int [] arr){
        int i = 0;
        int j = arr.length-1;

        while (i < j){
            swapinArray(arr,i,j);
            i++;
            j--;

        }

    }

   // its function to print

    static void swapinArray(int [] arr , int i , int j){

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;

    }

    static void printArray (int [] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

         */


        // After Rotation with kth element using another array with new space
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K:");

        int k = sc.nextInt();

        int ans [] = rotate(arr,k);

        System.out.println("AFter ROtation");
        printArray(ans);

    }

         It's Function


    static int [] rotate (int [] arr , int k){
        int n = arr.length;
        k = k%n;

        int [] ans = new int [n];
        int j = 0;

        for (int i = n-k; i <n ; i++) {
            ans[j]=arr[i];
            j++;
        }

        for (int i = 0; i < n-k ; i++) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
    print function
    static void printArray (int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



         */


        // Rotation of array by Kth steps usinf the same array (In-place)


        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K:");

        int k = sc.nextInt();

        rotateInPlace(arr,k);

        System.out.println("AFter ROtation");
        printArray(arr);

    }

    static void rotateInPlace(int [] arr , int k){
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int [] arr , int i , int j){
//        int i = 0;
//        int j = arr.length-1;

        while (i < j){
            swap(arr,i,j);
            i++;
            j--;

        }

    }

    static void swap(int [] arr , int i , int j){

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;

    }

    static void printArray (int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

         */


        // check the number is present in array or not

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();

        int [] arr = new int[n];


        System.out.println("Enter" +n+ "elements");

        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }


        int[] freq = makeFrequency(arr);

        System.out.println("Enter the number of queries");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter number to be searched");
            int x = sc.nextInt();

            if (freq[x] > 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            q--;
        }
    }

    static int[] makeFrequency(int[] arr){
        int [] freq = new int[100005];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;

        }
        return freq;


         */


        // sort the array consisting of 0's and 1's done using 2 traversal


        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        printArray(arr);
        zerosandones2(arr);
        System.out.println("Sorted Array");
        printArray(arr);



    static void zerosandones(int arr [] ){
        int n = arr.length;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i]==0){
                zeros++;

            }
        }
        // 0 to zeroes -1 : zeros to n-1 : 1
        for (int i = 0; i < n; i++) {
            if ( i < zeros){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
    }

     */


        // sort an array by parity


    /*
    static void zerosandones2(int arr []){
        int n = arr.length;
        int  left = 0; // first pointer
        int right = n-1; // second pointer

        while (left < right) {

            if (arr[left] % 2 != 0 && arr[right] % 2 ==  0)
                // left checks if the number is odd
                // right checks if the number is even
                // if both condition true we swap it
            {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2== 0){
                left++;
                // if the left has already an even number just increase the left counter
            }

            if (arr[right] %2 != 0 ){
                right--;
                // if the right has the odd counter just decrease the counter
            }
        }
    }
    static void swap(int [] arr , int i , int j){

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;

    }

    static void printArray (int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

     */

        // sorting the element with squares

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        printArray(arr);
      int ans [] =  sortsquares(arr);
        // reverse(arr);
  //      reverse(ans,0, arr.length-1);
        System.out.println("Sorted Array");
        printArray(ans);

    }

    static int [] sortsquares(int [] arr ){
        int n = arr.length;
        int left = 0 , right =n-1;
        int ans [] = new int[n];
        int k =n-1;

        while (left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k]=arr[left] * arr [left];
                left++;
                k--;
            } else {
                ans[k] = arr[right]*arr[right];
                right--;
                k--;

            }
        }
        return ans;

    }


    static void reverse(int [] arr , int i , int j){
//        int i = 0;
//        int j = arr.length-1;

        while (i < j){
            swap(arr,i,j);
            i++;
            j--;

        }

    }

    static void swap(int [] arr , int i , int j){

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;

    }
    static void printArray (int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


         */


        // prefix sum & running sum array using another array
        // doubt



        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        int[] pref = makePrefixSumArray(arr);
        printArray(pref);
    }

    static void printArray (int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static  int [] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int [] pref = new int [n];
        pref[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pref[i]=pref[i-1]+arr[i];
        }

        return pref;
    }

         */

        // prefix array or running sum array using inplace


        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        int[] pref = makePrefixSumArray(arr);
        printArray(pref);
    }

    static void printArray (int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static  int [] makePrefixSumArray(int[] arr){
        int n = arr.length;

        // done using prefix another array
//        int [] pref = new int [n];
//        pref[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i];
            // done using same array
        }

        return arr;

         */

        // for an given array of interger size n , answwer q queries to print
        // the sum of values in a given range of indices from L to R


        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        System.out.println("Enter the " + n + "  elements of the array");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of queries");
        int q = sc.nextInt();


        int[] pref = makePrefixSumArray(arr);

        while (q-- > 0){
            System.out.println("Enter Range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = pref[r]-pref[l-1];
            System.out.println("Sum " + ans);
        }

    }
        static void printArray (int [] arr) {

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    static  int [] makePrefixSumArray(int[] arr){
        int n = arr.length;

        // done using prefix another array
        int [] pref = new int [n];
        pref[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
          //  pref[i]=pref[i-1]+arr[i];
            arr[i] +=arr[i-1];
            // done using another array pref
            // done using same array arr
        }

        return arr;

         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements");
        int n = sc.nextInt();
//        System.out.println("Enter the number of columns");
//        int col = sc.nextInt();

        int arr []  = new int [n];
        System.out.println("Enter " +n+"  elements");

        for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }

        //printarray(arr);
        System.out.println(equalSumParition(arr));

    static  void printarray( int arr[]){
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    static boolean equalSumParition (int [] arr){
        int totalsum = FindArraysum(arr);

        int prefSum=0;

        for (int i = 0; i < arr.length; i++) {
            prefSum +=arr[i];
            int suffixsum = totalsum - prefSum;

            if (suffixsum == prefSum){
                return true;
            }
        }
        return false;
    }

    static int FindArraysum (int [] arr){
        int totalsum =0;
        for (int i = 0; i < arr.length; i++) {
            totalsum+=arr[i];

        }
        return totalsum;
    }
}



         */

        // find span of an array

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr [] = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int span = findmax(arr)-findmin(arr);
        System.out.println("span pf array  "+span );



    static int findmax(int arr[]){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max ;
    }

    static int findmin(int arr[]){
        int min = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min=arr[i];
            }
        }
        return min ;
    }
}



         */

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr [] = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

        for (int floor = max; floor >= 1 ; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


         */


        // addition of two arrays

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a1 [] = new int [n];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int a2 [] = new int[n2];

        for (int i = 0; i < a2.length; i++) {
            a2[i]= sc.nextInt();
        }

        int sum [] = new int[n > n2 ? n :n2];

        int c = 0;

        int i = a1.length-1;
        int j =a2.length-1;
        int k =sum.length-1;

        while (k>=0){
            int d = c;

            if (i >= 0){
                d +=a1[i];
            }
            if (j >= 0){
                d+= a2[j];
            }
            c = d/10;
            d=d%10;

            sum[k] = d;
            i--;
            j--;
            k--;

        }
        if (c !=0){
            System.out.print(c);
        }
        for (int val : sum){
            System.out.print(val);
        }


         */

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a1 [] = new int [n];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int counter = 1;

        for (int i = 0; i < a1.length; i++) {
            for (int j = i+1; j < a1.length ; j++) {
                if (a1[i]==a1[j]) {
                    counter++;
                }
            }
            counter=1;
            System.out.println(a1[i]+"  " +counter);

        }


         */


        /*
        int arr[] = {1, 2, 3, 4};

        /*
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

         */

        /*
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();



         */




















        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

// Create a frequency array to store counts
        int[] freq = new int[1001]; // Assuming the elements are <= 1000

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

// Print the counts
        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] != 0) {
                System.out.println(arr[i] + " occurs " + freq[arr[i]] + " times");
                freq[arr[i]] = 0; // To avoid printing duplicate counts
            }
        }



         */


        // sum of two array using own method

        /*
        int arr [] = {1,2,3,4,5};
        int arr1[] = {5,6,7,8};
        int n1 = arr.length;
        int n2 = arr1.length;
        int [] result = new int [n1>n2 ? n1 :n2];

        for (int i = 0; i < arr.length ; i++) {
         //   result[i]=arr[i]+arr1[i];
            if (i < n1) {
                result[i] += arr[i];
            }
            if (i < n2) {
                result[i] += arr1[i];
            }
        }

        System.out.println("Sum Arrays");


         */

        // rotate an array using extra space
        /*
        int arr [] ={1,2,3,4,5};
        int k = 1;

        int ans [] = rotate(arr,k);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }


        static  int [] rotate ( int [] arr , int k){
        int n = arr.length;
        k =k %n;
        int [] ans = new int [n];
        int j = 0;
            for (int i = n-k; i < n ; i++) {
                ans[j]=arr[i];
                j++;
            }
            for (int i = 0; i < n-k; i++) {
                ans[j] = arr[i];
                j++;
            }
            return ans;
        }

         */

        // program to rotate an array by K elements (BLOCK SWAP ) algorithm


        /*
        int arr [] ={1,2,3,4,5};
        int k = 1;

        rotate(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }




    static void swap (int [] arr, int i , int j ) {

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }

    static void reverse (int [] arr , int st , int end){
        int i = st;
        int j = end;

        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotate(int arr[] , int k){
        int n = arr.length;
        k = k%n;
        if (k < 0){
            k = k+ arr.length;
        }
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    /*
    int arr [] ={1,2,3,4,5};
int k = 1;

rotate(arr,k);
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
}

static void swap (int [] arr, int i , int j ) {
    while (i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }
}

static void reverse (int [] arr , int st , int end){
    int i = st;
    int j = end;

    while (i < j){
        swap(arr,i,j);
        i++;
        j--;
    }
}

static void rotate(int arr[] , int k){
    int n = arr.length;
    k = k%n;
    if (k < 0){
        k = k+ arr.length;
    }
    reverse(arr,0,n-k-1);
    reverse(arr,n-k,n-1);
    reverse(arr,0,n-1);
}

     */


        // Inverse of an array

        /*
        int [] arr = {3,4,1,2,0};
        int [] arr2 = new int[arr.length];

     //   int a =0;
        for (int i = 0; i < arr.length; i++) {
            int v =arr[i];
            // used to store the value of arr in v
            arr2[v]=i;
            //
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"  ");
        }


         */


        // sub arrays of arrays

        /*
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j <arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k]+"  ");
                }
                System.out.println();
            }
        }


         */

        // subsets of an array
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int [] arr = new int[n];
//
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]= sc.nextInt();
//        }
//
//        int limit = (int)Math.pow(2, arr.length);
//
//        for (int i = 0; i < limit; i++) {
//
//            String   set = "";
//            int temp =i;
//            // convert i to binary and use 1's and 0's
//            for (int j = arr.length -1; j >= 0 ; j--) {
//                int r = temp % 2;
//                temp= temp/2;
//
//                if (r == 0){
//                    set ="-\t" +set;
//                }else {
//                    set = arr[j] + "\t" +set;
//                }
//            }
//            System.out.println(set);
//
//        }
//

//
//        int [] arr ={2,7,11,15};
//        System.out.println(twoSum(arr,9));

//        int arr [] ={1,2,2,4,5};
//        int count = arr.length-1;
//        int sum = 0;
//
//        if (count == sorted(arr,count,sum)){
//            System.out.println("Array sorted");
//        }else{
//            System.out.println("Not sorted");
//        }

//        int arr [] ={4,6,3,5,8,2};
//
////        System.out.println(isSorted(arr));
//        int target = 7;
        //       System.out.println(Arrays.toString(TargetSum(arr,target)));


        // using arraylist
//
//        int[] arr = {4, 6, 3, 5, 8, 2};
//        int target = 7;
//        ArrayList<int[]> result = targetSum(arr, target);
//        for (int[] pair : result) {
//            System.out.println(Arrays.toString(pair));
//        }

//        int[] arr = {4, 6, 3, 5, 8, 2};
//        int target = 7;
//        int[][] result = targetSum(arr, target);
//        for (int[] pair : result) {
//            if (pair[0] != -1 && pair[1] != -1) {
//                System.out.println("["+pair[0]+  "," + pair[1]+"]");
//            }
//        }

//        int arr[] = {1,2,3,4,2,1,3};
//
//
//        for ( int i = 0; i < arr.length ; i++){
//            for ( int j = i+1 ; j <arr.length; j++){
//                if (arr[i] == arr[j]){
//                   arr[i] = -1;
//                   arr[j] = -1;
//                }
//
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//
//        int ans = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>0){
//                ans= arr[i];
//            }
//        }
//        System.out.println("Your Unique ans");
//        System.out.println(ans);

        /*
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int N = sc.nextInt();

        // Read the elements of the array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the maximum and second maximum elements in the array
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        // The maximum possible sum of a "fair" subsequence is the sum of the maximum and second maximum elements
        int maxSum = max1 + max2;

        System.out.println(maxSum);
    }
}

         */


//        int arr [] = {1, 2,3 ,4};
//        int max = arr[0];
//
//        for (int i = 0 ; i < arr.length;i++){
//
//            while (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==max){
//                arr[i]=-1;
//            }
//        }
//
//        max = arr[0];
//        for (int i = 0 ; i < arr.length;i++){
//
//            while (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);


//        int [] arr1 ={1,2,3,4};
//
//        findMax(arr1);
//        System.out.println( secondMax(arr1));
//
//        int arr []= {1,5,3,4,6,3,4};
//
//        System.out.println(findreap(arr));


//        int a = 9;
//        int b = 3;
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//
//        System.out.println(a+ "  "+ b    );

//
//        int arr[] = {1,2,3,4,5};
//
////        for ( int i = arr.length-1 ; i >= 0 ; i--){
////            System.out.print(arr[i]+" ");
////        }
//
//        int n = arr.length;
//        int [] ans =new int [n];
//
//        int j = 0;
//
//        for ( int i = n-1 ; i >= 0 ; i --){
//            ans[j++]=arr[i];
//        }

//        int arr[] ={1,2,3,4,5};
//      int  i= 0 ,j = arr.length-1;
//        Swap(arr, i,j);

//        int nums [] ={1,2,3,1,1,3};
//        int count = 0;
//        for ( int i = 1 ; i < nums.length ; i++){
//            if (nums[i]==nums[i-1]){
//                count++;
//            }
//        }
//
//        int arr[] ={3,2,4,7,10,6,5};
//        int [] result = new int[removeEven(arr)];
//
//        int idx =0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] %2 !=0){
//                result[idx++]=arr[i];
//            }
//        }
//
//        System.out.println(Arrays.toString(result));


//        int arr[] = {1, 0, 1, 0, 1, 0, 1};
//        Arrays.sort(arr);
//        int p = 0;
//        for ( int i = 0; i <arr.length;i++){
//            if (arr[i]==0){
//                p++;
//            }
//        }
//        for (int j = 0 ; j < arr.length;j++ ){
//            if (j < p)   {
//                arr[j]=0;
//            }else{
//                arr[j]=1;
//            }
//        }
//        printArray(arr);
//
//    }

        /*
        public void sortArray(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        if (arr[left] == 1) {
            // swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
        } else {
            left++;
        }
    }
}

         */

        int arr [] = {1,0,0,1,0,1,1,0};

        int left = 0;
        int right = arr.length-1 ;

        while (left < right){
            if (arr[left]==1 && arr[right]==0){
                int temp =arr[left];
                arr[left] =arr[right];
                arr[right]= temp;
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
        printArray(arr);
    }

    static void printArray( int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

//    static  int removeEven ( int [] arr){
//        int oddcount=0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 !=0){
//                oddcount++;
//            }
//        }
//        return oddcount;
//    }



//    static int findreap (int arr[]) {
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    return arr[i];
//                }
//            }
//        }
//        return -1;
//
//    }
//    static int[][] targetSum(int[] arr, int target) {
//        int[][] pairs = new int[arr.length][2];
//        for (int i = 0; i < pairs.length; i++) {
//            pairs[i][0] = -1;
//            pairs[i][1] = -1;
//        }
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    pairs[index][0] = i;
//                    pairs[index][1] = j;
//                    index++;
//                }
//            }
//        }
//        return pairs;
//    }

//    static ArrayList<int[]> targetSum(int[] arr, int target) {
//        ArrayList<int[]> pairs = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    pairs.add(new int[]{i, j});
//                }
//            }
//        }
//        return pairs;
//    }


//    static int [] TargetSum ( int arr [] , int target){
//
//        for ( int i = 0; i < arr.length ; i ++){
//            for ( int j = i +1 ; j< arr.length;j ++) {
//                if (arr[i] + arr[j] == target){
//                    return new int[]{i , j};
//
//                }
//            }
//        }
//        return null;
//
//    }

//    static boolean isSorted (int [] arr){
//        boolean check = true;
//
//        for (int i = 1; i < arr.length ; i++) {
//            if (arr[i] < arr[i-1] ){
//                check = false;
//
//            }
//
//        }
//        return check;
//    }

//    static int sorted (int arr[] , int count , int sum){
//
//
//        for (int i = 1; i < arr.length ; i++){
//            for ( int j = i-1 ; i < arr.length ; i++){
//                if (arr[j] <= arr[i])
//                {
//                    sum++;
//
//                }
//                else {
//                    return -1;
//                }
//            }
//        }
//        return sum;
//    }

//    static int[] twoSum(int[] nums, int target) {
//
//        for(int i = 0; i <  nums.length;  i++){
//            for (int j = 1 ; j <nums.length ; j++){
//                if (nums[i] + nums[j] == target){
//                    return new int [] {i,j};
//                }
//            }
//        }
//        return null;
//
//    }

}
























//    public static void reverse (int [] arr) {
//        int i =0;
//        int j =arr.length-1;
//
//        while (i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }
//    }






