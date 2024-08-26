package CodeBIX.Bitmanipulation;

public class DSA_Master_class {

    public static void main(String[] args) {
//
//        int n = 8;
        int i = 2;
//        bit(n,i);

//        int n1 = 10;
//        String BinaryString = Integer.toBinaryString(n1);
//        System.out.println(BinaryString);

        int n1 = 10;
        int x = 0;

        int arr[] = new int[32];

        while (x<32){
            int mask = 1<<x;
            x=n1&mask;
            arr[32-x]=x;
            x++;

        }
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] == 1){
                count++;
            }
        }
        System.out.println(count);

//        int x = 10;
//        int y = 20;


//        int n1 = 24;
//
//
//        int x = 0;
//
//        int arr[] = new int[32];
//
//        while (x<32){
//
//            arr[32-x]=x;
//            x++;
//
//        }







    }

    static void bit ( int i , int j){

        int mask =  1<<j;

        if ((i&mask)==0){
            System.out.println("OFF");
        }else{
            System.out.println("ON");
        }

    }
}
