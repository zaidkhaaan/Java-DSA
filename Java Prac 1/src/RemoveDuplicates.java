import java.util.Scanner;

public class RemoveDuplicates
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             while (n<1 || n>10)
             {
                 System.out.println(n+ "Is not between 1 and 10.Try again:");
                 n = sc.nextInt();
             }
            System.out.println(n+" is between 1 and 10.");
        }

}



