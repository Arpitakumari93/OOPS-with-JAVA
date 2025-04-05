// package collagejavapro;

import java.util.*;

public class basicairopr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number=");
        int a = sc.nextInt();
        System.out.println("Enter second number=");
        int b = sc.nextInt();
        System.out.println("Enter the operation between(+,-,*,/,%)");
        char opr = sc.next().charAt(0);
        int res;
        switch (opr) {
            case '+':
                res = a + b;
                System.out.println(a + " + " + b + " = " + res);
                break;
            case '-':
                res = a - b;
                System.out.println(a + " - " + b + " = " + res);
                break;
            case '*':
                res = a + b;
                System.out.println(a + " * " + b + " = " + res);
                break;
            case '/':
                res = a / b;
                System.out.println(a + " / " + b + " = " + res);
                break;
            case '%':
                res = a % b;
                System.out.println(a + " % " + b + " = " + res);
                break;

            default:
                System.out.println("wrong input");
                break;
        }

    }

}
