package oops.smartprogramming;


public class Animal {


    String color;
    int age ;
    public void eat (){
        System.out.println("I am eating");
    }

    void intobject(String c , int a){
        color = c;
        age = a;
    }

    void display (){
        System.out.println(color +" "+age);
    }
    public static void main(String[] args) {
//        System.out.println(1);
//        practise qwe = new practise();
//        qwe.eat();
//        birds crow = new birds();
//        crow.fly();



//        Animal buzo = new Animal();
//        buzo.color = "pink";
//        buzo.age=19;
//
//        System.out.println(buzo.color+" "+buzo.age);

        Animal buz = new Animal();
        buz.intobject("blue", 10);
        buz.display();
    }
}

class birds {
    void fly(){
        System.out.println("i am flying with wings");
    }
}
