import java.util.Scanner;

public class basemul1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int product = getProduct(b, n1, n2);
        System.out.println(product);
    }

    public static int getProduct(int b, int n1, int n2) {
        int result = 0;
        int p = 1;

        while (n2 > 0) {
            int digit2 = n2 % 10;
            n2 /= 10;

            int singleDigitProduct = getProductWithSingleDigit(b, n1, digit2);
            result = getSum(b, result, singleDigitProduct * p);
            p *= 10;
        }
        return result;
    }

    public static int getProductWithSingleDigit(int b, int n1, int digit2) {
        int result = 0;
        int carry = 0;
        int p = 1;

          while (n1 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            n1 /= 10;

            int product = digit1 * digit2 + carry;
            carry = product / b;
            product %= b;

            result += product * p;
            p *= 10;
        }

        return result;
    }

    public static int getSum(int b, int n1, int n2) {
        int result = 0;
        int carry = 0;
        int p = 1;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int sum = digit1 + digit2 + carry;
            carry = sum / b;
            sum %= b;

            result += sum * p;
            p *= 10;
        }

        return result;
    }
}
