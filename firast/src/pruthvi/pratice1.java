package pruthvi;
import java.util.Scanner;
public class pratice1 {
    public static void main(String[] args){
        int mark1;
        int mark2;
        int mark3;
        int mark4;
        int mark5;
        float averageMark;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter maths mark:");
        mark1 = sc.nextInt();
        System.out.println("enter science mark:");
        mark2 = sc.nextInt();
        System.out.println("enter history mark:");
        mark3 = sc.nextInt();
        System.out.println("enter english mark:");
        mark4 = sc.nextInt();
        System.out.println("enter hindi mark:");
        mark5 = sc.nextInt();
        averageMark=(mark1+mark2+mark3+mark4+mark5)/5f;
        System.out.print("average mark is :");
        System.out.println(averageMark);
    }
}
