import java.util.Scanner;

public class Swap {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for first=");
        int n=sc.nextInt();
        System.out.print("Enter number for first=");
        int m=sc.nextInt();
        n=m+n;
        m=n-m;
        n=n-m;
        System.out.println(n+","+m);
        sc.close();
    }
    
}
