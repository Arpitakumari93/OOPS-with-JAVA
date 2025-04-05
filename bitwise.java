// package collagejavapro;

import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        int a = sc.nextInt();
        System.out.print("Enter number=");
        int b = sc.nextInt();
        System.out.print("Enter bitwise operation(|,&,^)=");
        char opr = sc.next().charAt(0);
        int res;
        switch (opr) {
            case '|':
                res = a | b;
                System.out.println(a + "|" + b + "=" + res);
                break;
            case '^':
                res = a | b;
                System.out.println(a + "^" + b + "=" + res);
                break;
            case '&':
                res = a & b;
                System.out.println(a + "&" + b + "=" + res);
                break;

            default:
                System.out.println("Wrong  operation");
                break;
        }
    }
}
