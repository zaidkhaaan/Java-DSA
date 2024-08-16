package oops.smartprogramming;

public class Test {
//    int i ;
//    // complier uses default constructor and assign the instace variable to 0;
//    String s;


    // no argument constructor

//Test(int a){
//        System.out.println("no argument found");
//    }

    int i ;

    void setValue(int i){
        this.i=i;
    }

    void show (){
        System.out.println(i);
    }
    public static void main(String[] args) {
        Test t = new Test();
      t.setValue(10);
      t.show();
//        System.out.println(t.i+" "+t.s);
    }
}
