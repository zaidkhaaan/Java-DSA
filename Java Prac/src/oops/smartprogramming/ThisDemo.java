package oops.smartprogramming;

public class ThisDemo {

   ThisDemo m1 (){
      return this;
    }


    public static void main(String[] args) {
       ThisDemo t = new ThisDemo();
       t.m1();
    }
}

