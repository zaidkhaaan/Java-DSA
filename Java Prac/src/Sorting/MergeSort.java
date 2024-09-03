package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        // Merge sort algorithm
        int arr1[] ={1,2,3};
        int arr2[] = {4,5,6};

       int ans [] =  mergeTwoSortedArray(arr1,arr2);
       print(ans);




    }

    public static int[] mergeSort ( int [] arr , int lo , int hi){

        if (lo == hi){
            int [] ba = new int[1];
            ba[0]= arr[lo];
            return ba;
        }
        int mid = (lo+hi)/2;
        int [] fsh= mergeSort(arr,lo,mid);
        int [] ssh = mergeSort(arr,mid+1,hi);
        int [] fsa = mergeTwoSortedArray(fsh,ssh);
        return fsa;
    }

    public static int[] mergeTwoSortedArray ( int [] a, int[] b){
        System.out.println(" Merging Two sorted arrays");
        System.out.println("Left array --->");
        print(a);
        System.out.println("Right array --->");
        print(b);
        int i =0 , j= 0, k = 0;
        int [] ans = new int[a.length+b.length];

        while (i<a.length && j<b.length){
            if (a[i] <= b[j]){
                ans[k]=a[i];
                i++;
                k++;
            }else{
                ans[k]=b[j];
                j++;
                k++;
            }
        }
        while (i < a.length){
            ans[k]=a[i];
            k++;
            i++;
        }

        while (j < b.length) {
            ans[k] = b[j];
            k++;
            j++;
        }

        return ans;
    }

    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
