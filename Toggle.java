import java.util.*;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        System.out.print("enter word=");
        char ch = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("enter String=");
        String str = sc.nextLine();

        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            res.append((char) (c ^ 32));

        }
        ch = (char) (ch ^ 32);
        System.out.println(ch);
        System.out.println(res.toString());
        sc.close();

    }

}
