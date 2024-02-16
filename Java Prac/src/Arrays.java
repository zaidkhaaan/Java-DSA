import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        int [] sum = new int[n1 > n2 ? n1:n2 ];


        int c =0;

        int i = a1.length-1;
        int j = a2.length -1;
        int k = sum.length-1;

        while (k >= 0){
            int d =c;

            if (i>=0){
                 d+=a1[i];

            }
            if (j>=0){
                d+=a2[j];
            }

            c=d/10;
            d=d%10;
            sum[k]=d;

            i--;
            j--;
            k--;

        }
        if( c!=0){
            System.out.println(c);
        }
        for (int val:sum){
            System.out.println(val);
        }
    }
}

/*
  int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >max){
                max=arr[i];
            }
        }

        for (int floor = max ; floor>=1 ; floor--){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

        }

 */

   /*
        find an element in array
        int idx =-1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==n1){
                idx=i;
                break;
            }
        }
        System.out.println(idx);

         */

/*

span of an array logic
        int max = arr[0];
        int min =arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                max =arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        int span =max-min;
        System.out.println(span);

 */

