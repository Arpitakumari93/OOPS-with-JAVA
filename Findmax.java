import java.util.Scanner;

public class Findmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number=");
        int a=sc.nextInt();
        
        System.out.print("Enter number=");
        int b=sc.nextInt();
         int max=Math.max(a,b);
         System.out.println(max);

        sc.close();

    }
    
}
