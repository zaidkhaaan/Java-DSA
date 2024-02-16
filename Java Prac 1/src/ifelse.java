import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
        if(a>18){
            System.out.println("You are experience");
        } else if (a>46) {
            System.out.println("you are semi experienced");
        } else if (a>36) {
            System.out.println("you are semi semi experienced");
        } else {
            System.out.println("You are not experienced ");
        }
    }
}
