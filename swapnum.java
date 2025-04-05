// package collagejavapro;

import java.util.Scanner;

public class swapnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Value befor swaping");
        System.out.print("Enter first number=");
        int a=sc.nextInt();
        System.out.print("Enter secound number=");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value after swaping");
        System.out.println("now value of a is="+a);
        System.out.println("now value of b is="+b);
    }
}
