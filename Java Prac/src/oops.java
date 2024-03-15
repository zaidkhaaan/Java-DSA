import java.util.Scanner;

public class oops {
    public static void main(String[] args) {
        Algebra obj = new Algebra(5,7); // constructor
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y =sc.nextInt();

        System.out.print("Sum of numbers is : ");
        int ans = obj.add();
        System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.mul());

        Algebra obj2 = new Algebra(3,7);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
    }
}

class Algebra {

    int a ;
    int b;

    Algebra(int x , int y){
        System.out.println("Constructor called");
        a=x;
        b=y;

    }
    int add (){
        int ans = a+b;
        return ans;
    }

    int sub (){
        int sub = a-b;
        return sub;
    }


    int mul (){
        int mul = a*b;
        return mul;

    }

    int div (){
        int div = a / b;
        return div;
    }

}