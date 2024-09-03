package CodeBIX.Bitmanipulation;

public class bitM_Assing {
    public static void main(String[] args) {
        // to find the RSB in minimum operation
        int n = 7;
//        int rsb = n&(-n);  // n&(1+(~n)) // (1+(~n)) --> 2's complement --> negative of no

        // calmning algorithm

        int count = 0;

        while (n > 0){
            int rsb = ~(n&(-n));
            n=n&rsb;
            count++;
        }
        System.out.println(count);
    }
//    static int rsbef ( int n , int rsb){
//        int count = 0;
//        while (n > 0){
//
//        }
//    }


    // RSB using O(32) operations we have to find the optimal approach
    static int  rsbmask( int n ){
        int indexofrsb = -1;
        for (int i = 0; i < 32; i++) {
            int mask = 1<<i;
            if ((n&(mask))!=0){
                indexofrsb = i;
                break;
            }
        }
        return (1<<indexofrsb);
    }
}
