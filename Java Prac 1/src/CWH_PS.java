import java.util.Scanner;

public class CWH_PS
{
    public static void main(String[] args)
    {
        System.out.println("CBSE PERCENTAGE MAKER");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks of the subject (Eg:- 100,80):");
        int total_marks = sc.nextInt();

        System.out.println("Enter total marks of the subject 1:-  (Eg:- 100,80):");
        float s1 = sc.nextFloat();

        System.out.println("Enter total marks of the subject 2:-  (Eg:- 100,80):");
        float s2 = sc.nextFloat();

        System.out.println("Enter total marks of the subject 3:-  (Eg:- 100,80):");
        float s3 = sc.nextFloat();

        System.out.println("Enter total marks of the subject 4:-  (Eg:- 100,80):");
        float s4 = sc.nextFloat();

        System.out.println("Enter total marks of the subject 5:-  (Eg:- 100,80):");
        float s5 = sc.nextFloat();

         float total =(s1+s2+s3+s4+s5);

         float grandtotal = total * 100 / (total_marks*5) ;


        System.out.println("Your total percentage ="  +grandtotal+ "percentage");
        System.out.println("BY ZAID ");












    }
}
