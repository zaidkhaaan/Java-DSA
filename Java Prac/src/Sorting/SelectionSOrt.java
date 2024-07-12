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


        int num[] = {6, 5, 2, 8, 9, 4};
        int size = num.length;
        int temp = 0;
        int minindex;

        System.out.println("Before Sorting");
        for (int nums : num) {
            System.out.print(nums + " ");
        }

        for (int i = 0; i < size - 1; i++) {
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
