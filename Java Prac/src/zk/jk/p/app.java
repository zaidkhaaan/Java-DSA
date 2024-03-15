package zk.jk.p;
// undesrtanding packages

public class app {

   private String str1= "I am a public member";

    void printfromClass(){
        System.out.println("Within Class " +str1);
    }
    public static void main(String[] args) {
        app obj = new app();
        obj.printfromClass();
        System.out.println("Within Class "+obj.str1);

        app2 obj2 = new app2();
        obj2.printfromoutsideclass();

    }
}

class app2 {
    void printfromoutsideclass(){
        app obj = new app();
        System.out.println("Within Package , But outside class " + obj.str1);



    }
}
