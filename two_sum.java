import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;
public class two_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no");
        int a=sc.nextInt();
        System.out.println("enter the 2nd no");
        int b= sc.nextInt();
        System.out.println(sum(a,b) +":sum of this two num");
        System.out.println(prd(a,b) +":product of the two number is");
    }
        static int sum(int a,int b){
            int result=a+b;
            return result;
        }
        static int prd(int a,int b){
            int product = a*b;
            return product;
        }
}
