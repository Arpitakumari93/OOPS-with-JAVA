// package collagejavapro;

import java.util.Scanner;

public class CheckPos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check :");
        int num=sc.nextInt();

        if(num>=0){
            System.out.println("This is positive number");
            
        }

        // else{
        //     System.out.println("This is negative number");
        // }
    }
}
