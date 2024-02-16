public class RotateArr {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;


    }
    public static void rotate (int [] a, int k ){

        k = k % a.length;

        if( k<0){
            k=k+ a.length;
        }
        // part 1

        reverse ( a,0, a.length-k-1);
        reverse(a,a.length-k, a.length -1);
        reverse(a,0,a.length-1 );
    }

    public static void reverse(int[] a, int i, int j) {
        int li = i;
        int ri = j;

        while (li < ri) {
            int temp = li;
            a[li] = a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
