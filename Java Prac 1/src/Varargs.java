import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {
        fun(2,3,4,5,67,89,9,10,11,12,13,14);
        multiple(1,2,"zaid","zkjk","pathan");
    }

    static void multiple(int a , int b ,String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
