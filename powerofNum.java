import java.util.Scanner;

public class powerofNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number=");
        int n=sc.nextInt();

        if(n>0&&(n&(n-1))==0)
        {
            System.out.println("this is power of two");
        }
        else{
            System.out.println("this is not power of two");
        }
        sc.close();
    }
    
}
