package arrays;

import java.util.Scanner;

public class ArrayWithBinarySearch {

    public static void main(String[] args) {

        // binary search
        /*
        int [] arr ={10,20,30,40,50,60,70,80,90,100};
        int data =70;
        int l =0;
        int h =arr.length-1;

        while(l<=h){
            int m = (l+h)/2;

            if (data>arr[m]){ // arr[m] ???
                l=m+1;
            } else if (data <arr[m]) {
                h=m-1;
            }else{
                System.out.println(m);
                return;
            }
        }

         */
        // revise
        // low --> floor (lower bound)
        // high --> ciel (higher bound)


        /*
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int [] arr = new int [a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();

        int l =0;
        int h =arr.length-1;
        int ciel =0;
        int floor =0;

        while(l<=h){
            int m = (l+h)/2;

            if (data>arr[m]){ // arr[m] ???
                l=m+1;
                floor=arr[m];
            } else if (data <arr[m]) {
                h=m-1;
                ciel=arr[m];
            }else{
                ciel = arr[m];
                floor =arr[m];
                break;
            }
        }
        System.out.println(ciel);
        System.out.println(floor);


         */

        // binary search eith repeated element to find out first and last index
        /*

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int [] arr = new int [a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        int fi = -1; // First index = fi

        while (left <= right) {
            int mid = (left + right) / 2;
            if (data > arr[mid]) {
                left = mid + 1;
            } else if (data < arr[mid]) {
                right = mid - 1;
            } else  {
                fi = mid;
                right = mid - 1;
            }
        }

        left = 0;
        right = arr.length - 1;
        int li = -1; // last index = li
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data > arr[mid]) {
                left = mid + 1;
            } else if (data < arr[mid]) {
                right = mid - 1;
            } else  {
                li = mid;
                left = mid + 1;
            }
        }


         */
    }
}
