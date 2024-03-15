package zk.jk.p;

public class OutsidePackage {


    public static void main(String[] args) {
        app obj = new app();
        System.out.println("Outside Package , non-child class "+ obj.str1);
        app3 obj3 = new app3();
        obj3.printfromchildclass();

    }
}

class app3 extends app
// app3 child class // app parent class

{
void printfromchildclass(){
    app3 obj3 = new app3();
    System.out.println("Child Class "+obj3.str1);
}

}