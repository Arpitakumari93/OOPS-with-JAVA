// package collagejavapro;

import java.util.Scanner;

public class largeoftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER FOR A=");
        int a=sc.nextInt();
        System.out.print("ENTER NUMBER FOR B=");
        int b=sc.nextInt();
        String res=(a>b)? "yes":"noo";
        System.out.println(res+a+"is greater number");
        System.out.println(res+a+"is not a grester number");
    }
}
