import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println(factorial(num));

    }

    static int factorial(int num) {
        int fact = 1;
        int n = 1;
        while (n <= num) {
            fact *= n;
            n++;


        }
        return fact;

    }
}
