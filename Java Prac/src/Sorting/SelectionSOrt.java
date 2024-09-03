package Sorting;

public class SelectionSOrt {
    public static void main(String[] args) {
//             int num[] = {6,5,2,8,9,4};
//             int size = num.length;
//             int temp = 0;
//             int minindex=-1;
//
//
//        System.out.println("Before Sorting");
//        for (int nums:num) {
//            System.out.print(nums+" ");
//        }
//
//
//        for ( int i =0; i < size-1;i++){
//            minindex=i;
//            for (int j = i+1 ; j < size;j++){
//               if (num[minindex]>num[j]){
//                   minindex=j;  // will give us the minimum value
//               }
//
//               // will swap it at correct location
//
//               temp=num[minindex];
//               num[minindex]=num[i];
//               num[i]=temp;
//
//
//                System.out.println();
//                for (int nums:num) {
//                    System.out.print(nums+" ");
//                }
//                System.out.println();
//
//            }
//        }
//
//
//        System.out.println();
//        System.out.println("After Sorting");
//
//        for (int nums:num) {
//            System.out.print(nums+" ");
//        }




        int num[] = {5,9,8,1,2};
        int size = num.length;
        int temp = 0;
        int minindex;

        System.out.println("Before Sorting");
        for (int nums : num) {
            System.out.print(nums + " ");
        }

          /*
        STEP 1: FOR EVERY SELECTION SORT ALGO THE NUMBER OF ITERATION WILL ALWAYS BE ARRAY LENGTH -1;
         */

        for (int i = 0; i < size - 1; i++) {

            /*

            TO find the smllaest element in first ieration
            to find second smallest element in the second iteration

            pointer minindex & pointer i are diffrent
            step 1) assign the minindex -->
            step 2) assign the 2nd(jth) for loop start with i+1 next element
            step 3) compare all the elements from jtth till the end of the loop to check
            for the minimum index (smallest element index) and assign the jth pointer to the
            min index (smallest element from the array will be selected among all the elements)

            step 4) MOST IMP ---> After getting the minindex replace it with the ith location which
            will update as per iteration and will only go till length-1 i.e only length -1 swaps will be made
            and last swap will not happen as the largest element will be in its right place because
            this sorting technique is ascending in nature

             */
            minindex = i;
            for (int j = i + 1; j < size; j++) {
                if (num[minindex] > num[j]) {
                    minindex = j; // Update minindex to find the smallest element
                }
            }

            // Swap the smallest element with the current position
            temp = num[minindex];
            num[minindex] = num[i];
            num[i] = temp;

            System.out.println();
                for (int nums:num) {
                    System.out.print(nums+" ");
                }
                System.out.println();



        }

        System.out.println("\nAfter Sorting");
        for (int nums : num) {
            System.out.print(nums + " ");

        }
    }



}
