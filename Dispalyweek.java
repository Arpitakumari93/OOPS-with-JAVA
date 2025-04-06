import java.util.Scanner;

public class Dispalyweek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to print week=");
        int num = sc.nextInt();
        String week = "";
        switch (num) {
            case 1:
                week = "sunday";
                System.out.println(week);
                break;
            case 2:
                week = "monday";
                System.out.println(week);
                break;
            case 3:
                week = "tuesday";
                System.out.println(week);
                break;
            case 4:
                week = "wednesday";
                System.out.println(week);
                break;
            case 5:
                week = "thursday";
                System.out.println(week);
                break;
            case 6:
                week = "friday";
                System.out.println(week);
                break;
            case 7:
                week = "saturday";
                System.out.println(week);
                break;

            default:
                System.out.println("this is invalid input");
                break;
        }

    }
}
