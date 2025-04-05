// package collagejavapro;

import java.util.*;

public class incredcre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER FOR A=");
        int a = sc.nextInt();
        System.out.print("ENTER NUMBER FOR B=");
        int b = sc.nextInt();
        if (a <= b) {
            a++;
            b++;

            System.out.println(a);
            // System.out.println(b);
        } else {
            b++;
            System.out.println(b);
        }
    }
}
