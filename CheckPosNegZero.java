// package collagejavapro;

import java.util.Scanner;

public class CheckPosNegZero {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check :");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("This is positive number");
        }
        else if(num==0)
        {
            System.out.println("this is zero");
        }

        else {
            System.out.println("This is negative number");
        }
    }
}
