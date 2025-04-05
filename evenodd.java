// package collagejavapro;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER NUMBER FOR CHECKING=");
        int num=input.nextInt();
        if((num/2)*2==num){
            System.out.println(num + " is a even number ");
        }
        else
        {
            System.out.println("odd number");
        }

    }
}
