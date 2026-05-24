import java.sql.SQLOutput;
import java.util.Scanner;
public interface grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks");
        int marks =sc.nextInt();
        System.out.println(grade(marks));
    }
            static String grade(int marks){
                if(marks>=91 && marks <=100){
                    return "AA";

                }
                else if(marks>=81 && marks<=90){
                    return "AB";
                }
                else if(marks>=71 && marks<=80){
                    return "bB";
                }
                else if(marks>=61 && marks<=70){
                    return "BC";
                }
                else if(marks>=51 && marks<=60){
                    return "CD";
                }
                else if(marks>=41 && marks<=50){
                    return "DD";
                }
                else{
                    return "fail";
                }
            }
}
