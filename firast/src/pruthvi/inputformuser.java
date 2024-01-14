package pruthvi;

import java.util.Scanner;
public class inputformuser {
    public static void main(String[] args){
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter first number:");
        int p = sc.nextInt();
        System.out.print("enter second number:");
        int r = sc.nextInt();
        int sum = p + r;
        System.out.print("sum of two number :");
        System.out.println(sum);
    }
}