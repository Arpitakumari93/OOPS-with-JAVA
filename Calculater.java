import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter operation like(add,sub,mul,div mod) :");
        char opr=sc.next().charAt(0);
        System.out.print("Enter number =");
        int num1=sc.nextInt();
        System.out.print("Enter number =");
        int num2=sc.nextInt();
        int res;
        switch (opr) {
            case '+':
                res=num1+num2;
                System.out.println(num1+" + "+num2+" = "+res);
                break;
        
            case '-':
                res=num1-num2;
                System.out.println(num1+" - "+num2+" = "+res);
                break;
        
            case '*':
                res=num1*num2;
                System.out.println(num1+" * "+num2+" = "+res);
                break;
        
            case '/':
                res=num1/num2;
                System.out.println(num1+" / "+num2+" = "+res);
                break;
        
            case '%':
                res=num1%num2;
                System.out.println(num1+" % "+num2+" = "+res);
                break;
        
            default:
            System.out.println("default");
                break;
        }
    }
}
