public class oopsoneshot {

    public static class Student {

        String name;
        int rno;
        double percent;
        public Student (String naam , int roll , double per){
            name =naam;
            rno=roll;
            percent =per;
        }

        public Student(){

        }


    }
    public static void change (Student s){
        s.name="Rohan";
    }
    public static void main(String[] args) {
//        s.name ="Rohan";

        Student s1 = new Student();

        s1.percent= 88.6;
        s1.name= "rag";
        s1.rno=76;

        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);

        Student s2 = new Student();

    }
}
