package oops.smartprogramming;

class A{

     void showA(){
        System.out.println("a class method");
    }

}

class b extends A {

    void showB(){
        System.out.println("b class method");
    }

}

class c extends b{

    void showC(){
        System.out.println("c class method");
    }
    public static void main(String[] args) {
//        A obj = new A();
//        obj.showA();
////        obj.showB();
//        b obj1 = new b();
//        obj1.showB();
//        obj1.showA();

        c obj2 = new c();
        obj2.showA();
        obj2.showB();
        obj2.showC();
    }
}
