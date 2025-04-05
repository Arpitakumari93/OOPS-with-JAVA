// package collagejavapro;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for a :");
        int num1=sc.nextInt();
        System.out.print("Enter number for b :");
        int num2=sc.nextInt();
         int max=Math.max(num1,num2);
         System.out.println("the maximum number " + max);
    }
    
}
