import java.net.StandardSocketOptions;
import java.util.Scanner;
public class even_odd {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();
        evenodd(num);

    }




    static void evenodd(int num) {

        if (num%2 == 0) {
            System.out.println(num +"is even");
        } else {
            System.out.println(num +"is odd");
        }


    }


}

