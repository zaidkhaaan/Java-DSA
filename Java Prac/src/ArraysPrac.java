import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.function.IntConsumer;

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

        Arrays.sort(arr);
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
        Arrays.asList(arr);
         //int n1 = arr.asList();
        System.out.println(arr);

 */


        // studying the methods in Array Class
      //  int intArr[] = { 10, 20, 15, 22, 35 };


        // exp:1
        // To convert the elements as List
        /*
        System.out.println("Integer Array as List: "
                + Arrays.asList(intArr));
         */

        /* EXP :- 2
        String[] array = new String[] {"A", "B", "C", "D"};
        List<String> list = Arrays.asList(array);
        System.out.println("The list is: " + list);
         */

        /*
        String arr [] = {"a","z","b","e","c"};

        Arrays.sort(arr);

         */


        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
         */
       // System.out.println(Arrays.toString(arr));

        /*
        int [] Intarr = { 10, 20, 15, 22, 35 };

        Arrays.sort(Intarr);

        int intkey = 35;

        // Print the key and corresponding index
        System.out.println(intkey + " found at index = "  + Arrays.binarySearch(Intarr ,intkey));
         */


        /*
        int  [] intArr1 = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr1);

        int intKey = 22;

        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr1, 0, 4, intKey));


         */

        // Get the Array

        /*
        int array1 [] = { 1,2,3,4,5,6,7,8,9 ,10};

        // Get the second Array
        int array2 [] = { 10, 15, 22 ,100,14,34,56,65,32};

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compare(array1, array2));

         */


        /*
        int zaid [] = { 10, 20, 15, 22, 35 };

        // To print the elements in one line
        System.out.println("Integer Array: "
                + Arrays.toString(zaid));

        System.out.println("\nNew Arrays by copyOf:\n");

        System.out.println("Integer Array: "
                + Arrays.toString(
                Arrays.copyOf(zaid, 10)));
         */

        // Get the Arrays

        /*
        int zaid1[][] = { { 10, 20, 15, 22, 35 } };

        // Get the second Arrays
        int zaid2[][] = { { 10, 20, 15,22,35 } };

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.deepEquals(zaid1, zaid2));
         */

        /*
        int[][] a1 = {{10, 20}, {40, 50}, {60, 70}};
        int[][] a2 = {{30, 20}, {10, 0}, {60, 80}};
        int[][] a3 = {{10, 20}, {40, 50}, {60, 70}};

        System.out.println("Check if a1 is equal to a2: " + Arrays.deepEquals(a1, a2));
        System.out.println("Check if a2 is equal to a3: " + Arrays.deepEquals(a2, a3));
        System.out.println("Check if a1 is equal to a3: " + Arrays.deepEquals(a1, a3));

         */

        /*
        int intArr[][] = { { 10, 20, 15, 22, 35 } };

        // To get the dep hashCode of the arrays
        System.out.println("Integer Array: "
                + Arrays.deepHashCode(intArr));

         */


        /*
        int intArr1234[][] = { { 10, 20, 15, 22, 35 } };

        // To get the dep hashCode of the arrays
        System.out.println("Integer Array: "
                + Arrays.deepHashCode(intArr1234));
         */

        /*
        // Initializing an object array
        Object[] ob = { "tuts", "point" };

        // deepToString for object ob
        System.out.println("Deep String version: " + Arrays.deepToString(ob));
         */


        /*
        int intArr123[] = { 10, 20, 15, 22, 35 };

        // Get the second Arrays
        int intArr321[] = { 10, 20,15,22,35};

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.equals(intArr123, intArr321));
         */


        /*
        int intArr[] = { 10, 20, 15, 22, 35 };

        int intKey = 22;

        Arrays.fill(intArr, intKey);

        // To fill the arrays
        System.out.println("Integer Array on filling: "
                + Arrays.toString(intArr));

         */


        /*

        int intArr[] = { 10, 20, 15, 22, 35 };

        // Get the second Arrays
        int intArr1[] = { 10, 20, 22 };

        // To compare both arrays
        System.out.println("The element mismatched at index: "
                + Arrays.mismatch(intArr, intArr1));

         */

        /*

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Spliterator.OfInt spliterator = Arrays.spliterator(array);

        // Use tryAdvance() to print elements

        while(spliterator.tryAdvance((IntConsumer) (n) -> System.out.println(n)));


         */



        /*
        String[] array = {"apple", "banana", "cherry"};

        Stream<String> stream = Arrays.stream(array);
        stream.forEach(System.out::println);

         */

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

       // System.out.println(str.length());



        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length() ; j++) {

                    System.out.println(str.substring(i,j)+" ");
                }
            }
        System.out.println();


        }







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






